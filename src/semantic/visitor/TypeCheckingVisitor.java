package semantic.visitor;

import ast.errorhandler.ErrorHandler;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void,Void>{

    /*
    * EXPRESSIONS:
    *
    * (P) Arithmetic: expression1 -> expression2 expression3
    * (R) expression1.type = expression2.type.arithmetic(expression3.type)
    *
    * (P) Modulus: expression1 -> expression2 expression3
    * (R) expression1.type = expression2.type.modulus(expression3)
    *
    * (P) Logical: expression1 -> expression2 expression3
    * (R) expression1.type = expression2.type.logical(expression3.type)
    *
    * (P) UnaryNot: expression1 -> expression2
    * (R) expression1.type = expression2.type.unaryNot()
    *
    * (P) Comparison: expression1 -> expression2 expression3
    * (R) expression1.type = expression2.type.comparison(expression3.type)
    *
    * (P) UnaryMinus: expression1 -> expression2
    * (R) expression1.type = expression2.type.unaryMinus()
    *
    * (P) Cast: expression1 -> type expression2
    * (R) expression1.type = expression2.type.castTo(type)
    *
    * (P) Indexing: expression1 -> expression2 expression3
    * (R) expression1.type = expression2.type.squareBrackets(expression3.type)
    *
    * (P) FunctionInvocation: expression1 -> expression2 expression*
    * (R) expression1.type = expression2.type.parenthesis( expression*.stream().map(exp -> exp.type).toArray() )
    *
    * (P) Variable: expression1 -> ID
    * (R) expression1.type = expression1.definition.type ? expression1.definition.type : new ErrorType()
    *
    * (P) IntLiteral: expression1 -> INT_LITERAL
    * (R) expression1.type = new IntegerType()
    *
    * (P) DoubleLiteral: expression1 -> DOUBLE_LITERAL
    * (R) expression1.type = new DoubleType()
    *
    * (P) CharacterLiteral: expression1 -> CHAR_LITERAL
    * (R) expression1.type = new CharLiteral()
    *
    * STATEMENTS:
    *
    * (P) FunctionInvocation: statement -> expression expression*
    * (R) expression.type.parenthesis( expression*.stream().map(exp -> exp.type).toArray() )
    *
    * (P) Assignment: statement1 -> expression1 expression2
    * (R) expression2.type.mustBeAssignableTo(expression1.type)
    *
    * (P) Read: statement1 -> expression1
    * (R) expression1.type.mustBeReadable()
    *
    * (P) Write: statement1 -> expression1
    * (R) expression1.type.mustBeWritable()
    *
    * (P) WhileStmt: statement1 -> expression statement2*
    * (R) expression.type.mustBeBoolean()
    *     statement2*.stream().map(stmt -> stmt.returnType = type).toArray()
    *
    * (P) IfElseStmt: statement1 -> expression statement2*
    * (R) expression.type.mustBeBoolean()
    *     statement2*.stream().map(stmt -> stmt.returnType = type).toArray()
    *
    * (P) Return: statement1 -> expression
    * (R) expression.type.mustBeReturnable(statement1.returnType)
    *
    * (P) FuncDefinition: definition1 -> type definition2* statement*
    * (R) statement*.stream().map(stmt -> stmt.returnType = type).toArray()
    *
    */
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
        return null;
    }

    @Override
    public Void visit(Modulus modulus, Void param) {
        modulus.getLeft().accept(this,null);
        modulus.getRight().accept(this,null);
        modulus.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getExpression().accept(this,null);
        unaryMinus.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getExpression().accept(this,null);
        unaryNot.setLValue(false);
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
        return null;
    }

}
