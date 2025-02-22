package util;

import ast.definitions.VariableDefinition;
import ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class StmtVarDfnDTO {
    private List<VariableDefinition> varDefinitions;
    private List<Statement> statements;
    public StmtVarDfnDTO(List<VariableDefinition> varDefinitions,List<Statement> statements ){
        this.varDefinitions = varDefinitions;
        this.statements = statements;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }
    public void addVarDefinition(VariableDefinition varDefinition){
        this.varDefinitions.add(varDefinition);
    }

    public List<VariableDefinition> getVarDefinitions(){
        return new ArrayList<>(varDefinitions);
    }

    public List<Statement> getStatements(){
        return new ArrayList<>(statements);
    }
}
