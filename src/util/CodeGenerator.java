package util;

import ast.types.CharacterType;
import ast.types.DoubleType;
import ast.types.IntegerType;
import ast.types.Type;
import codegeneration.AddressCGVisitor;
import codegeneration.ExecuteCGVisitor;
import codegeneration.ValueCGVisitor;

import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {
    private FileWriter outputFile;
    private String sourceFile;
    private int labelCounter = 0;

    public CodeGenerator(String sourceFile){
        try{
            outputFile = new FileWriter("output.txt", false);
            this.sourceFile = sourceFile;
            addSource();
        } catch(IOException e){
            e.printStackTrace();
        }
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

    public String nextLabel() {
        String labelString = "label"+labelCounter;
        labelCounter++;
        return labelString;
    }

    public void convertTo(Type from, Type to){
        try {
            if (from instanceof IntegerType) {
                if (to instanceof CharacterType) {
                    this.outputFile.write("i2b\n");
                } else if (to instanceof DoubleType) {
                    this.outputFile.write("i2f\n");
                }
            } else if (from instanceof DoubleType) {
                if (to instanceof IntegerType) {
                    this.outputFile.write("f2i\n");
                } else if (to instanceof CharacterType) {
                    this.outputFile.write("\tf2i");
                    this.outputFile.write("\ti2b");
                }
            } else if (from instanceof CharacterType) {
                if (to instanceof IntegerType) {
                    this.outputFile.write("\tb2i");
                } else if (to instanceof DoubleType) {
                    this.outputFile.write("\tb2i");
                    this.outputFile.write("\ti2f");
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
