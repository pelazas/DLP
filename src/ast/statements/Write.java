package ast.statements;


import ast.expressions.Expression;
import semantic.visitor.Visitor;

public class Write extends AbstractStatement{
    private Expression expression;
    public Write(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;

    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
