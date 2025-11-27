package DSA.recursion.basics;

import java.util.Scanner;

public class NTo1UsingBacktrack {

    public static void print(int i, int n){
        if(i > n) return;

        print(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("n to 1 printed as follows:");
        print(1,n);
    }
}
