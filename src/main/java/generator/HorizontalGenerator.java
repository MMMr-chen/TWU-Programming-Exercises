package generator;

import printer.Printer;

public class HorizontalGenerator {
    private Printer printer;
    public HorizontalGenerator(Printer printer){
        this.printer = printer;
    }
    public void generate(int n){
        String result = "";
    for (int i=0;i<n;i++){
        result += '*';
    }
        printer.print(result);

    }
}
