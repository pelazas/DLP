package ast.expressions;

import ast.types.Type;

public class IntLiteral extends AbstractExpression {
    private int value;
    public IntLiteral(int line, int column, Type type, int value) {
        super(line, column, type);
        this.value = value;
    }
}
