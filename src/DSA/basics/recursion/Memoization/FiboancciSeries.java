package DSA.basics.recursion.Memoization;

import java.util.Scanner;

public class FiboancciSeries {
    static int[] arr;

    public static int fib(int n){
        if(n <= 1) {
            arr[n] = n;
            return n;
        }
        else{
            if(arr[n - 2] == -1) arr[n - 2] = fib(n - 2);
            if(arr[n - 1] == -1) arr[n - 1] = fib(n - 1);
            arr [n] = arr[n - 2] + arr[n - 1];
            return arr[n - 2] + arr[n - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fibonacci numer to print: ");
        int n = sc.nextInt();
        arr = new int[n + 1];
        System.out.println("The value of " + n + "th Fibonacci number is: " + fib(n));
    }
}
