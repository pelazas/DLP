package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

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

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
