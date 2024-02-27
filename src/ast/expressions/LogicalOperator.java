package ast.expressions;

public class LogicalOperator extends AbstractExpression{
    private String operator;
    private Expression right;
    private Expression left;
    public LogicalOperator(int line, int column, String operator, Expression right, Expression left) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
}
