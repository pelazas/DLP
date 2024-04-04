package ast.types;

import ast.AbstractASTNode;
import ast.errorhandler.ErrorHandler;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {
    public AbstractType(int line, int column) {
        super(line, column);
    }

    public Type arithmetic(Type type, int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support arithmetic operation");
        return null;
    }

    public Type modulus(Type type, int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support modulus operation");
        return null;
    }

    public Type logical(Type type, int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support logical operation");
        return null;
    }

    public Type comparison(Type type, int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support comparison operation");
        return null;
    }

    public Type unaryMinus(int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support unary minus operation");
        return null;
    }

    public Type unaryNot(int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support unary not operation");
        return null;
    }

    public Type castTo(Type castingType, int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support cast operation");
        return null;
    }

    public Type squareBrackets(Type type, int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support indexing operation");
        return null;
    }
    public Type parenthesis(List<Type> types, int line, int column) {
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() +" doesn't support parenthesis operation");
        return null;
    }

    @Override
    public void mustBeAssignableTo(Type type, int line, int column){
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() + " doesn't support assignation operation");
    }

    @Override
    public void mustBeReadable(int line, int column){
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() + " doesn't support read operation");
    }

    @Override
    public void mustBeWriteable(int line, int column){
        new ErrorType(line,column,
                "The type "+ this.getClass().getSimpleName() + " doesn't support write operation");
    }

    @Override
    public void mustBeBoolean(int line, int column){
        new ErrorType(line, column,
                "The type "+ this.getClass().getSimpleName() +" can't be converted to boolean");
    }

    @Override
    public void mustBeReturnable(Type type,int line, int column){
        new ErrorType(line, column,
                "The type " + this.getClass().getSimpleName() + " can't be returned in a function");
    }

}
