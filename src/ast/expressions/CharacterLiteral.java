package ast.expressions;

import ast.types.Type;

public class CharacterLiteral extends AbstractExpression{
    private char value;
    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }
}
