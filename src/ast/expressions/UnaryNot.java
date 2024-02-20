package ast.expressions;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.types.Type;

public class UnaryNot extends AbstractExpression {
    private Expression expression;

    public UnaryNot(int line, int column, Type type, Expression expression) {
        super(line, column, type);
        this.expression = expression;
    }
}
