package generator;

import printer.Printer;

public class RightTriangleGenerator {
    private Printer printer;
    public RightTriangleGenerator(Printer printer){
        this.printer = printer;
    }
    public void generate(int n){
        String result = "";
        for (int i=0;i<n;i++){
            for (int k=0;k<i+1;k++) {
                result += "*";
            }
            result +="\n";
        }
        printer.print(result);

    }
}
