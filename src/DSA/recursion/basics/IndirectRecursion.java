package DSA.recursion.basics;

import java.util.Scanner;

public class IndirectRecursion {

    static void funA(int n){
        if(n > 0){
            System.out.print(n + " ");
            funB(n - 1);
        }
    }

    static void funB(int n){
        if(n > 1){
            System.out.print(n + " ");
            funA(n/2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        funA(num);
    }
}
