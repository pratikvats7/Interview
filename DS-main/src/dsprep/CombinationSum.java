package dsprep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        CombinationSum combinationSum = new CombinationSum();
        combinationSum.combinationSum(candidates, target);
    }
    static List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        LinkedList<Integer> asf = new LinkedList<>();
        combinationSum(candidates, target, 0, asf);
        System.out.println(res);
        return res;
    }

    private void combinationSum(int[] candidates, int target, int i, LinkedList<Integer> ints) {

        if (target == 0) {
            List<List<Integer>> list = new ArrayList<>();
            res.add(new ArrayList<>(ints));
            return;
        }
        if (i == candidates.length) {
            return;
        }
        if (target < 0) {
            return;
        }
        ints.add(candidates[i]);
        combinationSum(candidates, target - candidates[i], i , ints);
        ints.removeLast();
        combinationSum(candidates, target, i + 1, ints);
    }
}
