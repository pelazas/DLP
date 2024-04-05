package ast.expressions;

import semantic.visitor.Visitor;

public class Arithmetic extends AbstractExpression{
    private String operator;
    private Expression right;
    private Expression left;
    public Arithmetic(int line, int column, String operator,  Expression left, Expression right) {
        super(line, column);
        System.out.println("Creating object");
        this.left = left;
        this.operator = operator;
        this.right = right;
        System.out.println("LEFT ARITHMETIC: "+ left);
        System.out.println("RIGHT ARITHMETIC: "+ right);
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
