package ast.statements;

import ast.expressions.Expression;
import semantic.visitor.Visitor;

import java.util.List;

public class IfElse extends AbstractStatement{
    private Expression ifCondition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public IfElse(int line, int column, Expression ifCondition, List<Statement> ifBody) {
        super(line, column);
        this.ifCondition = ifCondition;
        this.ifBody = ifBody;
    }

    public void setElseBlock(List<Statement> elseBody){
        this.elseBody = elseBody;
    }


    public Expression getIfCondition() {
        return ifCondition;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
