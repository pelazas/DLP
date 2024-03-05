package ast.expressions;

import ast.definitions.Definition;
import ast.types.Type;

public class Variable extends AbstractExpression{
    private String name;
    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

}
