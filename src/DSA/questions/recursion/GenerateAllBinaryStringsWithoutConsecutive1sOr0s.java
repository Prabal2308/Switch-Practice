package DSA.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateAllBinaryStringsWithoutConsecutive1sOr0s {

    public static void generateAllBinaryStringsWithoutConsecutive1s(int n, int lastDigit, String s, List<String> list){
        if(n <= 0){
            list.add(s);
            return;
        }
        generateAllBinaryStringsWithoutConsecutive1s(n - 1, 0, s + "0", list);

        if(lastDigit == 0){
            generateAllBinaryStringsWithoutConsecutive1s(n - 1, 1, s + "1", list);
        }
    }

    public static void generateAllBinaryStringsWithoutConsecutive0s(int n, int lastDigit, String s, List<String> list){
        if(n <= 0){
            list.add(s);
            return;
        }

        generateAllBinaryStringsWithoutConsecutive0s(n - 1, 1, s + "1", list);

        if(lastDigit == 1){
            generateAllBinaryStringsWithoutConsecutive0s(n - 1, 0, s + "0", list);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the length of string: ");
        n = sc.nextInt();

        List<String> list1 = new ArrayList<>();
        generateAllBinaryStringsWithoutConsecutive1s(n, 0, "", list1);
        System.out.println("Binary String without consecutive 1s are: ");
        for(String s: list1){
            System.out.print(s + " ");
        }

        System.out.println();
        list1.clear();

        generateAllBinaryStringsWithoutConsecutive0s(n, 1, "", list1);
        System.out.println("Binary Strings without consecutive 0s are: ");
        for(String s: list1){
            System.out.print(s + " ");
        }





    }
}
