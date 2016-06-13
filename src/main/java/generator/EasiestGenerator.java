package generator;

import printer.Printer;

public class EasiestGenerator {
    private Printer printer;
    public EasiestGenerator(Printer printer){
        this.printer = printer;
    }
    public void generate(){
        String result = "";
        result += "*";
        printer.print(result);

    }
}
