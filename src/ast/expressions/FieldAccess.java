package ast.expressions;

import ast.types.Type;

public class FieldAccess extends AbstractExpression {
    private String name;
    private Expression expression;
    public FieldAccess(int line, int column, String name, Expression expression) {
        super(line, column);
        this.name = name;
        this.expression = expression;
    }
}
