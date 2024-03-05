package ast.statements;


import ast.expressions.Expression;

import java.util.List;

public class Write extends AbstractStatement{
    private Expression expressions;
    public Write(int line, int column, Expression expression) {
        super(line, column);
        this.expressions = expression;

    }
}
