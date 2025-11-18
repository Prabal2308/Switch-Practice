package DSA.questions;

import java.util.Scanner;

public class PalindromicString {

    public static boolean isPalindrome(int i, String value, int length){
        if(i >= length/2) return true;

        if(value.charAt(i) != value.charAt(length - i - 1)) return false;

        return isPalindrome(i + 1, value, length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value;
        System.out.println("Enter the string: ");
        value = sc.nextLine();

        boolean result = isPalindrome(0, value, value.length());
        if(result){
            System.out.println(value + " is palindromic");
        } else{
            System.out.println(value + " is not palindromic");
        }
    }
}
