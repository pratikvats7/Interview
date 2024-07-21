package dsprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CanDistribute {
    private HashMap<Integer, Integer> numsCount = new HashMap<>();

    public static void main(String[] args) {
        CanDistribute canDistribute = new CanDistribute();
        canDistribute.canDistribute(new int[]{1,2,3,4}, new int[]{2,1,2,1,2,1,2,1});
    }
    public boolean canDistribute(int[] nums, int[] quantity) {
        numsCount.clear();
        for (int num : nums) {
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1);
        }
        Integer[] qty = Arrays.stream(quantity)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
        return canDistribute(new ArrayList<>(numsCount.keySet()), qty, 0);
    }

    private boolean canDistribute(ArrayList<Integer> nums, Integer[] quantity, int i1) {
        if (i1 >= quantity.length) {
            return true;
        }

        for (int k = 0; k < nums.size(); k++) {
            int num = nums.get(k);
            int count = numsCount.get(num);
            if (count >= quantity[i1]) {
                numsCount.put(num, count - quantity[i1]);
                if (canDistribute(nums, quantity, i1 + 1)) {
                    return true;
                }
                numsCount.put(num, count); // Backtrack
            }
        }
        return false;
    }
}
