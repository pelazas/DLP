package ast.types;

import ast.errorhandler.ErrorHandler;
import semantic.visitor.Visitor;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addErrors(this);
    }

    public String toString(){
        return String.format("%s, Line: %d, Column: %d", this.message, getLine(), getColumn());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}