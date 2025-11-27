package DSA.recursion.questions;

import java.util.Scanner;

public class myATOI {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static int convertStringToInteger(int i, int sign, long result, int state, String input){
        if(i >= input.length() || state == 3){
            long val = sign * result;
            if(val > INT_MAX) return INT_MAX;
            if(val < INT_MIN) return INT_MIN;
            return (int)val;
        }

        char a = input.charAt(i);

        if(state == 0){
            if(a == ' ') return convertStringToInteger(i + 1, sign, result, state, input);
            return convertStringToInteger(i, sign, result, 1, input);
        }

        if(state == 1){
            if(a == '+') return convertStringToInteger(i + 1, 1, result, 2, input);
            else if(a == '-') return convertStringToInteger(i + 1, -1 , result, 2, input);

            return convertStringToInteger(i, sign, result, 2, input);
        }

        if(state == 2){
            if(Character.isDigit(a)){
                int digit = a - '0';
                result = result * 10 + digit;
                long val = sign * result;
                if(val > INT_MAX) return INT_MAX;
                if(val < INT_MIN) return INT_MIN;
                return convertStringToInteger(i + 1, sign, result, state, input);
            } else{
                return convertStringToInteger(i, sign, result, 3, input);
            }
        }

        long val = sign * result;
        if(val > INT_MAX) return INT_MAX;
        if(val < INT_MIN) return INT_MIN;
        return (int)val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("The integer out of the String is: " + convertStringToInteger(0, 1, 0, 0, s));
    }
}
