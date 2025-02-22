package ast.types;

import ast.errorhandler.ErrorHandler;
import semantic.visitor.Visitor;

public class CharacterType extends AbstractType{
    public CharacterType(int line, int column) {
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
            case "CharacterType":
                return new IntegerType(line, column);
            case "ErrorType":
                return type;
            default:
                return new ErrorType(line, column,
                        "Cannot perform arithmetic operation between CharacterType and " + typeString);
        }
    }

    @Override
    public Type modulus(Type type, int line, int column) {
        String typeString = type.getClass().getSimpleName();
        switch (typeString){
            case "CharacterType":
            case "IntegerType":
                return new IntegerType(line, column);
            case "ErrorType":
                return type;
            default:
                return new ErrorType(line, column,
                        "Cannot perform arithmetic operation between CharacterType and " + typeString);
        }
    }

    @Override
    public Type comparison(Type type, int line, int column) {
        String typeString = type.getClass().getSimpleName();
        switch (typeString){
            case "CharacterType":
                return new IntegerType(line, column);
            case "ErrorType":
                return type;
            default:
                return new ErrorType(line, column,
                        "Cannot perform comparison operation between CharacterType and "+typeString);
        }
    }

    @Override
    public Type unaryMinus(int line, int column) {
        return new CharacterType(line,column);
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
                        "Cannot perform casting operation between CharacterType and "+typeString);
        }
    }

    @Override
    public void mustBeAssignableTo(Type type, int line, int column){
        if(!type.getClass().getSimpleName().equals("CharacterType")){
            new ErrorType(line,column,
                    "Cannot assign a CharacterType to a "+type.getClass().getSimpleName());
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
        if(!type.getClass().getSimpleName().equals("IntegerTYpe")){
            new ErrorType(line,column,
                    "The return type of the statement ("+type.getClass().getSimpleName()+")" +
                            " doesn't match the return type of the function (IntegerType)");
        }
    }

    @Override
    public int getNumberOfBytes(){
        return 1;
    }
    @Override
    public String suffix(){
        return "b";
    }
    @Override
    public String convertTo(Type type){
        if(type instanceof IntegerType) return "b2i";
        else if (type instanceof CharacterType) return "";
        else if (type instanceof DoubleType) return "b2i\ni2f";
        else {
            assert false;
            return "";
        }
    }
    @Override
    public Type superType(){
        return new IntegerType(getLine(), getColumn());
    }

    @Override
    public String toString(){
        return "CharacterType";
    }
}
