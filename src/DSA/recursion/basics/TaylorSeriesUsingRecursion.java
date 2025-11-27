package DSA.recursion.basics;

import java.util.Scanner;

public class TaylorSeriesUsingRecursion {
    static int pow = 1, fact = 1;

    public static double e(int x, int n){
        if(n == 0) return 1;
        else{
            double result = e(x, n-1);
            pow*=x;
            fact*=n;
            return result + ((double)pow/(double)fact);
        }
    }
    static int s = 1;

    public static double e1(int x, int n){ // Taylor series using Horner's Rule recursive
        if(n == 0) return s;

        s = 1 + (s*x)/n;

        return e(x, n-1);
    }

    public static double e1Iterative(int x, int n){ //Taylor Series using Horner's Rule Iterative
        double s = 1;

        for(int i = n; i > 0; i--){
            s = 1 + (s*x)/i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.print("Value of Taylor Series is: " + e1Iterative(x, n));
    }
}
