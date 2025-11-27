package DSA.recursion.basics;

import java.util.Scanner;

public class TreeRecursion {

    static void fun(int n){
        if(n > 0){
            System.out.print(n);
            fun(n - 1);
            fun(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        fun(num);
    }
}
