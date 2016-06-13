package generator;

import printer.Printer;

public class VerticalGenerator {
    private Printer printer;
    public VerticalGenerator(Printer printer){
        this.printer = printer;
    }
    public void generate(int n){
        String result = "";
        for (int i=0;i<n;i++){
            result += "*\n";
        }
        printer.print(result);

    }
}
