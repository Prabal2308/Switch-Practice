package DSA.recursion.basics;

import java.util.Scanner;

public class NestedRecursion {
    public static int fun1(int n){
        if(n > 100) return n -10;
        else return fun1(fun1(n+11));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        System.out.println(fun1(num));
    }
}
