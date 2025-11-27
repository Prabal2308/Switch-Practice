package DSA.recursion.questions;

import DSA.utility.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryStrings {
    
    public static void generateStrings(int lastDigit, int n, String s, List<String> allGeneratedStrings){
        if(n <= 0){
            allGeneratedStrings.add(s);
            return;
        }

        generateStrings(0, n - 1, s + "0", allGeneratedStrings);
        if(lastDigit == 0) generateStrings(1, n - 1, s + "1", allGeneratedStrings);
    }

    public static void main(String[] args) {
        int n = InputHelper.readInt("Enter the length of the strings to be generated: ");
        List<String> generatedStrings = new ArrayList<>();
        generateStrings(0, n, "", generatedStrings);
        for(String s: generatedStrings){
            System.out.print(s + " ");
        }
    }
}
