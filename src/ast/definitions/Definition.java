package ast.definitions;

import ast.ASTNode;
import ast.types.Type;

public interface Definition extends ASTNode {
    Type getType();
    String getName();
    int getScope();
    void setScope(int scope);

    int getOffset();

    void setOffset(int offset);
}
