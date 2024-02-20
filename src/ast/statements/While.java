package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class While extends AbstractStatement{
    private Expression whileCondition;
    private List<Statement> whileBody;
    public While(int line, int column, Expression whileCondition, List<Statement> whileBody) {
        super(line, column);
        this.whileBody = whileBody;
        this.whileCondition = whileCondition;
    }
}
