package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

public class FuncDefinition extends AbstractDefinition{
    private Statement statement;

    private List<VariableDefinition> variableDefinitions;
    public FuncDefinition(int line, int column, Type type, String name,
                          List<VariableDefinition> variableDefinitions, Statement statement) {
        super(line, column, type, name);
        this.variableDefinitions = variableDefinitions;
        this.statement = statement;
    }
}
