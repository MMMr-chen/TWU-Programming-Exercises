package generator;

import printer.Printer;

public class DiamondGenerator {
    private Printer printer;
    public DiamondGenerator(Printer printer){
        this.printer = printer;
    }
    public void generate(int totalLine){
        String result = "";
        for (int i=0;i<2*totalLine-1;i++){
            result+= lineGenerate(i+1,totalLine);
        }
        printer.print(result);

    }
    private String lineGenerate(int lineNumber,int totalLine){
        String result = "";
        int asteriskNum = 2*totalLine-1-2*Math.abs(totalLine-lineNumber);
        int spaceNum = (2*totalLine-1-asteriskNum)/2;
        for (int i=0;i<spaceNum;i++){
            result += ' ';
        }
        for (int i=0;i<asteriskNum;i++){
            result += '*';
        }
        result += '\n';
        return result;
    }
}
