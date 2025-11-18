package DSA.basics.recursion;

import java.util.Scanner;

public class SumOfNNaturalNo {
    public static int sum(int n){
        if(n < 1) return 0;
        else return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of natural numbers to sum: ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " natural numbers is: " + sum(n));

        //also sum of n natural numbers is having a formula = n(n+1)/2
    }
}
