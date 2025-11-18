package DSA.basics.recursion;

import java.util.Scanner;

public class FactorialOfNo {
    //using loops
    public static int factorialLoop(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact*=i;
        }
        return fact;
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        else return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial needs to be calculated: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorialLoop(n));
    }
}