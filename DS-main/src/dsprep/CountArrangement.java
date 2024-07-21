package dsprep;

import java.util.LinkedList;

public class CountArrangement {

    static int count = 0;
    public static void main(String[] args) {
        CountArrangement countArrangement = new CountArrangement();
        System.out.println(countArrangement.countArrangement(10));
    }
    public int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        count = 0;
       permuteUnique(nums);
       return count;
    }

    public int permuteUnique(int[] nums) {
        count = 0;
        LinkedList<Integer> asf = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            asf.add(0);
        }
        return permuteUnique(nums, 0,asf);
    }

    private int permuteUnique(int[] nums, int idx, LinkedList<Integer> asf) {
        if (idx == nums.length) {
            System.out.println(asf);
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(asf.get(i)!=0){
                continue;
            }
            if ((nums[i] % (idx  + 1) == 0 || (idx  + 1) % nums[i] == 0)) {
                asf.set(i,nums[idx]);
                permuteUnique(nums, idx+1, asf);
                asf.set(i,0);
            }
        }
        return count;
    }
}
