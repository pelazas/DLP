package ast.expressions;

import ast.types.Type;
import semantic.visitor.Visitor;

public class Cast extends AbstractExpression{
    private Expression expression;
    private Type castingType;

    public Cast(int line, int column, Expression expression, Type castingType) {
        super(line, column);
        this.castingType = castingType;
        this.expression = expression;
    }

    public Expression getExpression() {
        return this.expression;
    }

    public Type getCastingType(){
        return this.castingType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
