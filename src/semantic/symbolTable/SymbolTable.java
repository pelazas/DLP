package semantic.symbolTable;

import ast.definitions.Definition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private int scope = 0;
    private List<Map<String, Definition>> table;
    public SymbolTable() {
        table = new ArrayList<Map<String,Definition>>();
        Map<String,Definition> scope0 = new HashMap<>();
        table.add(scope0);
    }

    public void set(){
        Map<String, Definition> scopeN = new HashMap<>();
        this.scope++;
        table.add(scopeN);
    }

    public void reset(){
        table.remove(table.size()-1);
        this.scope--;
    }

    public boolean insert(Definition definition){
        Definition def = table.get(table.size()-1).get(definition.getName());
        if(def != null){
            return false;
        }
        definition.setScope(scope);
        table.get(table.size()-1).put(definition.getName(), definition);
        return true;
    }

    public Definition find(String id){
        for(int i = scope; i>=0; i--){
            Definition def = table.get(i).get(id);
            if(def != null){
                return def;
            }
        }
        return null;
    }

    public Definition findInCurrentScope(String id){
        return table.get(scope).get(id);
    }

}
