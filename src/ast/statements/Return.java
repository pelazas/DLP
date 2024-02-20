package ast.statements;


import ast.expressions.Expression;

public class Return extends AbstractStatement{
    private Expression expression;
    public Return(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
