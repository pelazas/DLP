package semantic;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.errorhandler.ErrorHandler;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor implements Visitor<Void, Void>{
    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getLeft().accept(this,null);
        arithmetic.getRight().accept(this,null);
        arithmetic.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, null);
        cast.setLValue(false);
        return null;
    }

    @Override
    public Void visit(CharacterLiteral characterLiteral, Void param) {
        characterLiteral.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.getLeft().accept(this,null);
        comparison.getRight().accept(this,null);
        comparison.setLValue(false);
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        doubleLiteral.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this,null);
        fieldAccess.setLValue(true);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getVariable().accept(this,null);
        functionInvocation.getExpressions().forEach(expression -> expression.accept(this,null));
        functionInvocation.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.getArray().accept(this,null);
        indexing.getIndex().accept(this,null);
        indexing.setLValue(true);
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        intLiteral.setLValue(false);
        return null;
    }

    @Override
    public Void visit(LogicalOperator logicalOperator, Void param) {
        logicalOperator.getLeft().accept(this,null);
        logicalOperator.getRight().accept(this,null);
        logicalOperator.setLValue(false);
        logicalOperator.accept(this,null);
        return null;
    }

    @Override
    public Void visit(Modulus modulus, Void param) {
        modulus.getLeft().accept(this,null);
        modulus.getRight().accept(this,null);
        modulus.setLValue(false);
        modulus.accept(this,null);
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getExpression().accept(this,null);
        unaryMinus.setLValue(false);
        unaryMinus.accept(this,null);
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getExpression().accept(this,null);
        unaryNot.setLValue(false);
        unaryNot.accept(this,null);
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.getLeft().accept(this,null);
        assignment.getRight().accept(this, null);

        if(!assignment.getLeft().getLValue()){
            ErrorHandler.getInstance().addErrors(
                    new ErrorType(assignment.getLeft().getLine(), assignment.getLeft().getColumn(),
                            "The left part of an assignment must be an lvalue")
            );
        }
        assignment.accept(this,null);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.getElseBody().forEach(statement -> statement.accept(this,null));
        ifElse.getIfBody().forEach(statement -> statement.accept(this,null));
        ifElse.getIfCondition().accept(this,null);
        ifElse.accept(this,null);
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        Expression readExpression = read.getExpression();
        readExpression.accept(this,null);

        if(!read.getExpression().getLValue()){
            ErrorHandler.getInstance().addErrors(
                    new ErrorType(read.getExpression().getLine(), read.getExpression().getColumn(),
                            "The expression to read must be an lvalue")
            );
        }
        read.accept(this,null);
        return null;
    }

    @Override
    public Void visit(Return returnStmt, Void param) {
        returnStmt.getExpression().accept(this,null);
        returnStmt.accept(this,null);
        return null;
    }

    @Override
    public Void visit(While whileStmt, Void param) {
        whileStmt.getWhileBody().forEach(statement -> statement.accept(this,null));
        whileStmt.getWhileBody().forEach(statement -> statement.accept(this,null));
        whileStmt.accept(this,null);
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        write.getExpression().accept(this,null);
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        arrayType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(CharacterType charType, Void param) {
        charType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        doubleType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Void param) {
        errorType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        functionType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(IntegerType intType, Void param) {
        intType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(StructFieldType structFieldType, Void param) {
        structFieldType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(StructType structType, Void parameter) {
        structType.accept(this,null);
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        return null;
    }

    @Override
    public Void visit(Program program, Void param) {
        program.getDefinitions().forEach(definition -> definition.accept(this,null));
        return null;
    }

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        funcDefinition.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this, null));
        funcDefinition.getStatements().forEach(statement -> statement.accept(this,null));
        funcDefinition.accept(this,null);
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        variableDefinition.accept(this,null);
        return null;
    }
}
