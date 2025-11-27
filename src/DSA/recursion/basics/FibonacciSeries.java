package DSA.recursion.basics;

import java.util.Scanner;

public class FibonacciSeries {

    public static int fib(int n){
        if(n <= 1) return n;

        return fib(n - 2) + fib(n - 1);
    }

    public static int fibIterative(int n){
        int a = 0, b = 1, s = 0;
        for (int i = 2; i <= n; i++){
            s = a + b;
            a = b;
            b = s;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fibonacci number to print: ");
        int n = sc.nextInt();
        System.out.println("The value of " + n + "th fibonacci number is: " + fibIterative(n));
    }
}
