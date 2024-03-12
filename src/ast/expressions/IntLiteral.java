package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class IntLiteral extends AbstractExpression {
    private int value;
    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
