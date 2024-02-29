package ast.definitions;

import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition{
    private List<Statement> statements;

    private List<VariableDefinition> variableDefinitions;
    public FuncDefinition(int line, int column, FunctionType type, String name,
                          List<VariableDefinition> variableDefinitions, List<Statement> statements) {
        super(line, column, type, name);
        this.variableDefinitions = new ArrayList<>(variableDefinitions);
        this.statements = new ArrayList<>(statements);
    }
}
