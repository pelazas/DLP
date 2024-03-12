package ast.expressions;

import ast.ASTNode;
import ast.types.Type;

public interface Expression extends ASTNode {
    public boolean getLValue();
    public void setLValue(boolean lvalue);
}
