package ast.expressions;

import semantic.visitor.Visitor;

public class DoubleLiteral extends AbstractExpression{
    private double value;
    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
