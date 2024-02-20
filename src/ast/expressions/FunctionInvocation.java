package ast.expressions;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    List<Expression> expressions;
    private Variable variable;

    public FunctionInvocation(int line, int column, Type type, List<Expression> expressions, Variable variable) {
        super(line, column, type);
        this.expressions = expressions;
        this.variable = variable;
    }

}
