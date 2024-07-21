package Java.interview;

import java.util.Arrays;

public class CustomClass {

    public static void main(String[] args) {
        Integer[] nums = {99, 37, 222, 107, 5}; // .... 222
        sortArray(nums);

    }

    private static void sortArray(Integer[] nums) {
        // todo
        for(int i =0;i<=nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
                //System.out.println(Arrays.asList(nums));
            }
        }

        System.out.println(Arrays.asList(nums));
    }

    private static void swap(Integer[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
