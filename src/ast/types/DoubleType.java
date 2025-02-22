package ast.types;

import ast.errorhandler.ErrorHandler;
import semantic.visitor.Visitor;

public class DoubleType extends AbstractType{
    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }

    @Override
    public Type arithmetic(Type type, int line, int column) {
        String typeString = type.getClass().getSimpleName();
        switch (typeString){
            case "DoubleType":
                return new DoubleType(line, column);
            case "ErrorType":
                return type;
            default:
                return new ErrorType(line, column,
                        "Cannot perform arithmetic operation between DoubleType and " + typeString);
        }
    }

    @Override
    public Type comparison(Type type, int line, int column) {
        String typeString = type.getClass().getSimpleName();
        switch (typeString){
            case "DoubleType":
                return new IntegerType(line, column);
            case "ErrorType":
                return type;
            default:
                return new ErrorType(line, column,
                        "Cannot perform comparison operation between DoubleType and "+typeString);
        }
    }

    @Override
    public Type unaryMinus(int line, int column) {
        return new DoubleType(line,column);
    }

    @Override
    public Type castTo(Type castingType, int line, int column) {
        String typeString = castingType.getClass().getSimpleName();
        switch (typeString){
            case "IntegerType":
                return new IntegerType(line, column);
            case "DoubleType":
                return new DoubleType(line,column);
            case "CharacterType":
                return new CharacterType(line,column);
            case "ErrorType":
                return castingType;
            default:
                return new ErrorType(line, column,
                        "Cannot perform casting operation between DoubleType and "+typeString);
        }
    }

    @Override
    public void mustBeAssignableTo(Type type, int line, int column){
        if(!type.getClass().getSimpleName().equals("DoubleType")){
            new ErrorType(line,column,
                    "Cannot assign a DoubleType to a "+type.getClass().getSimpleName());
        }
    }

    @Override
    public void mustBeReadable(int line, int column){
    }

    @Override
    public void mustBeWriteable(int line, int column){
    }

    @Override
    public void mustBeReturnable(Type type,int line, int column){

        if(!type.getClass().getSimpleName().equals("DoubleType")){
            new ErrorType(line,column,
                    "The return type of the statement ("+type.getClass().getSimpleName()+")" +
                            " doesn't match the return type of the function (IntegerType)");
        }
    }

    @Override
    public int getNumberOfBytes(){
        return 4;
    }
    @Override
    public String suffix(){
        return "f";
    }
    @Override
    public String convertTo(Type type){
        if(type instanceof DoubleType) return "";
        else if(type instanceof IntegerType) return "f2i";
        else {
            assert false;
            return "";
        }
    }
    @Override
    public Type superType(){
        return this;
    }

    @Override
    public String toString(){
        return "DoubleType";
    }
}
