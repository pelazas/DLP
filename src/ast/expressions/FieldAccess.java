package ast.expressions;

import ast.types.Type;

public class FieldAccess extends AbstractExpression {
    private String name;
    public FieldAccess(int line, int column, Type type, String name) {
        super(line, column, type);
        this.name = name;
    }
}
