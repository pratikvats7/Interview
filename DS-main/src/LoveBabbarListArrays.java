import java.util.*;

import static java.util.Objects.nonNull;

public class LoveBabbarListArrays {


    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(new Integer[]{10, 20, 14, 30, 23, 245, 14, 16, 7, 70, 50, 125});
        List<Integer> ar1 = Arrays.asList(new Integer[]{0,1,0,2,0,2,1,1,1,2,0,2,0,1});


        // System.out.println(reverseArray(ar));
        //System.out.println(reverseArrayRecursive(ar,0,ar.size()-1));

        //System.out.println(sortArray(ar1));

        List<Integer> ar2 = Arrays.asList(new Integer[]{-12,11,-13,-5,6,-7,5,-3,-6});

        List<Integer> ar3 = Arrays.asList(new Integer[]{1,2,3,4,5});

        //System.out.println(sortPositiveNegative(ar2));

        //System.out.println(rotate(ar3));

        int[] ar4 = new int[]{-9,5,-2,6,-3,-4};

        //System.out.println(maxSumSubArray(ar4));

        int[] ar5 = new int[]{2 ,6 ,3, 4 ,7 ,2 ,10, 3 ,2 ,1};

        int[] ar6 = new int[]{9 ,10, 1 ,2 ,3 ,4 ,8 ,0, 0, 0, 0, 0, 0, 0, 1};

        int[] ar7 = new int[]{1,2,4,3,2,1,3};

        //System.out.println(mindiff(ar5,5));

        //System.out.println(minJumps(ar6));

        //System.out.println(repeatingNumber(ar7));

        //int[][] ar8 = new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}};
        //System.out.println(mergeIntervals(ar8));
        //displayBoard(mergeIntervals(ar8));
//        int[] ar9 = new int[]{5,4,7,5,3,2};
//        nextPermutation(ar9);
//        for (int x: ar9
//             ) {
//            System.out.print(x+" ");
//        }

//        int[] ar10 = new int[]{3,2,6,5,0,3};
//
//        System.out.println(maxProfit(ar10));

//        int[] ar11 = new int[]{9,4,-7,2,3,7};
//        System.out.println(subArraySumZero(ar11));

//        int[] ar12 = new int[]{1,1,1,1};
//        System.out.println(commonElements(ar12,2));

//        int [] ar13 = {-8 ,8, 0 ,0 ,4 ,4};
//
//        System.out.println(maxProduct(ar13));
//
//        int[] A = {1, 5, 10, 20,20, 40, 80};
//        int [] B = {6, 7, 20, 20,80, 100};
//        int [] C = {3, 4, 15, 20, 20,30, 70, 80, 120};
//
//        ArrayList<Integer> res1 = commonElements(A, B, C);
//
//        for (int x: res1) {
//            System.out.print(x+" ");
//        }
       // int[] A = {4,1,2,-3,1,6};

        //System.out.println(zeroarray(A));

//        int [] C = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
//
//        //rotate(C,0,5);
//        rearrangePN(C);
//
//        printArray(C);

        int [] ar14 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

       // System.out.println(factorial(1000));

        int [] ar15 = {557 ,217 ,627, 358 ,527 ,358 ,338 ,272 ,870 ,362, 897 ,23 ,618 ,113 ,718 ,697, 586 ,42, 424 ,130 ,230 ,566, 560 , 933};

        //System.out.println(findLongestConseqSubseq(ar15));

        //System.out.println(tripletSum(986,ar15));

        //int [] ar16 = {3,0,0,2,0,4};

        //System.out.println(rainWater(ar16));

        Integer [] A = {34, 88, 89 ,39 ,67, 71 ,85 ,57, 18, 7, 61, 50, 38 ,6 ,60 ,18 ,19, 46, 84, 74, 59};

        System.out.println(chocoateDis(Arrays.asList(A),12));


    }

    private static int chocoateDis(List<Integer> a, int m) {
        a.sort(null);
        if(m==a.size()){
            return a.get(a.size()-1)- a.get(0);
        }
        System.out.println(a);
        int mindiff = Integer.MAX_VALUE;
        for ( int i = 0; i<=a.size()-m;i++){
            int diff =  a.get(i+m-1)- a.get(i);
            System.out.println(diff);
            mindiff = Math.min(diff, mindiff);
        }
        return mindiff;
    }

    private static int rainWater(int[] ar) {
        int res =0;
        int min = Integer.MAX_VALUE;
        int max = ar[0];
        int max2 =0;
        int idxmax=0,idxmin=0,idxmax2=0;
        int maxTillNow[] = new int[ar.length];
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=0){
                if (ar[i]<=min){
                    min = ar[i];
                    idxmin =i;
                    if(idxmin!=idxmax) {
                        int sum = addIdx(idxmax,idxmin,ar);
                        maxTillNow[i] = (idxmin - idxmax - 1) * min - sum;
                    }
                }
                else if(ar[i]>=max){
                    max2=max;
                    idxmax2=idxmax;
                    max = ar[i];
                    idxmax = i;
                    if(idxmax2!=idxmax){
                        int sum = addIdx(idxmax,idxmax2,ar);
                        maxTillNow[i]=(idxmax-idxmax2-1)*max2 - sum;
                    }
                }
            }
        }

        for (int x: maxTillNow) {
            System.out.print(x+" ");
        }
        System.out.println();
        return res;
    }

    private static int addIdx(int idxmax, int idxmin, int[] ar) {
        int sum =0;
        for(int i = idxmin+1;i<idxmax;i++){
            sum+=ar[i];
        }
        return sum;
    }

    private static boolean tripletSum(int X, int[] A) {
        int l1=0,l2=1,r=A.length-1;
        Arrays.sort(A);
        for(int i =0;i<A.length&&r>l2;i++){
            int sum = A[l1]+A[l2]+A[r];
            if(sum==X){
                return true;
            }
            else if(sum>X){
                r--;
            }
        }
        for(int i=r;i>=0;i--){
            l1=0;
            int tgt = X-A[i];
            for (int j=l1+1;j<r;j++){
                int sum = A[l1]+A[j];
                if(sum==tgt){
                    return true;
                }
                else if(sum>tgt){
                    l1++;
                }
            }
        }
        return false;
    }


    static int findLongestConseqSubseq(int arr[])
    {
        // add your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxcount=0;
        for (int x: arr) {
            if(map.get(x)==null){
                map.put(x,1);
            }
            else if (map.get(x)==-1){
                continue;
            }
            int count = 1;
            int left=x,right=x;
            int leftf=-1;
            int rightf =-1;
            while(leftf!=0 && rightf!=0) {
                if (leftf ==-1 && map.get(left - 1) != null) {
                    left = x - 1;
                    map.put(left, -1);
                    count++;
                } else {
                    leftf = 0;
                }
                if (rightf == -1 && map.get(right + 1) != null) {
                    right = x + 1;
                    map.put(right, -1);
                    count++;
                } else {
                    rightf = 0;
                }
                if (count > maxcount) {
                    maxcount = count;
                }

            }

        }
        return maxcount;
    }



    // This function finds factorial of
    // large numbers and prints them
    static void factorialEdit(int n)
    {
        int res[] = new int[500];

        // Initialize result
        res[0] = 1;
        int res_size = 1;

        // Apply simple factorial formula
        // n! = 1 * 2 * 3 * 4...*n
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        System.out.println("Factorial of given number is ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }

    // This function multiplies x with the number
    // represented by res[]. res_size is size of res[] or
    // number of digits in the number represented by res[].
    // This function uses simple school mathematics for
    // multiplication. This function may value of res_size
    // and returns the new value of res_size
    static int multiply(int x, int res[], int res_size)
    {
        int carry = 0; // Initialize carry

        // One by one multiply n with individual
        // digits of res[]
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of
            // 'prod' in res[]
            carry = prod/10; // Put rest in carry
        }

        // Put carry in res and increase result size
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    static ArrayList<Integer> factorial(int N){
       ArrayList<Integer> res = new ArrayList<>();

        String n1 = N + "";
        String n2 = (N - 1) + "";
        String p = multiply(n1, n2);

       for(int i=N-2;i>=2;i--) {
           p = multiply(p, i+"");
       }
        System.out.println(p);
      String[] strar = p.split("");
        for (String str: strar) {
            res.add(Integer.parseInt(str));
        }
       return res;
    }

    private static String multiply(String n1, String n2) {

        String prevres="0";
        String result ="";
        int count=0;
        for (int i = n2.length()-1;i>=0;i--){
            String res = "";
            int d1 = Integer.parseInt(n2.charAt(i)+"");
            int carry =0;
            for(int j = n1.length()-1;j>=0;j--){
                int d2 = Integer.parseInt(n1.charAt(j)+"");
                int p = d1*d2 + carry;
                carry =0;
                if(p>9){
                    carry = p/10;
                    p = p%10;
                }
                res=p+res;
            }
            if(carry>0){
                res = carry+res;
            }
            result = sumN(res,count,prevres);
            count++;
            prevres = res;
        }
        return result;
    }

    private static String sumN(String res, int nof0,String prevres) {
           for(int i =0;i<nof0;i++){
               res+="0";
           }
           int carry =0;
           String sumres ="";
           for(int i = res.length()-1,j=prevres.length()-1;i>=0;j--,i--) {
               int n2 = 0;
               if (j >= 0){
                  n2 = Integer.parseInt(prevres.charAt(j) + "");
               }
               int sum1 = Integer.parseInt(res.charAt(i)+"")+n2+carry;
               carry =0;
               if(sum1>9){
                   carry = 1;
                   sum1 = sum1%10;
               }
               sumres=sum1+sumres;
           }
           if(carry!=0){
               sumres=carry+sumres;
           }

           return sumres;
    }


    private static void rearrangePN(int[] a) {
        int pf=-1;
        for(int i =0;i< a.length;i++){
            if(a[i]>0 && pf==-1){
                pf = i;
            }
            if (a[i]<0 && pf!=-1){
                rotate(a,pf,i);
                pf++;
            }
        }

    }

    private static void rotate(int[] ar,int start,int end) {
        int temp = ar[end];
        for(int i=end;i>start;i--){
            ar[i]=ar[i-1];
        }
        ar[start]=temp;
    }

    private static boolean zeroarray(int[]  arr) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++) {
            sum = sum + arr[i];
            if (sum== 0 || map.get(sum)!=null)
                return true;
            else
            map.put(sum,0);
        }
      return false;
    }

    private static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C) {

        ArrayList<Integer> res = new ArrayList<>();

        int idx1=0,idx2=0,idx3=0;

        while(idx1<A.length && idx2<B.length && idx3<C.length){

            int maxOf3 = Math.max(Math.max(A[idx1],B[idx2]),C[idx3]);

            if(A[idx1]< maxOf3){
                idx1 = checkTillMax(A,idx1,maxOf3);
            }
            if(B[idx2]< maxOf3){
                idx2 = checkTillMax(B,idx2,maxOf3);
            }
            if(C[idx3]< maxOf3){
                idx3 = checkTillMax(C,idx3,maxOf3);
            }
       if(A[idx1]==B[idx2] && B[idx2]==C[idx3]) {
           if(!res.contains(A[idx1]))
                res.add(A[idx1]);
            }
            idx1++;
            idx2++;
            idx3++;

        }

        if(res.size()==0){
            res.add(-1);
        }
        return res;
    }

    private static int checkTillMax(int[] A, int idx1, int maxOf3) {
        int res = -1;
        for(int i=idx1; i<A.length && A[i]<=maxOf3;i++){
            res = i;
        }
        return res;

    }

    private static int maxProduct(int[] arr) {
        int[] maxProductTillnow = new int [arr.length];
        int p=1;
        int begin=0;
        int end=0;
        int maxp=Integer.MIN_VALUE;
        boolean contains0 = false;
        if(arr.length==1){
            return arr[0];
        }
        for (int i=0;i<arr.length;i++) {
            if(arr[i]!=0){
                contains0=true;
                p = p*arr[i];
            }
            else{
                begin = i+1;
                p=1;
                continue;
            }
            if(Math.abs(p)>=Math.abs(maxp)){
                end = i;
                maxp=p;
            }
        }

        if(maxp<0){
            int p1=1,p2=1;
           for(int i=begin;i<end;i++) {
               p1=p1*arr[i];
               if(arr[i]<0){
                   break;
               }
           }
            for(int j=end;j>=begin;j--) {
                p2=p2*arr[j];
                if(arr[j]<0){
                    break;
                }
            }
            if(begin>end){
                p1=Integer.MIN_VALUE;
                for(int j=begin-1;j>=end;j--) {
                    if(arr[j]!=0 && arr[j]!=maxp){
                        p2=p2*arr[j];
                    }
                    if(arr[j]<0){
                        break;
                    }
                }
            }
            if(p1<0 && p2<0)
                 maxp = maxp/Math.max(p1,p2);
            else
                maxp = maxp/Math.min(p1,p2);

        }
        if(maxp<0 && contains0)
            return 0;
         return maxp;
    }

    private static int commonElements(int[] arr,int k) {
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        int count =0;
        for (int x : arr) {
            if(x>k)
                continue;
            Integer c1 = freqmap.get(k-x);
            if(c1!=null){
                count+=c1;
            }
            Integer c2 = freqmap.get(x);
            if( c2!=null){
                freqmap.put(x,c2+1);
            }
            else{
                freqmap.put(x,1);
            }
        }
        return count;
    }

    private static boolean subArraySumZero(int[] arr) {
        int s1=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
            s1+=arr[i];
            if(nonNull(map.get(s1)))
                return true;
            map.put(s1,0);
        }

        return false;
    }

    public static int maxProfit(int[] prices) {
        int maxP=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int idxmin=0;
        int idxmax=0;
        for(int i=0,j=prices.length-1;i<=j;i++,j--){
            if(prices[i]<min  && idxmin<=idxmax){
                min = prices[i];
                idxmin=i;
            }
            if(prices[j]>max  && idxmin<=idxmax){
                max = prices[j];
                idxmax=j;
            }
            maxP = Math.max(maxP,(max-min));
        }

        return maxP;
    }

    private static void nextPermutation(int [] nums) {
        int min = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>=nums[i-1]){
                if(min>=nums[i-1] && min<=nums[i]){
                    nums[nums.length-1] = nums[i-1];
                    nums[i-1]=min;
                    Arrays.sort(nums,i,nums.length);
                }
                else{
                    Arrays.sort(nums,i,nums.length);
                    for(int j=i;j<nums.length;j++){
                        if(nums[j]>nums[i-1]){
                            int temp = nums[i-1];
                            nums[i-1] = nums[j];
                            nums[j]=temp;
                            return;
                        }
                    }
                }

                return;
            }
        }
        int left=0,right=nums.length-1;
        while(left<right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }

    private static int[][] mergeIntervals(int[][] intervals) {

        Arrays.sort(intervals,Comparator.comparing(a->a[0]));
        //ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int count = intervals.length;
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]>=intervals[i+1][0] && intervals[i+1][1]>=intervals[i][1]){
                intervals[i+1] = new int[]{intervals[i][0],intervals[i+1][1]};
                intervals[i] = new int[]{-1,-1};
                count--;
            }
            else if(intervals[i][1]>intervals[i+1][0] && intervals[i+1][1]<=intervals[i][1]){
                intervals[i+1] = intervals[i];
                intervals[i]=new int[]{-1,-1};
                count--;
            }
        }

        int[][] res = new int[count][];

        for(int i =0,idx=0;i<intervals.length;i++){
            if(intervals[i][0]!=-1){
//                ArrayList<Integer> ar2 = new ArrayList();
//                ar2.add(ar[i][0]);
//                ar2.add(ar[i][1]);
                res[idx]= new int[]{intervals[i][0],intervals[i][1]};
                idx++;
            }

        }

        return res;
    }

    private static void merge(int[][] ar, int begin, int end,int i) {
        ar[i] = new int[]{-1,-1};
        ar[i+1] = new int[]{begin,end};
    }

    private static int repeatingNumber(int[] ar) {

        int x=0;
        for(int i =0;i<ar.length;i++){
            System.out.println(x + "^"+ar[i]);
            x = x ^ ar[i];
            System.out.println(x);

        }

        return x;
    }

    private static int minJumps(int[] arr) {

        int max=0;
        int jumps=0;
        int maxidx = arr[0];
        int idx=0;
        int count=0;

        if(arr.length==1)
            return 1;
        if(maxidx+1==arr.length)
            return 1;

        for (int i=0;i<arr.length ;i++) {
            if(i<maxidx){
                if(i+arr[i]>=max){
                    max = i+arr[i];
                    jumps = arr[i];
                    idx = i ;
                }
            }
            else{
                if(i+arr[i]>=max){
                    max = i+arr[i];
                    jumps = arr[i];
                    idx = i ;
                }
                maxidx = idx+jumps;
                if(maxidx==0 || (arr[i]==0 && i> maxidx))
                    return -1;
                count++;
                if(maxidx>= arr.length-1){
                    return count+1;
                }
            }
        }

        if(count==0)
            return 1;

        return count;
    }

    private static int mindiff(int[] ar5,int k) {
        int min=0,max=Integer.MAX_VALUE;

        for (int x: ar5) {
            if(x-k<0){
                x = x+k;
                min = Math.max(x,min);
                max = Math.min(x,max);
            }
            else{
                min = Math.min(x+k,min);
                max = Math.min(x-k,max);
            }
            }
        System.out.println(min+" "+max);
        return max-min;
    }

    private static int maxSumSubArray(int[] ar) {
        int max = Integer.MIN_VALUE;
        int sum2 = 0;
        for (int x: ar) {
            sum2+=x;
            if(sum2>max){
                max = sum2;
            }
            if(sum2<0){
                sum2 = 0;
            }

        }

        return max;
    }

    private static List<Integer> rotate(List<Integer> ar) {
        for(int i=0,j=ar.size()-1;j>0;j--){
            Collections.swap(ar,j,j-1);
        }
        return ar;
    }

    private static List<Integer>  sortPositiveNegative(List<Integer> ar) {

        for(int i=0,j=ar.size()-1;i<j;){

            if(ar.get(j)>0){
                j--;
            }
            else if(ar.get(i)<0){
                i++;
            }
            else{
                Collections.swap(ar,i,j);
            }
        }
        return ar;
    }

    private static void sortArray2(int a[],int n) {

        int nonBegin0=0;
        int nonEnd2=0;
        int begin2=0;
        int end0=0;

        int flag1=-1,flag2=-1,flag3=-1,flag4=-1;

        for(int i=0,j=a.length-1;i< a.length;i++,j--){
            if(a[i]!=0 && flag1!=0){
                nonBegin0 = i;
                flag1=0;
            }
            if(a[j]!=2 && flag2!=0){
                nonEnd2 = j;
                flag2=0;
            }

            if(a[i]==2 && flag3!=0){
                begin2 = i;
                flag3=0;
            }
            if(a[j]==0 && flag4!=0){
                end0 = j;
                flag4=0;
            }
            if(flag1==0 && flag2==0 && flag3==0 && flag4==0){

                if( end0<=nonBegin0 && begin2>=nonEnd2){
                    break;
                }
                if(end0>nonBegin0) {
                    int temp = a[nonBegin0];
                    a[nonBegin0]= 0;
                    a[end0]=temp;
                }

                if(begin2>nonBegin0) {
                    int temp2 =a[nonEnd2];
                    a[nonEnd2]=2;
                    a[begin2]=temp2;
                }

                i=nonBegin0;
                j=nonEnd2;

                flag1=-1;flag2=-1;flag3=-1;flag4=-1;
            }
        }
    }

    private static List<Integer> sortArray(List<Integer> ar) {

        int nonBegin0=0;
        int nonEnd2=0;
        int begin2=0;
        int end0=0;

        int flag1=-1,flag2=-1,flag3=-1,flag4=-1;

        for(int i=0,j=ar.size()-1;i< ar.size();i++,j--){
            if(ar.get(i)!=0 && flag1!=0){
                nonBegin0 = i;
                flag1=0;
            }
            if(ar.get(j)!=2 && flag2!=0){
                nonEnd2 = j;
                flag2=0;
            }

            if(ar.get(i)==2 && flag3!=0){
                begin2 = i;
                flag3=0;
            }
            if(ar.get(j)==0 && flag4!=0){
                end0 = j;
                flag4=0;
            }
            if(flag1==0 && flag2==0 && flag3==0 && flag4==0){

                if( end0<=nonBegin0 && begin2>=nonEnd2){
                    break;
                }
                if(end0>nonBegin0) {
                    int temp = ar.get(nonBegin0);
                    ar.set(nonBegin0, 0);
                    ar.set(end0, temp);
                }

                if(begin2>nonBegin0) {
                    int temp2 = ar.get(nonEnd2);
                    ar.set(nonEnd2, 2);
                    ar.set(begin2, temp2);
                }

                i=nonBegin0;
                j=nonEnd2;

                flag1=-1;flag2=-1;flag3=-1;flag4=-1;
            }
        }

        return ar;
    }

    private static List<Integer> reverseArray(List<Integer> ar) {
        int i2 = ar.size()-1;
        for(int i1=0; i1<i2; i1++,i2--){
            int temp =ar.get(i1);
            ar.set(i1,ar.get(i2));
            ar.set(i2,temp);
        }
        return ar;
    }

    private static List<Integer> reverseArrayRecursive(List<Integer> ar,int begin,int end) {

        if(begin>=end){
            return ar;
        }
        int temp = ar.get(begin);
        ar.set(begin,ar.get(end));
        ar.set(end,temp);
        reverseArrayRecursive(ar,begin+1,end-1);
        return ar;
    }

    private static void displayBoard(int[][] chess) {
        for (int row=0;row<chess.length;row++){
            for(int col=0;col<chess[0].length;col++){
                System.out.print(chess[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printArray(int[] ar9){
        for (int x: ar9
             ) {
            System.out.print(x+" ");
        }
    }


}
