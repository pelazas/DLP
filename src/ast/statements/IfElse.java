package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class IfElse extends AbstractStatement{
    private Expression ifCondition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public IfElse(int line, int column, Expression ifCondition, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column);
        this.ifCondition = ifCondition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }
}
