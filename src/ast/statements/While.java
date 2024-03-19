package ast.statements;

import ast.expressions.Expression;
import semantic.visitor.Visitor;

import java.util.List;

public class While extends AbstractStatement{
    private Expression whileCondition;
    private List<Statement> whileBody;
    public While(int line, int column, Expression whileCondition, List<Statement> whileBody) {
        super(line, column);
        this.whileBody = whileBody;
        this.whileCondition = whileCondition;
    }

    public Expression getWhileCondition() {
        return whileCondition;
    }

    public List<Statement> getWhileBody() {
        return whileBody;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
