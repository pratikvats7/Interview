package dsprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute    {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        //permute(nums);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> asf = new ArrayList<>();
        permutation(nums,0,asf);
        for(List<Integer> list : asf) {
            for(Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return asf;
    }
    private void permutation(int[] nums, int idx , List<List<Integer>> asf) {
        if (idx >= nums.length) {
            asf.add(Arrays.stream(nums).boxed().toList());
            return;
        }
        for (int j = idx; j < nums.length; j++) {
            swap(nums, idx, j);
            permutation(nums, idx + 1,asf);
            swap(nums, idx, j);
        }
    }

    private void swap(int[] arr, int idx, int j) {
        int temp = arr[idx];
        arr[idx] = arr[j];
        arr[j] = temp;
    }
}
