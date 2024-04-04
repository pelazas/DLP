package semantic.visitor;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.errorhandler.ErrorHandler;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

import java.util.List;

public abstract class AbstractVisitor<TP,TR> implements Visitor<TP,TR> {

    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getLeft().accept(this,null);
        arithmetic.getRight().accept(this,null);
        return null;
    }

    public Void visit(Cast cast, Void param) {
        Expression expression = cast.getExpression();
        Type castingType = cast.getCastingType();

        castingType.accept(this,null);
        expression.accept(this,null);

        return null;
    }

    public Void visit(CharacterLiteral characterLiteral, Void param) {
        return null;
    }

    public Void visit(Comparison comparison, Void param) {
        comparison.getLeft().accept(this,null);
        comparison.getRight().accept(this,null);
        return null;
    }

    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        return null;
    }

    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this,null);
        return null;
    }

    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getVariable().accept(this,null);
        functionInvocation.getExpressions().forEach(expression -> expression.accept(this,null));
        return null;
    }

    public Void visit(Indexing indexing, Void param) {
        indexing.getArray().accept(this,null);
        indexing.getIndex().accept(this,null);
        return null;
    }

    public Void visit(IntLiteral intLiteral, Void param) {
        return null;
    }

    public Void visit(LogicalOperator logicalOperator, Void param) {
        logicalOperator.getLeft().accept(this,null);
        logicalOperator.getRight().accept(this,null);
        return null;
    }

    public Void visit(Modulus modulus, Void param) {
        modulus.getLeft().accept(this,null);
        modulus.getRight().accept(this,null);
        return null;
    }

    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getExpression().accept(this,null);
        return null;
    }

    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getExpression().accept(this,null);
        return null;
    }

    public Void visit(Variable variable, Void param) {
        return null;
    }

    public Void visit(Assignment assignment, Void param) {
        assignment.getLeft().accept(this,null);
        assignment.getRight().accept(this, null);
        return null;
    }

    public Void visit(Read read, Void param) {
        Expression readExpression = read.getExpression();
        readExpression.accept(this,null);
        return null;
    }

    public Void visit(IfElse ifElse, Void param) {
        ifElse.getIfBody().forEach(statement -> statement.accept(this,null));
        for( Statement s: ifElse.getElseBody()){
            s.accept(this,null);
        }
        ifElse.getIfCondition().accept(this,null);
        return null;
    }


    public Void visit(Return returnStmt, Void param) {
        returnStmt.getExpression().accept(this,null);
        return null;
    }

    public Void visit(While whileStmt, Void param) {
        Expression condition = whileStmt.getWhileCondition();
        List<Statement> statements = whileStmt.getWhileBody();

        condition.accept(this,null);
        statements.forEach(statement -> statement.accept(this,null));
        return null;
    }

    public Void visit(Write write, Void param) {
        write.getExpression().accept(this,null);
        return null;
    }

    public Void visit(ArrayType arrayType, Void param) {
        arrayType.getType().accept(this,null);
        return null;
    }

    public Void visit(CharacterType charType, Void param) {
        return null;
    }

    public Void visit(DoubleType doubleType, Void param) {
        return null;
    }

    public Void visit(ErrorType errorType, Void param) {
        return null;
    }

    public Void visit(FunctionType functionType, Void param) {
        functionType.getReturnType().accept(this,null);
        functionType.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this,null));
        return null;
    }

    public Void visit(IntegerType intType, Void param) {
        return null;
    }

    public Void visit(StructFieldType structFieldType, Void param) {
        return null;
    }

    public Void visit(StructType structType, Void parameter) {
        structType.getStructFields().forEach(structFieldType -> structFieldType.accept(this,null));
        return null;
    }

    public Void visit(VoidType voidType, Void param) {
        return null;
    }

    public Void visit(Program program, Void param) {
        program.getDefinitions().forEach(definition -> definition.accept(this,null));
        return null;
    }

    public Void visit(FuncDefinition funcDefinition, Void param) {
        funcDefinition.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this, null));
        funcDefinition.getStatements().forEach(statement -> statement.accept(this,null));
        return null;
    }

    public Void visit(VariableDefinition variableDefinition, Void param) {
        variableDefinition.getType().accept(this,null);
        return null;
    }
}
