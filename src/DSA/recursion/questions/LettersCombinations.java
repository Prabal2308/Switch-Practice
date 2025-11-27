package DSA.recursion.questions;

import DSA.utility.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class LettersCombinations {

    public static void main(String[] args) {
        String digits = InputHelper.readString("Enter the digits: ");

        String[] alphabetMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> combStrings = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            System.out.println(combStrings);
            return;
        }

        backTrack(0, new StringBuilder(), digits, alphabetMap, combStrings);

        for(String s : combStrings){
            System.out.print(s + " ");
        }
    }

    private static void backTrack(int index, StringBuilder stringBuilder, String digits, String[] alphabetMap, List<String> combStrings) {
        if(index == digits.length()){
            combStrings.add(stringBuilder.toString());
            return;
        }

        String letters = alphabetMap[digits.charAt(index) - '0'];

        for(char c : letters.toCharArray()){
            stringBuilder.append(c);
            backTrack(index + 1, stringBuilder, digits, alphabetMap, combStrings);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
