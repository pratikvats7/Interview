package interview;

public class MissingNumber {

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[]{1}));

    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            int num = Math.abs(nums[i])%(n+1);
            if(num<n){
                if(nums[num]==0){
                    nums[num]= nums.length+1;
                }
                nums[num] = -1*nums[num];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i;
            }
        }

        return n;
    }
}
