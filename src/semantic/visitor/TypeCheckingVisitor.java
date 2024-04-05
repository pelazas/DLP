package semantic.visitor;

import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.errorhandler.ErrorHandler;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

import java.util.List;

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
    * (P) FieldAccess: expression1 -> expression2 ID
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
        Expression left = arithmetic.getLeft();
        Expression right = arithmetic.getRight();

        left.accept(this,null);
        right.accept(this,null);

        arithmetic.setLValue(false);
        arithmetic.setType(left.getType().arithmetic(right.getType(), left.getLine(), left.getColumn()));

        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        Expression expression = cast.getExpression();
        cast.getCastingType().accept(this,null);
        expression.accept(this, null);

        cast.setLValue(false);
        cast.setType(expression.getType().castTo(cast.getCastingType(), cast.getLine(), cast.getColumn()));
        return null;
    }

    @Override
    public Void visit(CharacterLiteral characterLiteral, Void param) {
        characterLiteral.setLValue(false);
        characterLiteral.setType(new CharacterType(characterLiteral.getLine(), characterLiteral.getColumn()));
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        Expression left = comparison.getLeft();
        Expression right = comparison.getRight();

        left.accept(this,null);
        right.accept(this,null);

        comparison.setLValue(false);
        comparison.setType(left.getType().comparison(right.getType(), left.getLine(), left.getColumn()));
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        doubleLiteral.setLValue(false);
        doubleLiteral.setType(new DoubleType(doubleLiteral.getLine(), doubleLiteral.getColumn()));
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        Expression expression = fieldAccess.getExpression();
        expression.accept(this,null);
        fieldAccess.setLValue(true);
        fieldAccess.setType(expression.getType().dot(fieldAccess.getName(),fieldAccess.getLine(), fieldAccess.getColumn() ));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        Expression variable = functionInvocation.getVariable();
        List<Expression> parameters = functionInvocation.getExpressions();

        functionInvocation.getVariable().accept(this,null);
        parameters.forEach(expression -> expression.accept(this,null));

        functionInvocation.setLValue(false);
        functionInvocation.setType(variable.getType().parenthesis( parameters.stream().map(expression -> expression.getType()).toList(), functionInvocation.getLine(), functionInvocation.getColumn()));
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        Expression array = indexing.getArray();
        Expression index = indexing.getIndex();

        array.accept(this,null);
        index.accept(this,null);

        indexing.setLValue(true);
        indexing.setType(array.getType().squareBrackets(index.getType(), indexing.getLine(), indexing.getColumn()));

        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        intLiteral.setLValue(false);
        intLiteral.setType(new IntegerType(intLiteral.getLine(), intLiteral.getColumn()));
        return null;
    }

    @Override
    public Void visit(LogicalOperator logicalOperator, Void param) {
        Expression left = logicalOperator.getLeft();
        Expression right = logicalOperator.getRight();

        left.accept(this,null);
        right.accept(this,null);

        logicalOperator.setLValue(false);
        logicalOperator.setType(left.getType().logical(right.getType(), left.getLine(), left.getColumn()));
        return null;
    }

    @Override
    public Void visit(Modulus modulus, Void param) {
        Expression left = modulus.getLeft();
        Expression right = modulus.getRight();

        left.accept(this,null);
        right.accept(this,null);

        modulus.setLValue(false);
        modulus.setType(left.getType().modulus(right.getType(), left.getLine(), left.getColumn()));
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        Expression expression = unaryMinus.getExpression();
        expression.accept(this,null);
        unaryMinus.setLValue(false);
        unaryMinus.setType(expression.getType().unaryMinus(expression.getLine(), expression.getColumn()));
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        Expression expression = unaryNot.getExpression();
        expression.accept(this,null);

        unaryNot.setLValue(false);
        unaryNot.setType(expression.getType().unaryNot(expression.getLine(), expression.getColumn()));
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLValue(true);
        if(variable.getDefinition().getType() != null){
            variable.setType(variable.getDefinition().getType());
        } else {
            new ErrorType(variable.getLine(), variable.getColumn(),
                    "Variable "+variable.getName()+" should be annotated with its definition");
        }
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        Expression left = assignment.getLeft();
        Expression right = assignment.getRight();

        left.accept(this,null);
        right.accept(this, null);

        if(!assignment.getLeft().getLValue()){
                new ErrorType(left.getLine(), left.getColumn(),
                        "The left part of an assignment must be an lvalue"
            );
        }
        right.getType().mustBeAssignableTo(left.getType(), left.getLine(), left.getColumn());
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        Expression readExpression = read.getExpression();

        readExpression.accept(this,null);

        if(!read.getExpression().getLValue()){
                new ErrorType(read.getExpression().getLine(), read.getExpression().getColumn(),
                        "The expression to read must be an lvalue");
        }
        readExpression.getType().mustBeReadable(read.getLine(), read.getColumn());
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        Expression expression = write.getExpression();
        expression.accept(this,null);
        expression.getType().mustBeWriteable(expression.getLine(), expression.getColumn());
        return null;
    }

    @Override
    public Void visit(While whileStmt, Void param) {
        Expression condition = whileStmt.getWhileCondition();
        List<Statement> statements = whileStmt.getWhileBody();

        //preorder
        statements.forEach(statement -> statement.setReturnType(whileStmt.getReturnType()));

        condition.accept(this,null);
        statements.forEach(statement -> statement.accept(this,null));

        //postorder
        condition.getType().mustBeBoolean(condition.getLine(), condition.getColumn());
        return null;
    }

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        List<VariableDefinition> variableDefinitions = funcDefinition.getVariableDefinitions();
        List<Statement> statements = funcDefinition.getStatements();
        FunctionType functionType = funcDefinition.getFunctionType();

        statements.forEach(statement -> statement.setReturnType(functionType.getReturnType()));

        functionType.accept(this,null);
        variableDefinitions.forEach(variableDefinition -> variableDefinition.accept(this, null));
        statements.forEach(statement -> statement.accept(this,null));

        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        Expression ifCondition = ifElse.getIfCondition();
        List<Statement> ifbody = ifElse.getIfBody();
        List<Statement> elsebody = ifElse.getElseBody();

        ifbody.forEach(statement -> statement.setReturnType(ifElse.getReturnType()));
        elsebody.forEach(statement -> statement.setReturnType(ifElse.getReturnType()));

        ifCondition.accept(this,null);
        ifbody.forEach(statement -> statement.accept(this,null));
        elsebody.forEach(statement -> statement.accept(this,null));

        ifCondition.getType().mustBeBoolean(ifCondition.getLine(), ifCondition.getColumn());

        return null;
    }

    @Override
    public Void visit(Return returnStmt, Void param) {
        Expression expression = returnStmt.getExpression();
        expression.accept(this,null);

        expression.getType().mustBeReturnable(returnStmt.getReturnType(), returnStmt.getLine(), returnStmt.getColumn());
        return null;
    }

}
