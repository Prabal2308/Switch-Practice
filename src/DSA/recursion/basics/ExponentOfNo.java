package DSA.recursion.basics;

import java.util.Scanner;

public class ExponentOfNo {

    public static int powerLoop(int m, int n){
        int pow = 1;
        for(int i = 1; i <= n; i++){
            pow*=m;
        }
        return pow;
    }

    public static int powerOptimized(int m, int n){
        if(n == 0) return 1;
        if(n%2 == 0) return powerOptimized(m*m, n/2);
        else return m * powerOptimized(m*m, (n-1)/2);
    }

    public static int power(int m, int n){
        if(n == 1) return m;
        else return power(m, n - 1) * m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of power: ");
        int n = sc.nextInt();
        System.out.print(powerOptimized(m,n));

    }
}
