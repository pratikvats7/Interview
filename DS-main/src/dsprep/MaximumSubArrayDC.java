package dsprep;

public class MaximumSubArrayDC {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubArrayDC maximumSubArrayDC = new MaximumSubArrayDC();
        System.out.println(maximumSubArrayDC.maxSubArray(nums));
    }

    private int maxSubArray(int[] nums) {
        return maxSumArrayHelper(nums,0,nums.length-1);
    }

    private int maxSumArrayHelper(int[] nums, int start, int end) {

        if(start==end) {
            return nums[start];
        }
        int mid = start+(end-start)/2;
        int maxLeftSum = maxSumArrayHelper(nums,start,mid);
        int maxRightSum = maxSumArrayHelper(nums,mid+1,end);

        //Max Cross Boder Sum

        int maxLeftBorderSum = Integer.MIN_VALUE;
        int leftSum = 0;
        for(int i=mid;i>=start;i--) {
            leftSum+=nums[i];
            maxLeftBorderSum = Math.max(maxLeftBorderSum,leftSum);
        }
        int maxRightBorderSum = Integer.MIN_VALUE;
        int rightSum = 0;
        for(int i=mid+1;i<=end;i++) {
            rightSum+=nums[i];
            maxRightBorderSum = Math.max(maxRightBorderSum,rightSum);
        }
        return Math.max(Math.max(maxLeftSum,maxRightSum),maxLeftBorderSum+maxRightBorderSum);

    }
}
