package ast.expressions;

import semantic.visitor.Visitor;

public class CharacterLiteral extends AbstractExpression{
    private char value;
    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }
    public char getValue(){
        return this.value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
