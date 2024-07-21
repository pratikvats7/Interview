package interview;

import dsprep.LoveBabbarListArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
    static int count = 0;
    public static void main(String[] args) {
        //System.out.println(checkSorted(new int[]{1,2,7,6,8,9,10},0));
        //System.out.println(binarySearchRecursion(new int[]{-1,0,3,5,9,12},0,6,13));
//        distinctSubsequences("bccbcdcabadabddbccaddcbabbaaacdba","bccbbdc",0,0);
//        System.out.println(count);
        int[] nums = new int[] {1,1,1,1,1};
        int [][] dp = new int[nums.length][4];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        //System.out.println(findTargetSumWays(nums,3,0,0));
//        System.out.println(count);
        //System.out.println(partitionLabels("ababcbacadefegdehijhklij"));

//        int[] ar= new int[]{26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
//        System.out.println(countSmaller(ar));

//        LoveBabbarListArrays.printArray(ar);

        countRangeSum(new int []{0,0},0,0);

    }

    public static int countRangeSum(int[] nums, int lower, int upper) {
        count = 0;
        long[] prefixSum = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        mergeSort(prefixSum, lower, upper,0, prefixSum.length-1);
        return count;
    }


    private static void mergeSort(long[] nums, int lower, int upper, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;

        mergeSort(nums, lower, upper, left, mid);
        mergeSort(nums, lower, upper, mid + 1, right);

        mergeTwoSortedArrays(nums, lower,upper, left, right);
    }

    private static void mergeTwoSortedArrays(long[] ar, int lower, int upper, int start, int end) {

        int mid = (start+end)/2;
        int len1 = mid - start +1;
        int len2 = end - mid;
        long [] left = new long[len1];
        long [] right = new long [len2];
        //copy
        int k = start;
        for(int i = 0;i<len1;i++){
            left[i]= ar[k];
            k++;
        }

        k = mid +1;

        for(int i = 0;i<len2;i++){
            right[i]= ar[k];
            k++;
        }

        //merge logic
        int leftindex = 0;
        int rightindex = 0;
        int mainArrayIndex = start;
        int leftidx=mid,rightidx=mid+1;

        while(leftindex<len1 && rightindex<len2){
            System.out.println("hi2 "+mid);
            while(leftidx<len1 && ar[rightidx]-ar[leftidx]<lower){
                leftidx++;
            }
            while(rightidx<len2 && ar[rightidx]-ar[leftidx]>upper){
                rightidx++;
            }


            if(left[leftindex]<right[rightindex]){
                ar[mainArrayIndex++] = left[leftindex++];
            }else{
                ar[mainArrayIndex++] = right[rightindex++];
            }
        }
        count += rightidx -leftidx;
        System.out.println("couny"+count);

        //copy logic for left array
        while(leftindex<len1){
            ar[mainArrayIndex++] = left[leftindex++];
        }

        while(rightindex<len2){
            ar[mainArrayIndex++] = right[rightindex++];
        }
    }

    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n]; // Array to store counts of smaller elements
        int[] index = new int[n]; // Index array for merge sort

        for (int i = 0; i < n; i++) {
            index[i] = i; // Initialize index array
        }

        mergeSort(nums, index, counts, 0, n - 1);

        LoveBabbarListArrays.printArray(index);
        System.out.println("----");
        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }

    private static void mergeSort(int[] nums, int[] index, int[] counts, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, index, counts, left, mid);
        mergeSort(nums, index, counts, mid + 1, right);

        mergeTwoSortedArrays(nums, index,counts, left, right);
    }

    private static void mergeTwoSortedArrays(int[] ar, int[] index, int[] counts, int start, int end) {
        int mid = (start+end)/2;
        int len1 = mid - start +1;
        int len2 = end - mid;
        int [] left = new int[len1];
        int [] right = new int [len2];
        //copy
        int k = start;
        for(int i = 0;i<len1;i++){
            left[i]= index[k];
            k++;
        }

        k = mid +1;

        for(int i = 0;i<len2;i++){
            right[i]= index[k];
            k++;
        }

        //merge logic
        int leftIndex = 0;
        int rightIndex = 0;
        int mainArrayIndex = start;
        LoveBabbarListArrays.printArray(left);
        LoveBabbarListArrays.printArray(right);

        int rightCount = 0;
        while(leftIndex<len1 && rightIndex<len2){
            if(ar[left[leftIndex]]<=ar[right[rightIndex]]){
                index[mainArrayIndex++] = left[leftIndex++];
                counts[index[start+leftIndex+rightIndex-1]] += rightCount;
            }else{
                index[mainArrayIndex++] = right[rightIndex++];
                LoveBabbarListArrays.printArray(index);
                rightCount++;
            }
        }
        //copy logic for left array
        while(leftIndex<len1){
            index[mainArrayIndex++] = left[leftIndex++];
            counts[index[start+leftIndex+rightIndex-1]] += rightCount;
        }

        while(rightIndex<len2){
            index[mainArrayIndex++] = right[rightIndex++];
        }
    }

    public static List<Integer> partitionLabels(String s) {
        ArrayList<Integer> ar = new ArrayList<>();
        int start = 0;
        int lastIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           lastIndex = Math.max(s.lastIndexOf(ch),lastIndex);
            if(lastIndex==i){
                ar.add(lastIndex+1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(ar.get(0));
           for(int i =0;i<ar.size()-1;i++){
               ans.add(ar.get(i+1)-ar.get(i));
           }
        return ans;
    }

    public static int findTargetSumWays(int[] nums, int target, int sum, int idx) {

        if(idx==nums.length){
            if(target==sum){
                return 1;
            }
            return 0;
        }
        return findTargetSumWays(nums,target,sum+nums[idx],idx+1)+
        findTargetSumWays(nums,target,sum-nums[idx],idx+1);
    }

    private static void distinctSubsequences(String str, String target, int idxStr, int idxTarget) {
        if (idxTarget == target.length()) {
            count ++;
            return;
        }
        if (idxStr == str.length()) {
            return;
        }

        distinctSubsequences(str, target, idxStr + 1, idxTarget);

        if (str.charAt(idxStr) == target.charAt(idxTarget)) {
            distinctSubsequences(str, target, idxStr + 1, idxTarget + 1);
        }
    }

    private static boolean binarySearchRecursion(int[] ar,int left,int right,int target){
        if(left>right){
            return false;
        }
        int mid = left + (right-left)/2;
        if(ar[mid]==target){
            return true;
        }
        if(ar[mid]>target){
            right = mid-1;
        }
        else{
            left = mid +1;
        }
        return binarySearchRecursion(ar,left,right,target);
    }

    private static boolean checkSorted(int[] ar,int i){
       if(i>=ar.length-1){
           System.out.println("true print");
           return true;
       }
        if(ar[i+1]<ar[i]){
            System.out.println("false print");
           return false;
       }
        boolean res = checkSorted(ar,i+1);
        System.out.println(res);
        return res;
    }
}
