package ast.types;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    public String toString(){
        return String.format("%s, Line: %d, Column: %d", this.message, getLine(), getColumn());
    }
}