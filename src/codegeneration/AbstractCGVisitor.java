package codegeneration;

import ast.ASTNode;
import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import semantic.visitor.Visitor;
import util.CodeGenerator;

public abstract class AbstractCGVisitor<TP,TR> implements Visitor<TP,TR> {

    protected CodeGenerator cg;

    public AbstractCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param){
        throw new IllegalStateException("Code generation not defined for Arithmetic");
    }
    @Override
    public TR visit(Cast cast, TP param){
        throw new IllegalStateException("Code generation not defined for Cast");
    }
    @Override
    public TR visit(CharacterLiteral characterLiteral, TP param){
        throw new IllegalStateException("Code generation not defined for CharacterLiteral");
    }
    @Override
    public TR visit(Comparison comparison, TP param){
        throw new IllegalStateException("Code generation not defined for Comparison");
    }
    @Override
    public TR visit(DoubleLiteral doubleLiteral, TP param){
        throw new IllegalStateException("Code generation not defined for DoubleLiteral");
    }
    @Override
    public TR visit(FieldAccess fieldAccess, TP param){
        throw new IllegalStateException("Code generation not defined for FieldAccess");
    }
    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param){
        throw new IllegalStateException("Code generation not defined for FunctionInvocation");
    }
    @Override
    public TR visit(Indexing indexing, TP param){
        throw new IllegalStateException("Code generation not defined for Indexing");
    }
    @Override
    public TR visit(IntLiteral intLiteral, TP param){
        throw new IllegalStateException("Code generation not defined for IntLiteral");
    }
    @Override
    public TR visit(LogicalOperator logicalOperator, TP param){
        throw new IllegalStateException("Code generation not defined for LogicalOperator");
    }
    @Override
    public TR visit(Modulus modulus, TP param){
        throw new IllegalStateException("Code generation not defined for Modulus");
    }
    @Override
    public TR visit(UnaryMinus unaryMinus, TP param){
        throw new IllegalStateException("Code generation not defined for UnaryMinus");
    }
    @Override
    public TR visit(UnaryNot unaryNot, TP param){
        throw new IllegalStateException("Code generation not defined for UnaryNot");
    }
    @Override
    public TR visit(Variable variable, TP param){
        throw new IllegalStateException("Code generation not defined for Variable");
    }
    @Override
    public TR visit(Assignment assignment, TP param){
        throw new IllegalStateException("Code generation not defined for Assignment");
    }
    @Override
    public TR visit(IfElse ifElse, TP param){
        throw new IllegalStateException("Code generation not defined for IfElse");
    }
    @Override
    public TR visit(Read read, TP param){
        throw new IllegalStateException("Code generation not defined for Read");
    }
    @Override
    public TR visit(Return returnStmt, TP param){
        throw new IllegalStateException("Code generation not defined for Return");
    }
    @Override
    public TR visit(While whileStmt, TP param){
        throw new IllegalStateException("Code generation not defined for While");
    }
    @Override
    public TR visit(Write write, TP param){
        throw new IllegalStateException("Code generation not defined for Write");
    }
    @Override
    public TR visit(ArrayType arrayType, TP param){
        throw new IllegalStateException("Code generation not defined for ArrayType");
    }
    @Override
    public TR visit(CharacterType characterType, TP param){
        throw new IllegalStateException("Code generation not defined for CharacterType");
    }
    @Override
    public TR visit(DoubleType doubleType, TP param){
        throw new IllegalStateException("Code generation not defined for DoubleType");
    }
    @Override
    public TR visit(ErrorType errorType, TP param){
        throw new IllegalStateException("Code generation not defined for ErrorType");
    }
    @Override
    public TR visit(FunctionType functionType, TP param){
        throw new IllegalStateException("Code generation not defined for FunctionType");
    }
    @Override
    public TR visit(IntegerType integerType, TP param){
        throw new IllegalStateException("Code generation not defined for IntegerType");
    }
    @Override
    public TR visit(StructFieldType structFieldType, TP param){
        throw new IllegalStateException("Code generation not defined for StructFieldType");
    }
    @Override
    public TR visit(StructType structType, TP param){
        throw new IllegalStateException("Code generation not defined for StructType");
    }
    @Override
    public TR visit(VoidType voidType, TP param){
        throw new IllegalStateException("Code generation not defined for VoidType");
    }
    @Override
    public TR visit(Program program, TP param){
        throw new IllegalStateException("Code generation not defined for Program");
    }
    @Override
    public TR visit(FuncDefinition funcDefinition, TP param){
        throw new IllegalStateException("Code generation not defined for FuncDefinition");
    }
    @Override
    public TR visit(VariableDefinition variableDefinition, TP param){
        throw new IllegalStateException("Code generation not defined for VariableDefinition");
    }
}
