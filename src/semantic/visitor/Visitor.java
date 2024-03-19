package semantic.visitor;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP,TR> {
    public TR visit(Arithmetic arithmetic, TP param);
    public TR visit(Cast cast, TP param);
    public TR visit(CharacterLiteral characterLiteral, TP param);
    public TR visit(Comparison comparison, TP param);
    public TR visit(DoubleLiteral doubleLiteral, TP param);
    public TR visit(FieldAccess fieldAccess, TP param);
    public TR visit(FunctionInvocation functionInvocation, TP param);
    public TR visit(Indexing indexing, TP param);
    public TR visit(IntLiteral intLiteral, TP param);
    public TR visit(LogicalOperator logicalOperator, TP param);
    public TR visit(Modulus modulus, TP param);
    public TR visit(UnaryMinus unaryMinus, TP param);
    public TR visit(UnaryNot unaryNot, TP param);
    public TR visit(Variable variable, TP param);
    public TR visit(Assignment assignment, TP param);
    public TR visit(IfElse ifElse, TP param);
    public TR visit(Read read, TP param);
    public TR visit(Return returnStmt, TP param);
    public TR visit(While whileStmt, TP param);
    public TR visit(Write write, TP param);
    public TR visit(ArrayType arrayType, TP param);
    public TR visit(CharacterType charType, TP param);
    public TR visit(DoubleType doubleType, TP param);
    public TR visit(ErrorType errorType, TP param);
    public TR visit(FunctionType functionType, TP param);
    public TR visit(IntegerType intType, TP param);
    public TR visit(StructFieldType structFieldType, TP param);
    public TR visit(StructType structType, TP parameter);
    public TR visit(VoidType voidType, TP param);
    public TR visit(Program program, TP param);
    public TR visit(FuncDefinition funcDefinition, TP param);
    public TR visit(VariableDefinition variableDefinition, TP param);


}
