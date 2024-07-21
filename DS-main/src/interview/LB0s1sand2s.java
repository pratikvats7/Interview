package interview;

import java.util.Arrays;

public class LB0s1sand2s {

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{2, 1, 2};
        sortColors(nums);

        System.out.println(Arrays.asList(nums));
    }
    public static void sortColors(Integer[] nums) {
        int propg=0,left=0,right=nums.length-1;
        while(propg<=right){

            if (nums[propg] == 2) {
                swap(nums, propg, right);
                right--;
            } else if (nums[propg] == 0) {
                swap(nums, propg, left);
                left++;
                propg++;
            } else {
                propg++;
            }
        }
    }

    public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
