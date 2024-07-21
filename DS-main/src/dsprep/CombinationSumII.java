package dsprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSumII {
    public static void main(String[] args) {

        int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 5;
        CombinationSumII combinationSumII = new CombinationSumII();
        combinationSumII.combinationSumII(candidates, target);
    }
    static List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSumII(int[] candidates, int target) {
        res = new ArrayList<>();
        LinkedList<Integer> asf = new LinkedList<>();
        Arrays.sort(candidates);
        combinationSumII(candidates, target, 0, asf);
        List<List<Integer>> tt = res.stream().distinct().collect(Collectors.toList());
        System.out.println(tt);// Convert each list to a set
        return tt;
    }

    private void combinationSumII(int[] candidates, int target, int i, LinkedList<Integer> ints) {

        if (target == 0) {
            res.add(new ArrayList<>(ints));
            return;
        }
        if (i == candidates.length) {
            return;
        }
        if (target < 0) {
            return;
        }

        if(i < candidates.length - 1 && target - candidates[i] >=0) {
            ints.add(candidates[i]);
            combinationSumII(candidates, target, i + 1, ints);
            ints.removeLast();
        }

        while (i < candidates.length - 1 && candidates[i] == candidates[i + 1]) {
            i++;
        }
        combinationSumII(candidates, target, i + 1, ints);
    }
}
