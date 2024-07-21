package dsprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountSmaller {

    public static void main(String[] args) {
        int[] nums = {5,2,6,1};

        CountSmaller countSmaller = new CountSmaller();
        System.out.println(countSmaller.countSmaller(nums));
    }
    public class Pair {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
    private static int[] indexes;
    private static List<Integer > res = new ArrayList<>();
    public List<Integer> countSmaller(int[] nums) {
        res = new ArrayList<>(Collections.nCopies(nums.length, 0));
        Pair[] arr = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++)
            arr[i] = new Pair(nums[i], i);

        countSmaller(arr);

        return res;
    }
    public void countSmaller(Pair[] nums) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        countSmaller(nums,0,nums.length-1);
    }

    private Pair[] countSmaller(Pair[] nums, int start, int end) {
        if(start==end) {
            return new Pair[]{nums[start]};
        }
        int mid = (start+end)/2;
        countSmaller(nums,start,mid);
        countSmaller(nums,mid+1,end);
        return merge(start,end,nums);
    }

    private Pair[] merge(int start, int end, Pair[] nums) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = start;
        int mid = start+ (end-start)/2;
        int len1 = mid - start +1;
        int len2 = end - mid;
        Pair [] left = new Pair[len1];
        Pair [] right = new Pair [len2];
        for(int i = 0;i<len1;i++) {
            left[i] = nums[start+i];
        }
        for(int i = 0;i<len2;i++) {
            right[i] = nums[mid+1+i];
        }
        while(leftIndex<left.length && rightIndex<right.length) {
            if(left[leftIndex].val> right[rightIndex].val) {
                res.set(left[leftIndex].index,res.get(left[leftIndex].index)+right.length-rightIndex);
                nums[mainIndex++] = left[leftIndex++];
            }else {
                nums[mainIndex++] = right[rightIndex++];
            }
        }
        while(leftIndex<left.length) {
            nums[mainIndex++] = left[leftIndex++];
        }
        while(rightIndex<right.length) {
            nums[mainIndex++] = right[rightIndex++];
        }
        return nums;
    }
}