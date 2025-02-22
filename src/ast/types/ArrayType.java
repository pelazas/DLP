package ast.types;

import ast.errorhandler.ErrorHandler;
import semantic.visitor.Visitor;

public class ArrayType extends AbstractType{

    private int size;
    private Type type;
    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }


    public void setType(Type t){
        this.type = t;
    }
    public Type getType(){
        return this.type;
    }

    @Override
    public int getNumberOfBytes(){
        return size * type.getNumberOfBytes();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }

    @Override
    public Type squareBrackets(Type type, int line, int column) {
        String typeString = type.getClass().getSimpleName();
        switch (typeString){
            case "IntegerType":
                return this.type; // devolver el tipo del contenido
            case "ErrorType":
                return type;
            default:
                new ErrorType(line, column,
                        "Cannot perform indexing operation between ArrayType and "+typeString);
                break;
        }
        return null;
    }

    @Override
    public String toString() {
        return "[" + size + ", " + type.toString() + "]";
    }
}
