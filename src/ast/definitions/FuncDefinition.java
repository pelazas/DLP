package ast.definitions;

import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;
import semantic.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition{
    private List<Statement> statements;

    private List<VariableDefinition> variableDefinitions;
    private FunctionType functionType;
    public FuncDefinition(int line, int column, FunctionType type, String name,
                          List<VariableDefinition> variableDefinitions, List<Statement> statements) {
        super(line, column, type, name);
        this.functionType = type;
        this.variableDefinitions = new ArrayList<>(variableDefinitions);
        this.statements = new ArrayList<>(statements);
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public List<VariableDefinition> getVariableDefinitions() {
        return variableDefinitions;
    }

    public FunctionType getFunctionType(){
        return this.functionType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
