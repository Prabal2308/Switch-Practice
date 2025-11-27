package DSA.recursion.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSubsequencesWithSumK {
    public static void findSubsequence(int index, List<Integer> arr, List<Integer> temp,int s, int sum, int n){
        if(index >= n){
            if(s == sum) {
                for (Integer element : temp) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            return;
        }

        temp.add(arr.get(index));
        s += arr.get(index);
        findSubsequence(index + 1, arr, temp, s, sum, n);
        s -= arr.get(index);
        temp.remove(arr.get(index));
        findSubsequence(index + 1, arr, temp, s, sum , n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Enter the length of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the value of sum: ");
        k = sc.nextInt();
        System.out.print("Enter the elements: ");
        List<Integer> listOfElements = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            listOfElements.add(j);
        }
        System.out.println("Subsequences with sum " + k + " are:");
        findSubsequence(0, listOfElements, new ArrayList<>(), 0, k, n);
    }
}
