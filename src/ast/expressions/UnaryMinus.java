package ast.expressions;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.types.Type;

public class UnaryMinus extends AbstractExpression {
    private Expression expression;
    public UnaryMinus(int line, int column, Type type, Expression expression) {
        super(line, column, type);
        this.expression = expression;
    }
}
