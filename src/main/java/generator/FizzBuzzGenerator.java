package generator;

import printer.Printer;

public class FizzBuzzGenerator {
    private Printer printer;
    public FizzBuzzGenerator(Printer printer){
        this.printer = printer;
    }
    public void generate(int totalLine){
        String result = "";
        for (int i=0;i<totalLine;i++){
            result+= lineGenerate(i+1);
        }
        printer.print(result);

    }
    private String lineGenerate(int number) {
        String result = "";
        result += judge(number);
        return result;

    }
    private String judge(int number){
        String result = "";
        if (number%3 == 0){
            result += "Fizz";
        }
        if (number%5 == 0){
            result += "Buzz";
        }
        if (number%3 !=0 && number%5 != 0){
            result += number;
        }
        result += '\n';
        return result;
    }
}
