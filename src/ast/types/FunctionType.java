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
        if (parameters.size() != variableDefinitions.size()) {
            return new ErrorType(line, column, "The number of parameters is not the same as the function header");
        }
        for (int i = 0; i < variableDefinitions.size(); i++) {
            String varDefType = variableDefinitions.get(i).getType().getClass().getSimpleName();
            String paramType = parameters.get(i).getClass().getSimpleName();

            if(!varDefType.equals(paramType)){
                return new ErrorType(line,column, "The "+(i+1)+ " parameter should be " +varDefType +", but is "+paramType);
            }
        }
        return returnType;
    }
}
