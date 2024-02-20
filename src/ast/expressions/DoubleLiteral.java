package ast.expressions;

import ast.types.Type;

public class DoubleLiteral extends AbstractExpression{
    private double value;
    public DoubleLiteral(int line, int column, Type type, double value) {
        super(line, column, type);
        this.value = value;
    }
}
