package codegeneration;
/*
* execute[[Read: statement1 -> expression1]] =
*   <' * Read>
*   value[[expression1]]
*   <in> expression1.type.suffix()
*   <store> expression1.type.suffix()
*
* execute[[Write: statement -> expression1]] =
*   <' * Write>
*   value[[expression1]]
*   <out> expression1.type.suffix()
*
* execute[[Assignment: statement -> expression1 expression2]] =
*   address[[expression1]]
*   value[[expression2]]
*   <store> expression1.type.suffix()
*
* execute[[Program: program -> definition*]] =
*   <call main>
*   <halt>
*   <' * Global variables>
*   definition*.forEach(varDef -> execute[[varDef]]);
*
* execute[[VariableDefinition: definition -> type ID]] =
*   <' * > type.toString() ID <(offset> varDefinition.offset <)>
*
* execute[[FuncDefinition: definition -> type ID varDefinition* statement*]] =
*   ID<:>
*   <' * Parameters:>
*   execute[[type]] // the parameters come in the functionType
*   <' * Local variables:>
*   definition*.forEach(varDef -> execute[[varDef]])
*   if(definition*.size() >0)
*       <enter > -(varDefinition*.get(varDefinition*.size()-1).offset)
*
*
*
*/
public class ExecuteCGVisitor //extends AbstractVisitor<Void,Void> {
{
}
