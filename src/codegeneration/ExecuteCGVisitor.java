package codegeneration;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.statements.Assignment;
import ast.statements.Read;
import ast.statements.Write;
import ast.types.FunctionType;
import util.CodeGenerator;
import java.util.ArrayList;
import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void> {
    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    /*
    * execute[[Read: statement1 -> expression1]] =
    *   <' * Read>
    *   value[[expression1]]
    *   <in> expression1.type.suffix()
    *   <store> expression1.type.suffix()
    */
    public Void visit(Read read, Void param){
        cg.addLineOfCode("' * Read");
        read.getExpression().accept(cg.getValueCGVisitor(), param);
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
    public Void visit(Write write, Void param){
        cg.addLineOfCode("' * Write");
        write.getExpression().accept(cg.getValueCGVisitor(), param);
        cg.addLineOfCode("out" + write.getExpression().getType().suffix());
        return null;
    }

    /*
    * execute[[Assignment: statement -> expression1 expression2]] =
    *   address[[expression1]]
    *   value[[expression2]]
    *   <store> expression1.type.suffix()
    */
    public Void visit(Assignment assignment, Void param){
        assignment.getLeft().accept(cg.getAddressCGVisitor(), param);
        assignment.getRight().accept(cg.getValueCGVisitor(), param);
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
    public Void visit(Program program, Void param){
        List<VariableDefinition> variableDefinitions = new ArrayList<>();
        List<FuncDefinition> funcDefinitions = new ArrayList<>();

        program.getDefinitions().forEach(definition -> {
            if(definition instanceof VariableDefinition) variableDefinitions.add((VariableDefinition) definition);
            else if(definition instanceof FuncDefinition) funcDefinitions.add((FuncDefinition) definition);
        });

        cg.addLineOfCode("' * Global variables");
        variableDefinitions.forEach(variableDefinition -> variableDefinition.accept(this,param));
        cg.addLineOfCode("call main");
        cg.addLineOfCode("halt");
        funcDefinitions.forEach(funcDefinition -> funcDefinition.accept(this, param));
        return null;
    }

    /*
    * execute[[VariableDefinition: varDefinition -> type ID]] =
    *   <' * > type.toString() ID <(offset> varDefinition.offset <)>
    */
    public Void visit(VariableDefinition variableDefinition, Void param){
        String comment = String.format("' * %s %s (offset %d)",
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
    public Void visit(FuncDefinition funcDefinition, Void param){
        cg.addLineOfCode(funcDefinition.getName() + ":");
        cg.addLineOfCode("' * Parameters:");
        funcDefinition.getFunctionType().accept(this, param);
        cg.addLineOfCode("' * Local variables:");
        funcDefinition.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this, param));
        if(funcDefinition.getVariableDefinitions().size()>0){
            int functionSizeAllocation = -(funcDefinition.getVariableDefinitions().get(funcDefinition.getVariableDefinitions().size()-1).getOffset());
            cg.addLineOfCode("enter " + functionSizeAllocation);
        }

        funcDefinition.getStatements().forEach(statement -> {
            cg.addLineOfCode("\n");
            cg.addLineOfCode("#line\t"+statement.getLine());
            statement.accept(cg.getExecuteCGVisitor(),param);
        });
        return null;
    }

    /*
    * execute[[FunctionType: type -> type varDefinition*]]
    *   varDefinition*.forEach(varDef -> execute[[varDef]]);
    */
    public Void visit(FunctionType functionType, Void param){
        if(functionType.getVariableDefinitions().size()>0)
            functionType.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(cg.getExecuteCGVisitor(),param));
        return null;
    }
}
