package ast.types;

import ast.definitions.VariableDefinition;
import semantic.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{

    private Type returnType;
    private List<VariableDefinition> variableDefinitions;
    public FunctionType(int line, int column, Type returnType, List<VariableDefinition> variableDefinitions) {
        super(line, column);
        this.returnType = returnType;
        this.variableDefinitions = variableDefinitions;
    }

    public List<VariableDefinition> getVariableDefinitions(){
        return new ArrayList<>(variableDefinitions);
    }

    public Type getReturnType(){
        return this.returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }

    @Override
    public Type parenthesis(List<Type> parameters, int line, int column){
        if(parameters.size() != variableDefinitions.size()){
            new ErrorType(line,column, "The number of parameters is incorrect");
        }
        int i = 0;
        for(Type parameter: parameters){ // el tipo de los valores en la invocación
            if(parameters instanceof IntegerType || parameter instanceof DoubleType || parameter instanceof CharacterType){
            } else {
                new ErrorType(line,column,"The type of the "+i+"º parameter must be built-in");
            }
            if(variableDefinitions.get(i).getType()!= parameter){
                new ErrorType(line,column,"The type of the "+i+"º parameter is not as expected");
            }
            i++;
        }
        return returnType;
    }
}
