package ast.expressions;

import ast.definitions.Definition;
import ast.types.Type;
import semantic.Visitor;

public class Variable extends AbstractExpression{
    private String name;
    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
