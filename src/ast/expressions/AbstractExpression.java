package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    boolean lValue;
    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    public void setLValue(boolean lValue){
        this.lValue = lValue;
    }
    public boolean getLValue(){
        return lValue;
    }

}
