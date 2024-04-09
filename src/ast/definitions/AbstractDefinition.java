package ast.definitions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {
    private Type type;
    private String name;
    private int scope;
    private int offset;
    public AbstractDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScope(){
        return this.scope;
    }

    @Override
    public void setScope(int scope){
        this.scope = scope;
    }

    @Override
    public int getOffset(){
        return this.offset;
    }

    @Override
    public void setOffset(int offset){
        this.offset = offset;
    }
}
