import java.util.ArrayList;
import java.util.List;

public class ChatGpt {
    static int count = 0;
    public static int countArrangement(int n) {
        count = 0;
        int [] nums = new int[n];
        for(int i =0;i<n;i++){

        }
        countArrangement(nums,0,new ArrayList<>());
        return count;
    }

    public static void countArrangement(int[] nums, int idx, List<Integer> asf) {
        if (idx >= nums.length) {
            count++;
        }
        for (int i = idx; i < nums.length; i++) {
            if (nums[i] % (idx + 1) == 0 || (idx + 1) % nums[i] == 0) {
                swapAr(nums, i, idx);
                countArrangement(nums, idx + 1, asf);
                swapAr(nums, i, idx);
            }
        }
    }

    static void swapAr(int[] ar, int i, int i1) {
        int temp = ar[i];
        ar[i] = ar[i1];
        ar[i1]=temp;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6};
        countArrangement(ar,0,new ArrayList<>());
        System.out.println(count);
    }
}