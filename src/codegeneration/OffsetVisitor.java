package codegeneration;

import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VariableDefinition;
import ast.types.FunctionType;
import ast.types.StructFieldType;
import ast.types.StructType;
import semantic.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {

    /*
    * (P) FuncDefinition: definition -> type ID definition* statement*
    * (R)
    * int localsBytesSum = 0;
    * for(Definition def:definition*){
    *   localsBytesSum += def.type.numberOfBytes();
    *   def.offset -= localsBytesSum;
    * }
    *
    * (P) VarDefinition: definition -> type ID
    * (R)
    * // globalsBytesSum is a global variable initialized to 0
    * if(definition.scope == 0){
    *   definition.offset = globalsBytesSum
    *   globalBytesSum += definition.type.numberOfBytes();
    * }
    *
    * (P) FuncType: type1 -> type2 definition*
    * (R)
    * int paramsBytesSum = 0;
    * for(int i = definition*.size()-1; i>=0;i--){
    *   Definition def = definition*.get(i);
    *   def.offset = 4 + paramBytesSum;
    *   paramBytesSum += def.type.numberOfBytes();
    * }
    *
    * (P) StructType: type -> structfield*
    * (R)
    * int fieldsBytesSum = 0;
    * for(StructFieldType sf: structfield*){
    *   sf.offset = fieldsBytesSum;
    *   fieldsBytesSum += sf.type.numberOfBytes;
    * }
    *
    */

    int globalsBytesSum = 0;

    public Void visit(StructType st, Void p){
        int fieldsBytesSum = 0;
        for(StructFieldType sf: st.getStructFields()){
            sf.accept(this,null);
            sf.setOffset(fieldsBytesSum);
            fieldsBytesSum += sf.getType().getNumberOfBytes();

        }
        return null;
    }

    public Void visit(FunctionType functionType, Void p){
        int paramsBytesSum = 0;
        for(int i = functionType.getVariableDefinitions().size()-1; i>=0;i--){
            VariableDefinition var = functionType.getVariableDefinitions().get(i);
            var.accept(this,null);
            var.setOffset(4 + paramsBytesSum);
            paramsBytesSum += var.getType().getNumberOfBytes();
        }
        return null;
    }

    public Void visit(VariableDefinition variableDefinition, Void p){
        super.visit(variableDefinition, null);
        if(variableDefinition.getScope() == 0){
            variableDefinition.setOffset(globalsBytesSum);
            globalsBytesSum += variableDefinition.getType().getNumberOfBytes();
        }
        return null;
    }

    public Void visit(FuncDefinition funcDefinition, Void p){
        super.visit(funcDefinition, null);
        int localsBytesSum = 0;
        for(VariableDefinition var: funcDefinition.getVariableDefinitions()){
            localsBytesSum += var.getType().getNumberOfBytes();
            var.setOffset(var.getOffset() - localsBytesSum);
        }
        return null;
    }
}
