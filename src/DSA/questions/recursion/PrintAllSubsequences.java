package DSA.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();
        System.out.println("All the subsets of the array are as follows:");
        createPowerSet(0, nums, new ArrayList<Integer>(), result);
        for(List<Integer> list : result){
            System.out.println(list + " ");
        }
    }

    private static void createPowerSet(int i, int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if(i >= nums.length){
            result.add(new ArrayList<>(tempList));
            return;
        }

        tempList.add(nums[i]);
        createPowerSet(i + 1, nums, tempList, result);
        tempList.remove(tempList.size() - 1);
        createPowerSet(i + 1, nums, tempList, result);
    }

    //timeComplexity - O(2^n)
    //spaceComplexity - O(n) stack space
}
