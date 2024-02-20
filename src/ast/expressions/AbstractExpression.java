package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    private Type type;
    public AbstractExpression(int line, int column, Type type) {
        super(line, column);
        this.type = type;
    }

    public Type getType(){
        return type;
    }
}
