package dsprep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermuteUnique {

    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        PermuteUnique permuteUnique = new PermuteUnique();
        permuteUnique.permuteUnique(nums);
        List<List<Integer>> ans = res.stream().distinct().toList();
        System.out.println(ans);
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
       LinkedList<Integer> asf = new LinkedList<>();
       for(int i=0;i<nums.length;i++){
           asf.add(0);
       }
        return permuteUnique(nums, 0,asf);
    }

    private List<List<Integer>> permuteUnique(int[] nums, int idx, LinkedList<Integer> asf) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(asf));
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            if(asf.get(i)!=0){
                continue;
            }
            asf.set(i,nums[idx]);
            permuteUnique(nums, idx+1, asf);
            asf.set(i,0);
        }
        return res;
    }
}
