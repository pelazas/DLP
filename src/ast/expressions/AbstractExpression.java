package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    public AbstractExpression(int line, int column) {
        super(line, column);
    }

}
