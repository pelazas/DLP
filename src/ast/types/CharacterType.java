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
        System.out.println(typeString);
        switch (typeString){
            case "CharacterType":
                return new IntegerType(line, column);
            case "ErrorType":
                return type;
            default:
                new ErrorType(line, column,
                        "Cannot perform arithmetic operation between CharacterType and " + typeString);
                break;
        }
        return null;
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
                new ErrorType(line, column,
                        "Cannot perform arithmetic operation between CharacterType and " + typeString);
                break;
        }
        return null;
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
                new ErrorType(line, column,
                        "Cannot perform comparison operation between CharacterType and "+typeString);
                break;
        }
        return null;
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
                new ErrorType(line, column,
                        "Cannot perform casting operation between CharacterType and "+typeString);
                break;
        }
        return null;
    }

    @Override
    public void mustBeAssignableTo(Type type, int line, int column){
        if(!type.getClass().getSimpleName().equals("CharacterType")){
            new ErrorType(line,column,
                    "Cannot assign a "+type.getClass().getSimpleName() +" to a CharacterType");
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
}
