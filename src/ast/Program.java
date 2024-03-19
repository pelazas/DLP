package ast;

import ast.definitions.Definition;
import semantic.visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode{

    private List<Definition> definitions;
    public Program(int line, int column, List<Definition> definitions) {
        super(line, column);
        this.definitions = definitions;
    }


    public List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
