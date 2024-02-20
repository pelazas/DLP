package ast.expressions;

import ast.types.Type;

public class CharacterLiteral extends AbstractExpression{
    private char value;
    public CharacterLiteral(int line, int column, Type type, char value) {
        super(line, column, type);
        this.value = value;
    }
}
