package DSA.recursion.basics;

import java.util.Scanner;

public class ReverseArrayUsingRecursion {

    public static void reverse(int i, int[] arr, int n){
        if(i >= n/2) return;

        arr[i] += arr[n - i - 1];
        arr[n - i - 1] = arr[i] - arr[n - i - 1];
        arr[i] -= arr[n - i - 1];

        reverse(i + 1, arr, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array in reverse order is as follows:");
        reverse(0, arr, arr.length);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
