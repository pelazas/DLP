package ast.expressions;

public class Indexing extends AbstractExpression{
    private Expression array;
    private Expression index;
    public Indexing(int line, int column, Expression array, Expression index) {
        super(line, column);
        this.array = array;
        this.index = index;
    }
}
