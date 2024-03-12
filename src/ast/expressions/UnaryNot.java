package ast.expressions;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.types.Type;
import semantic.Visitor;

public class UnaryNot extends AbstractExpression {
    private Expression expression;

    public UnaryNot(int line, int column, Expression expression) {
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
