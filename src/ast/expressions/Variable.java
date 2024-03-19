package ast.expressions;

import semantic.visitor.Visitor;

public class Variable extends AbstractExpression{
    private String name;
    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
