package ast.expressions;

import ast.types.Type;

public class Cast extends AbstractExpression{
    private Expression expression;
    private Type castingType;

    public Cast(int line, int column, Expression expression, Type castingType) {
        super(line, column);
        this.castingType = castingType;
        this.expression = expression;
    }
}
