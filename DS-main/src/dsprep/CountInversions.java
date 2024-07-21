package dsprep;

import java.util.Arrays;

public class CountInversions {

    public static void main(String[] args) {
        int[][] requirements = {{2,0}};
        CountInversions countInversions = new CountInversions();
        System.out.println(countInversions.numberOfPermutations(3,requirements));
    }

    static int count =0;
    public int numberOfPermutations(int n, int[][] requirements) {

        count =0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        permute(requirements,0,nums);
        return count;
    }

    private void permute(int[][] requirements, int idx,int[] nums) {

        if(idx==nums.length) {
            count++;
            return;
        }
        for (int j = idx; j < nums.length; j++) {
            swap(nums, idx, j);
            if(isValid(requirements,nums,idx)) {
                permute(requirements, idx + 1, nums);
            }
            swap(nums, idx, j);
        }
    }
    private boolean isValid(int[][] requirements, int[] nums,int idx) {;
        return Arrays.stream(requirements)
                .anyMatch(x -> isNotValidCount(x[0], nums, x[1]));
    }
    private void swap(int[] arr, int idx, int j) {
        int temp = arr[idx];
        arr[idx] = arr[j];
        arr[j] = temp;
    }
    private boolean isNotValidCount(int x, int[] nums, int y) {
       return true;
    }
}
