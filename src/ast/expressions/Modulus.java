package ast.expressions;

public class Modulus extends AbstractExpression{
    private Expression right;
    private Expression left;

    public Modulus(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }
}
