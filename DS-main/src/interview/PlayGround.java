package interview;

import java.util.*;

public class PlayGround {

    static Comparator<String> stringComparator = Comparator.comparingInt(String::length).thenComparing(String::compareTo);
    public static void main(String[] args) {
        String ar[] = {"22:59","01:30","00:00"};
        //System.out.println(findMinDifference(Arrays.asList(ar)));
        //System.out.println(countSubstrings("aaa"));
        //isAnagram("aa","bb");
        //System.out.println(longestCommonPrefix(new String []{"flower","flow","flight"}));
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};
        int[] interleavedArray = interleaveSorted(nums);
        //System.out.println(Arrays.toString(interleavedArray));
        //System.out.println(kthLargestNumber(new String[]{"2","21","12","1"},3));
        System.out.println(permute(new int[]{1,2,3}));
    }

    public static List<List<Integer>> permute(int[] nums) {


        return permute(nums,new ArrayList<Integer>(),0);
    }
    public static List<List<Integer>> permute(int[] nums,List<Integer> asf,int index) {
        if(index>=(nums.length)){
            List<List<Integer>> ar = new ArrayList<>();
            return ar;
        }
        for(int startingIndex = index ;startingIndex<nums.length;startingIndex++){
            asf.add(nums[startingIndex]);
            List<List<Integer>> res = permute(nums,asf,startingIndex+1);
            asf = new ArrayList<>();
            System.out.println(res);
        }
        asf.add(nums[index]);
        return null;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high) {
            while (nums[high] == 2) {
                high--;
            }
            while (nums[low] == 0) {
                low++;
                mid++;
            }
            while (mid < high && nums[mid] == 1) {
                mid++;
            }
            if (mid < nums.length - 1) {
                int temp;
                if (nums[mid] == 0) {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                } else {
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                }

            }
        }

    }

    public static String kthLargestNumber(String[] nums, int k) {

        return kthLargestNumber(nums,0,nums.length-1,nums.length-k+1);
    }
    public static String kthLargestNumber(String[] nums, int s, int e, int k) {
        int pivot = partition(nums, s, e);
        String res = "";
        if(pivot == k-1){
            return nums[pivot];
        }
        if(pivot < k-1){
            res = kthLargestNumber(nums, pivot+1, e, k);
        }else{
            res = kthLargestNumber(nums, s, pivot-1, k);
        }
        return res;
    }

    private static int partition(String[] nums, int s, int e) {
        int count = s;
        for (int i = s+1; i <= e; i++) {
            if (stringComparator.compare(nums[i], nums[s]) <= 0) {
                count++;
            }
        }
        swap(nums, count, s);
        int i = s, j = e;
        while (i < count && j > count) {
            while (i < count && stringComparator.compare(nums[i], nums[count]) <= 0) {
                i++;
            }
            while (j > count && stringComparator.compare(nums[j], nums[count]) > 0) {
                j--;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        return count;
    }

    private static void swap(String[] nums, int i, int j) {
        String temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int[] interleaveSorted(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length;
        int half = n / 2;


        int[] result = new int[n];

        int j = n-1,k=half-1;
        if (n % 2 != 0) {
            k++;
        }
        for (int i = 0; i < half; i++) {
            result[2 * i] = nums[k--]; // First half
            result[2 * i + 1] = nums[j--]; // Second half (opposite order)
        }

        if (n % 2 != 0) {
            result[n - 1] = nums[0];
        }

        // If the array length is odd, add the last element from the second half

        return result;
    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();
        int x = 0;
        while (x <= strs[0].length()) {
            char prev = strs[0].charAt(x);
            for (String str : strs) {
                if (str.charAt(x) != prev) {
                    return ans.toString();
                }
            }
            ans.append(prev);
            x++;
        }
        return ans.toString();
    }

//    public static  boolean isAnagram(String s, String t) {
//
//        if(s.length()!=t.length()){
//            return false;
//        }
//        char[] ar1 = s.toCharArray();
//        char[] ar2 = t.toCharArray();
//        Arrays.sort(ar1);
//        Arrays.sort(ar2);
//        for(int i =0;i<ar1.length;i++){
//            if(ar1[i]!=ar2[i]){
//                return false;
//            }
//        }
//        return true;
//    }

    public static int countSubstrings(String s) {
        int oddKaAns=0,evenKaAns = 0;
        for(int centre=0;centre<s.length();centre++){
            oddKaAns = oddKaAns + expandAroundIndex(s,centre,centre);
            evenKaAns = evenKaAns + expandAroundIndex(s,centre,centre+1);
        }
        return oddKaAns+evenKaAns;
    }

    private static int expandAroundIndex(String s, int left, int right) {
        int count = 0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static int findMinDifference(List<String> timePoints) {

        ArrayList<Integer> minutes = new ArrayList<>();
        for (String timepoint: timePoints) {
            String[] ar = timepoint.split(":");
            int min = Integer.parseInt(ar[0])*60+Integer.parseInt(ar[1]);
            minutes.add(min);
            minutes.add(min-1440);

        }
        Collections.sort(minutes);
        System.out.println(minutes);
        int min = Integer.MAX_VALUE;
        for(int i =0;i<minutes.size()-1;i++){
            int diff = minutes.get(i+1)-minutes.get(i);
            if(diff<min){
                min = diff;
            }
        }

        return min;
    }

    public boolean validPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                i++;
                j--;
            } else {
                return checkPalindrome(s, i + 1, j) || checkPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean checkPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
