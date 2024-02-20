package ast.expressions;

import ast.definitions.Definition;
import ast.types.Type;

public class Variable extends AbstractExpression{
    private String name;
    public Variable(int line, int column, Type type, String name) {
        super(line, column, type);
        this.name = name;
    }
}
