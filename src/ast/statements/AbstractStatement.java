package ast.statements;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractStatement extends AbstractASTNode implements Statement {

    private Type returnType;
    public AbstractStatement(int line, int column) {
        super(line, column);
    }

    public Type getReturnType(){
        return this.returnType;
    }

    public void setReturnType(Type type){
        this.returnType = type;
    }
}
