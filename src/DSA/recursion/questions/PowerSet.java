package DSA.recursion.questions;

import DSA.utility.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {
        int n = InputHelper.readInt("Enter the length of array:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = InputHelper.readInt("Enter the value: ");
        }
        List<List<Integer>> powerSet = new ArrayList<>();
        generateSubset(0, new ArrayList<Integer>(), arr, powerSet);

        for(List<Integer> s: powerSet){
            System.out.print(s + " ");
        }

        System.out.println();

        powerSet.clear();

        generatePowerSet(arr, powerSet);

        for(List<Integer> s: powerSet){
            System.out.print(s + " ");
        }
    }

    private static void generatePowerSet(int[] arr, List<List<Integer>> powerSet) {
        for(int i = 0; i <= ((1 << arr.length) - 1); i++){
            List<Integer> set = new ArrayList<>();
            for(int j = 0; j < arr.length; j++){
                if((i & (1 << j)) != 0){
                    set.add(arr[j]);
                }
            }
            powerSet.add(set);
        }
    }

    private static void generateSubset(int i, List<Integer> set, int[] arr, List<List<Integer>> powerSet) {

        if(i >= arr.length){
            powerSet.add(new ArrayList<>(set));
            return;
        }

        set.add(arr[i]);
        generateSubset(i + 1, set , arr, powerSet);
        set.remove(set.size() - 1);
        generateSubset(i + 1, set, arr, powerSet);
    }
}
