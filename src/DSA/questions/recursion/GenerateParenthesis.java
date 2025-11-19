package DSA.questions.recursion;

import DSA.utility.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void generate(int index, String s, int openBracketCount, int closeBracketCount, List<String> list, int n){
        if(openBracketCount > n) return;
        if(closeBracketCount > openBracketCount) return;

        if(index == 2 * n){
            if(openBracketCount == closeBracketCount){
                list.add(s);
            }
            return;
        }

        generate(index + 1, s + "(", openBracketCount + 1, closeBracketCount, list, n);
        generate(index + 1, s + ")", openBracketCount, closeBracketCount + 1, list, n);
    }

    public static void main(String[] args) {
        int n = InputHelper.readInt("Enter the value of n: ");
        List<String> validParenthesisList = new ArrayList<>();
        generate(0, "", 0, 0, validParenthesisList, n);
        for(String s: validParenthesisList){
            System.out.print(s + " ");
        }
    }
}
