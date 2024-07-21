package interview;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ar = {3, 5, 1};
        // System.out.println(find(ar,ar.length,6));

        //System.out.println(search(ar, 3));

        //System.out.println(mySqrt(15));

        //System.out.println(findPairs(new int[]{3,1,4,1,5},2));

        //System.out.println(findClosestElements(new int[]{1,25,35,45,50,59},1,30));
        //int[] weights = {1,2,3,1,1};
        //System.out.println(shipWithinDays(weights,4));
        //int []  bloomDay = {5,37,55,92,22,52,31,62,99,64,92,53,34,84,93,50,28};
        //System.out.println(minDays(bloomDay,8,2));

        int[] position = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(maxDistance(position, 4));
    }

    public static int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int l = 0, r = position[position.length - 1]-position[0], mid = -1;
        int ans=r;
        while (l <= r) {
            mid = l + (r - l) / 2;
            int res = checkIfPossible(position, m, mid);
            if (res>=0) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    private static int checkIfPossible(int[] position, int m, int minimumForce) {
        int count = 1;
        int start = 0;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - position[start] >= minimumForce) {
                start = i;
                count++;
            }
        }
        return count-m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {

        if ((long) k * (long) m > bloomDay.length) {
            return -1;
        }
        int l = 1, r = Arrays.stream(bloomDay).max().getAsInt();
        int mid = l + (r - l) / 2;
        while (l < r) {
            //System.out.println(mid);
            boolean res = camMakeBoquets(bloomDay, k, m, mid);
            if (res) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            mid = l + (r - l) / 2;
        }
        return mid;
    }

    private static boolean camMakeBoquets(int[] bloomDay, int k, int m, int tgt) {
        int x = 0;
        for (int days : bloomDay) {
            if (days <= tgt) {
                x++;
                if (x == k) {
                    m--;
                    if (m == 0) {
                        return false;
                    }
                    x = 0;
                }
            } else {
                x = 0;
            }

        }
        return m <= 0;
    }

    public static int shipWithinDays(int[] weights, int days) {

        int l = 1, r = Arrays.stream(weights).sum();
        int mid = l + (r - l) / 2;
        while (l < r) {
            System.out.println(mid);
            int res = ansWithinKdays(weights, days, mid);
            if (res == 1) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            mid = l + (r - l) / 2;
        }
        return mid;
    }

    public static int ansWithinKdays(int[] weights, int days, int ans) {
        int sum = 0;
        int res;
        for (int weight : weights) {
            res = sum + weight;
            if (res <= ans) {
                sum += weight;
            } else {
                System.out.println(sum + "sum");
                days--;
                if (days <= 0 || weight > ans) {
                    return 1;
                }
                sum = weight;
            }
        }
        return -1;
    }


    public static int findPages(int[] A, int N, int M) {
        //Your code here
        int sum = Arrays.stream(A).sum();
        int left = 0, right = sum;
        return 0;
    }

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Map.Entry<Integer, Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int tgt = k + nums[i];
            if (Arrays.binarySearch(nums, i + 1, nums.length, tgt) >= 0) {
                res.add(Map.entry(nums[i], tgt));
            }
        }
        //System.out.println(res);
        return res.size();
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        //find closest element
        int left = 0, right = arr.length - 1, mid, diff, idx = 0;
        int mindiff = Math.abs(arr[0] - x);

        while (left <= right) {
            mid = left + (right - left) / 2;
            diff = Math.abs(arr[mid] - x);

            if (diff < mindiff) {
                mindiff = diff;
                idx = mid;
            }
            if (diff == mindiff) {
                idx = Math.min(idx, mid);
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(arr[idx]);

        int count = 1;
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[idx]);
        int l = idx - 1, r = idx + 1;
        for (int i = idx + 1; count < k && l >= 0 && r < arr.length; ) {
            if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                ans.add(arr[l]);
                l--;
                count++;
            } else {
                ans.add(arr[r]);
                count++;
                r++;
            }
        }
        for (int i = count; i < k; i++) {
            if (l < 0) {
                ans.add(arr[r++]);
            } else {
                ans.add(arr[l--]);
            }
        }
        Collections.sort(ans);

        return ans;
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = (start + end) / 2;
        while (end >= start) {
            int sqr = mid * mid;
            if (sqr == x) {
                return mid;
            }
            if (sqr > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return mid;
    }

    public static int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1, mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            //if non pivoted array
            if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //else for pivoted array from start
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;

    }

    static ArrayList<Integer> find(int arr[], int n, int x) {
        // code here
        if (arr.length == 0) {
            return new ArrayList<>(List.of(new Integer[]{-1, -1}));
        }
        int left = 0, right = n;
        int mid;
        ArrayList<Integer> ans = new ArrayList<>();
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == x) {
                if (mid == 0) {
                    ans.add(0);
                    break;
                }
                if (arr[mid - 1] < x) {
                    ans.add(mid);
                    break;
                }
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        left = 0;
        right = n;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == x) {
                if (mid == n - 1) {
                    ans.add(n - 1);
                    break;
                }
                if (arr[mid + 1] > x) {
                    ans.add(mid);
                    break;
                }
            }
            if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (ans.size() == 0) {
            return new ArrayList<>(List.of(new Integer[]{-1, -1}));
        }
        return ans;

    }
}
