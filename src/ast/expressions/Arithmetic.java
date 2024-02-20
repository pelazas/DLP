package ast.expressions;

import ast.types.Type;

public class Arithmetic extends AbstractExpression{
    private String operator;
    private Expression right;
    private Expression left;
    public Arithmetic(int line, int column, Type type, String operator, Expression right, Expression left) {
        super(line, column, type);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
}
