package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    boolean lValue;
    Type type;
    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    public void setLValue(boolean lValue){
        this.lValue = lValue;
    }
    public boolean getLValue(){
        return lValue;
    }

    public void setType(Type type){
        this.type = type;
    }

    public Type getType(){
        return this.type;
    }
}
