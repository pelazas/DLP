package ast.expressions;

import ast.statements.Statement;
import ast.types.Type;
import semantic.visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    List<Expression> expressions;
    private Variable variable;
    private Type returnType;

    public FunctionInvocation(int line, int column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Variable getVariable() {
        return variable;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }

    @Override
    public Type getReturnType() {
        return this.returnType;
    }

    @Override
    public void setReturnType(Type type) {
        this.returnType = type;
    }
}
