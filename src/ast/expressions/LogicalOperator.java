package ast.expressions;

import semantic.visitor.Visitor;

public class LogicalOperator extends AbstractExpression{
    private String operator;
    private Expression right;
    private Expression left;
    public LogicalOperator(int line, int column, String operator, Expression right, Expression left) {
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
    public String getOperator(){
        return this.operator;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
