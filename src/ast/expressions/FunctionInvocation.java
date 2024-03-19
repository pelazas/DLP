package ast.expressions;

import ast.statements.Statement;
import semantic.visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    List<Expression> expressions;
    private Variable variable;

    public FunctionInvocation(int line, int column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Variable getVariable() {
        return variable;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
