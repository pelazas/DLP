package ast.statements;


import ast.expressions.Expression;

import java.util.List;

public class Write extends AbstractStatement{
    private List<Expression> expressions;
    public Write(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;

    }
}
