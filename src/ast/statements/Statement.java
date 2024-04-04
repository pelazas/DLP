package ast.statements;

import ast.ASTNode;
import ast.types.Type;

public interface Statement extends ASTNode {
    public Type getReturnType();
    public void setReturnType(Type type);
}
