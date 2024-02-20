package ast.expressions;

import ast.types.Type;

public class Cast extends AbstractExpression{
    private Expression expression;
    private Type castingType;

    public Cast(int line, int column, Type type, Expression expression, Type castingType) {
        super(line, column, type);
        this.castingType = castingType;
        this.expression = expression;
    }
}
