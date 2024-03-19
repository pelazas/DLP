package semantic.visitor;

import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.errorhandler.ErrorHandler;
import ast.expressions.Variable;
import ast.types.ErrorType;
import semantic.symbolTable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void,Void>{
    SymbolTable symbolTable = new SymbolTable();

    public Void visit(VariableDefinition variableDefinition, Void param) {
        variableDefinition.getType().accept(this,null);
        boolean isNotInserted = symbolTable.insert(variableDefinition);
        if(!isNotInserted){
            ErrorHandler.getInstance().addErrors(new ErrorType(variableDefinition.getLine(), variableDefinition.getColumn(),
                    String.format("Variable with ID: %s is already defined", variableDefinition.getName())));
        }
        return null;
    }

    public Void visit(FuncDefinition funcDefinition, Void param) {

        boolean isNotInserted = symbolTable.insert(funcDefinition);
        if(!isNotInserted){
            ErrorHandler.getInstance().addErrors(new ErrorType(funcDefinition.getLine(), funcDefinition.getColumn(),
                    String.format("Function with ID: %s is already defined", funcDefinition.getName())));
        }
        symbolTable.set();
        funcDefinition.getFunctionType().accept(this,null);
        funcDefinition.getVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this, null));
        funcDefinition.getStatements().forEach(statement -> statement.accept(this,null));

        symbolTable.reset();

        return null;
    }

    public Void visit(Variable variable, Void param) {
        Definition def = symbolTable.find(variable.getName());
        if(def == null){
            ErrorHandler.getInstance().addErrors(new ErrorType(variable.getLine(), variable.getColumn(),
                    String.format("Variable with ID: %s is not defined", variable.getName())));
        }
        return null;
    }

}
