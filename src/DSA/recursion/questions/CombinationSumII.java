package DSA.recursion.questions;

import DSA.utility.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {

    private static void backtrack(int[] freq, int target, List<List<Integer>> res, List<Integer> currComb, int idx) {
        if (target < 0)
            return;

        if (target == 0) {
            res.add(new ArrayList<>(currComb));
            return;
        }

        for (int i=idx; i<freq.length && i <= target; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                currComb.add(i);
                backtrack(freq, target-i, res, currComb, i);
                currComb.remove(currComb.size() - 1);
                freq[i]++;
            }
        }
    }

    public static void main(String[] args) {
        int n = InputHelper.readInt("Enter the size of array: ");
        int[] candidates = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            candidates[i] = InputHelper.readInt("");
        }

        int[] freq = new int[51];

        for(int nums: candidates){
            freq[nums]++;
        }

        int target = InputHelper.readInt("Enter the target value: ");

        List<List<Integer>> allUniqueCombinations = new ArrayList<>();

        backtrack(freq, target, allUniqueCombinations, new ArrayList<>(), 0);

        System.out.println("All possible unique combinations are: ");
        for(List<Integer> combination : allUniqueCombinations){
            System.out.print(combination + " ");
        }
    }
}
