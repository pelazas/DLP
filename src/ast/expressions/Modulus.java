package ast.expressions;

import semantic.visitor.Visitor;

public class Modulus extends AbstractExpression{
    private Expression right;
    private Expression left;

    public Modulus(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
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
