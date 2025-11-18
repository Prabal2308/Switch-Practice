package DSA.questions;

import java.util.Locale;
import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of string: ");
        String s = sc.nextLine();
        boolean isValid = isPalindrome(s);

        if(isValid) System.out.println("String " + s + " is valid palindrome");
        else System.out.println("String " + s + " is not valid palindrome");
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        return checkValidPalindrome(0, s);
    }

    private static boolean checkValidPalindrome(int i, String s) {
        if(i > s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        return checkValidPalindrome(i + 1, s);
    }
}
