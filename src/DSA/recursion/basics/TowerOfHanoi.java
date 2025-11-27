package DSA.recursion.basics;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void TOH(int n, int A, int B, int C){
        if(n > 0){
            TOH(n - 1, A, C, B);
            System.out.println("(" + A + "," + C + ")");
            TOH(n -1, B, A, C);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        System.out.println("The steps for shifting disks from A(1) to C(3) using B(2) are as follows:");
        TOH(n, 1, 2,3);
    }
}
