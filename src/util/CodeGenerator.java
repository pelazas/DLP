package util;

import codegeneration.AddressCGVisitor;
import codegeneration.ExecuteCGVisitor;
import codegeneration.ValueCGVisitor;

import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {
    private static CodeGenerator cg;
    private FileWriter outputFile;
    private String sourceFile;

    private int labelCounter = 0;

    private CodeGenerator(String sourceFile){
        try{
            outputFile = new FileWriter("output.txt", false);
            this.sourceFile = sourceFile;
            addSource();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static CodeGenerator getInstance(String source){
        if(cg == null){
            cg = new CodeGenerator(source);
        }
        return cg;
    }

    private void addSource(){
        try {
            outputFile.write("#source " + "\"" + sourceFile+"\"");
            outputFile.write("\n");
            outputFile.flush();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void addLineOfCode(String line){
        if(!line.equals("")) {
            try {
                outputFile.write(line + "\n");
                outputFile.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void newLine(){
        try{
            outputFile.write("\n");
            outputFile.flush();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private static AddressCGVisitor addressCGVisitor;
    private static ValueCGVisitor valueCGVisitor;
    private static ExecuteCGVisitor executeCGVisitor;
    public AddressCGVisitor getAddressCGVisitor(){
        if(addressCGVisitor == null) addressCGVisitor = new AddressCGVisitor(this);
        return addressCGVisitor;
    }
    public ValueCGVisitor getValueCGVisitor(){
        if(valueCGVisitor == null) valueCGVisitor = new ValueCGVisitor(this);
        return valueCGVisitor;
    }
    public ExecuteCGVisitor getExecuteCGVisitor(){
        if(executeCGVisitor == null) executeCGVisitor = new ExecuteCGVisitor(this);
        return executeCGVisitor;
    }

    public String nextLabel() {
        labelCounter++;
        return "label"+labelCounter;
    }
}
