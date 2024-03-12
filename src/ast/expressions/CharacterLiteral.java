package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class CharacterLiteral extends AbstractExpression{
    private char value;
    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
