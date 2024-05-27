package codegeneration;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.FunctionInvocation;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.Type;
import ast.types.VoidType;
import util.CodeGenerator;
import util.ReturnArgumentsDTO;

import java.util.ArrayList;
import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<ReturnArgumentsDTO,Void> {

    private CodeGenerator cg;
    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;
    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg = cg;
        this.addressCGVisitor = new AddressCGVisitor(cg);
        this.valueCGVisitor = new ValueCGVisitor(cg);
        this.addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        this.valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
    }

    /*
    * execute[[Read: statement1 -> expression1]] =
    *   <' * Read>
    *   value[[expression1]]
    *   <in> expression1.type.suffix()
    *   <store> expression1.type.suffix()
    */
    public Void visit(Read read, ReturnArgumentsDTO param){
        cg.newLine();
        cg.addLineOfCode("#line\t" + read.getLine());
        cg.addLineOfCode("' * Read");

        read.getExpression().accept(this.valueCGVisitor, null);
        cg.addLineOfCode("in"+read.getExpression().getType().suffix());
        cg.addLineOfCode("store" + read.getExpression().getType().suffix());
        return null;
    }

    /*
    * execute[[Write: statement -> expression1]] =
    *   <' * Write>
    *   value[[expression1]]
    *   <out> expression1.type.suffix()
    */
    @Override
    public Void visit(Write write, ReturnArgumentsDTO param){
        cg.newLine();
        cg.addLineOfCode("#line\t" + write.getLine());
        cg.addLineOfCode("' * Write");

        write.getExpression().accept(this.valueCGVisitor, null);
        cg.addLineOfCode("out" + write.getExpression().getType().suffix());
        return null;
    }

    /*
    * execute[[Assignment: statement -> expression1 expression2]] =
    *   address[[expression1]]
    *   value[[expression2]]
    *   <store> expression1.type.suffix()
    */
    public Void visit(Assignment assignment, ReturnArgumentsDTO param){
        cg.newLine();
        cg.addLineOfCode("#line\t" + assignment.getLine());
        cg.addLineOfCode("' * Assignment");

        assignment.getLeft().accept(this.addressCGVisitor, null);
        assignment.getRight().accept(this.valueCGVisitor, null);
        cg.addLineOfCode("store" + assignment.getLeft().getType().suffix());
        return null;
    }

    /*
    * execute[[Program: program -> varDefinition* funcDefinition*]] =
    *   <' * Global variables>
    *   <call main>
    *   <halt>
    *   definition*.forEach(varDef -> execute[[varDef]]);
    */
    @Override
    public Void visit(Program program, ReturnArgumentsDTO param){
        List<VariableDefinition> variableDefinitions = new ArrayList<>();
        List<FuncDefinition> funcDefinitions = new ArrayList<>();

        program.getDefinitions().forEach(definition -> {
            if(definition instanceof VariableDefinition) variableDefinitions.add((VariableDefinition) definition);
            else if(definition instanceof FuncDefinition) funcDefinitions.add((FuncDefinition) definition);
        });

        cg.addLineOfCode("' * Global variables");
        variableDefinitions.forEach(variableDefinition -> variableDefinition.accept(this,null));
        cg.newLine();
        cg.addLineOfCode("' Invocation to the main function");
        cg.addLineOfCode("call main");
        cg.addLineOfCode("halt");
        cg.newLine();
        funcDefinitions.forEach(funcDefinition -> funcDefinition.accept(this, null));
        return null;
    }

    /*
    * execute[[VariableDefinition: varDefinition -> type ID]] =
    *   <' * > type.toString() ID <(offset> varDefinition.offset <)>
    */
    public Void visit(VariableDefinition variableDefinition, ReturnArgumentsDTO param){
        String comment = String.format("\t' * %s %s (offset %d)",
                variableDefinition.getType().toString(), variableDefinition.getName(), variableDefinition.getOffset());
        cg.addLineOfCode(comment);
        return null;
    }

    /*
    * execute[[FuncDefinition: funcDefinition -> type ID varDefinition* statement*]] =
    *   ID<:>
    *   <' * Parameters:>
    *   execute[[type]] // the parameters come in the functionType
    *   <' * Local variables:>
    *   varDefinition*.forEach(varDef -> execute[[varDef]])
    *   if(varDefinition*.size() >0)
    *       <enter > -(varDefinition*.get(varDefinition*.size()-1).offset)
    */
    public Void visit(FuncDefinition funcDefinition, ReturnArgumentsDTO param){
        cg.newLine();
        cg.addLineOfCode("#line\t" + funcDefinition.getLine());

        cg.addLineOfCode(funcDefinition.getName() + ":");
        cg.addLineOfCode("' * Parameters:");
        funcDefinition.getFunctionType().accept(this, null);
        cg.addLineOfCode("' * Local variables:");
        funcDefinition.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this, null));

        if(funcDefinition.getVariableDefinitions().size()>0){
            int functionSizeAllocation = -(funcDefinition.getVariableDefinitions().get(funcDefinition.getVariableDefinitions().size()-1).getOffset());
            cg.addLineOfCode("enter " + functionSizeAllocation);
        }

        int bytesReturn = !(funcDefinition.getFunctionType().getReturnType() instanceof VoidType)
                ? funcDefinition.getFunctionType().getReturnType().getNumberOfBytes()
                : 0;

        int bytesLocals = !funcDefinition.getVariableDefinitions().isEmpty()
                ? funcDefinition.getVariableDefinitions().get(funcDefinition.getVariableDefinitions().size()-1).getOffset()
                : 0;

        int bytesArgs = !funcDefinition.getFunctionType().getVariableDefinitions().isEmpty()
                //? funcDefinition.getFunctionType().getVariableDefinitions().get(funcDefinition.getFunctionType().getVariableDefinitions().size()-1).getOffset()
                ? funcDefinition.getFunctionType().getVariableDefinitions().stream().mapToInt(variableDefinition -> variableDefinition.getType().getNumberOfBytes()).sum()
                : 0;

        ReturnArgumentsDTO dto = new ReturnArgumentsDTO(bytesReturn, -bytesLocals, bytesArgs);

        funcDefinition.getStatements().forEach(statement -> {
            statement.accept(this, dto);
        });

        if(funcDefinition.getFunctionType().getReturnType() instanceof VoidType){
            cg.addLineOfCode("ret "+ bytesReturn + ", " + -bytesLocals + ", " +bytesArgs);
        }
        return null;
    }

    /*
    * execute[[FunctionType: type -> type varDefinition*]]
    *   varDefinition*.forEach(varDef -> execute[[varDef]]);
    */
    public Void visit(FunctionType functionType, ReturnArgumentsDTO param){
        if(functionType.getVariableDefinitions().size()>0)
            functionType.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this,null));
        return null;
    }

    /*
    * execute[[WhileStmt: statement -> expression statement*]] =
    *   String conditionLabel = cg.nextLabel()
    *   String exitLabel = cg.nextLabel()
    *   conditionLabel<:>
    *   value[[expression]]
    *   <jz > exitLabel
    *   statement*.forEach(stmt -> execute[[stmt]](bytesReturn, bytesLocals, bytesParams));
	*   jmp condLabel
	*   exitLabel<:>
    */
    public Void visit(While whileStmt, ReturnArgumentsDTO param){
        cg.newLine();
        cg.addLineOfCode("#line\t" + whileStmt.getLine());
        cg.addLineOfCode("' * While");

        String conditionLabel = cg.nextLabel();
        String exitLabel = cg.nextLabel();
        cg.addLineOfCode(conditionLabel+":");
        whileStmt.getWhileCondition().accept(this.valueCGVisitor, null);
        cg.addLineOfCode("jz " + exitLabel);
        whileStmt.getWhileBody().forEach(statement -> statement.accept(this, param));
        cg.addLineOfCode("jmp "+conditionLabel);
        cg.addLineOfCode(exitLabel+":");
        return null;
    }

    /*
    * execute[[IfElse: statement1 -> expression statement2* statement3*]]
    *   String elseLabel = cg.nextLabel();
    *   String exitLabel = cg.nextLabel();
    *   value[[expression]]
    *   <jz > elseLabel
    *   statement2*.forEach(stmt -> execute[[stmt]]);
    *   <jmp > exitLabel
    *   elseLabel<:>
    *   statement3*.forEach(stmt -> execute[[stmt]]);
    *   exitLabel<:>
    */
    public Void visit(IfElse whileStmt, ReturnArgumentsDTO param){
        String elseLabel = cg.nextLabel();
        String exitLabel = cg.nextLabel();
        whileStmt.getIfCondition().accept(this.valueCGVisitor, null);
        cg.addLineOfCode("jz "+elseLabel);
        whileStmt.getIfBody().forEach(statement -> statement.accept(this, param));
        cg.addLineOfCode("jmp "+exitLabel);
        cg.addLineOfCode(elseLabel+":");
        whileStmt.getElseBody().forEach(statement -> statement.accept(this, param));
        cg.addLineOfCode(exitLabel+":");
        return null;
    }

    /*
    * execute[[Return: statement -> exp]](int bytesReturn, int bytesLocals, int bytesArgs) =
    *   value[[exp]]
    *   <ret > bytesReturn <, > bytesLocals <, > bytesArgs
    *
    * anytime you traverse execute with statements pass these 3 parameters
    */
    public Void visit(Return retStatement, ReturnArgumentsDTO param){
        cg.newLine();
        cg.addLineOfCode("#line\t" + retStatement.getLine());
        cg.addLineOfCode("' * Return");

        retStatement.getExpression().accept(this.valueCGVisitor, null);
        cg.addLineOfCode("ret " + param.getBytesReturn() + ", " + param.getBytesLocals() + ", " + param.getBytesArgs());
        return null;
    }

    /*
    * execute[[FunctionInvocation: statement -> expression1 expression2*]]
    *   expression.forEach(exp -> value[[exp]]
    *   <call > expression1.name
    *   Type returnType = expression1.definition.functionType.returnType
    *   if(!(returnType instanceof VoidType)){
    *       <pop> returnType.suffix()
    *   }
    */
    public Void visit(FunctionInvocation functionInvocation, ReturnArgumentsDTO param){
        cg.newLine();
        cg.addLineOfCode("#line\t" + functionInvocation.getLine());
        functionInvocation.getExpressions().forEach(expression -> expression.accept(this.valueCGVisitor, null));
        cg.addLineOfCode("call " + functionInvocation.getVariable().getName());

        Type returnType = ((FunctionType) functionInvocation.getVariable().getDefinition().getType()).getReturnType();
        if(!(returnType instanceof VoidType)){
            cg.addLineOfCode("pop" + returnType.suffix());
        }
        return null;
    }

}
