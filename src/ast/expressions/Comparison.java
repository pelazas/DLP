package ast.expressions;

import ast.types.Type;

public class Comparison extends AbstractExpression{
    private String operator;
    private Expression right;
    private Expression left;
    public Comparison(int line, int column, String operator, Expression right, Expression left) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
}
