package generator;

import printer.Printer;

import java.util.ArrayList;
import java.util.List;

public class FactorsGenerator {

    private List<Integer> result;
    public FactorsGenerator(){
        result = new ArrayList<>();
    }
    public List<Integer> generate(int n){
        result.add(generateFactors(n));
        if (result.contains(n)){
            result.clear();
        };

        return result;

    }

    private int generateFactors(int n) {
        int temp=0;
        for (int i=2;i<n;i++){
            if (n%i == 0){
                temp = n/i;
                result.add(i);
                return generateFactors(temp);
            }
        }
        return n;
    }
}
