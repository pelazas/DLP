package ast.expressions;

import semantic.visitor.Visitor;

public class FieldAccess extends AbstractExpression {
    private String name;
    private Expression expression;
    public FieldAccess(int line, int column, String name, Expression expression) {
        super(line, column);
        this.name = name;
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
