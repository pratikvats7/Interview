import java.util.*;

public class AdityaVermaDp {
    private static int[][] gold,maze;
    static long mod = (long)1e9 + 7;
    static{
          gold =
                  new int[][]{
                          {0, 1, 4, 2, 8, 2},
                          {4, 3, 6, 5, 0, 4},
                          {1, 2, 4, 1, 4, 6},
                          {2, 0, 7, 3, 2, 2},
                          {3, 1, 5, 9, 2, 4},
                          {2, 7, 0, 8, 5, 1}
                  };
        maze =
                new int[][]{
                        {0, 1, 4, 2, 8, 2},
                        {4, 3, 6, 5, 0, 4},
                        {1, 2, 4, 1, 4, 6},
                        {2, 0, 7, 3, 2, 2},
                        {3, 1, 5, 9, 2, 4},
                        {2, 7, 0, 8, 5, 1}
                };
    }
    public static void main(String[] args) {
//        int[][] dp9 =new int[6][6];
//        initializewithminus1(dp9);
//        System.out.println(minCost(maze,0,0,dp9));
//        int max = Integer.MIN_VALUE;
//        int [][]dp10 = new int[gold.length+1][gold[0].length+1];
//        initializewithminus1(dp10);
//        for(int i =0;i<gold.length;i++){
//            max= Math.max(goldMine(gold,i,0,dp10),max);
//        }
//        System.out.println(max);
        int arr11[] = {4, 2, 7, 1, 3};
        int dp11[][] = new int[11][arr11.length + 1];
        initializewithminus1(dp11);

        // System.out.println(targetSumSubset(arr11,10,0,dp11));
        //System.out.println(coinChangeCount(arr11,10,0,dp11));

//        int[][]dp12 = new int[44][2];
//        initializewithminus1(dp12);
//        final long MOD = 1000_000_007;
//        System.out.println((countBinaryStrings(42,1,dp12))%MOD);
//        int[][] dp13 = new int[9][2];
//        initializewithminus1(dp13);
//        int side1 = arrangeBuildings(5,1,dp13);
//        System.out.println(side1*side1);

//        int arr14[] = {15 ,5 ,10 ,100 ,10 ,5};
//        int[][]dp14 = new int[7][2];
//        initializewithminus1(dp14);
//        System.out.println(Math.max(maxSumNonAdjacentElements(arr14,0,1,dp14)
//                ,maxSumNonAdjacentElements(arr14,0,0,dp14)));

       /* int paintHouse[][] =
                {
                        {1,5,7},
                        {5,8,4},
                        {3,2,9},
                        {1,2,4}
                };
        int[][]dp15 = new int[4][3];
        initializewithminus1(dp15);
        System.out.println(Math.min(Math.min(paintHouseMinCost(paintHouse,0,0,dp15)
                ,paintHouseMinCost(paintHouse,0,1,dp15)),paintHouseMinCost(paintHouse,0,2,dp15)));*/

//        int paintHouseMany[][] =
//                {
//                        {1,5,7},
//                        {5,8,4},
//                        {3,2,9},
//                        {1,2,4}
//                };
//        int[][]dp16 = new int[4][3];
//        initializewithminus1(dp16);
//        int min = Integer.MAX_VALUE;
//        for(int i = 0;i<paintHouseMany[0].length;i++){
//            min = Math.min(min,paintHouseMinCostMany(paintHouseMany,0,i,dp16));
//        }
//        System.out.println(min);
//        RecursionAndBackTracking.displayBoard(dp16);
//        RecursionAndBackTracking.displayBoard(dp15);

//        int paintFenceMany[][] =
//                   {
//                        {1,5,7},
//                        {5,8,4},
//                        {3,2,9},
//                        {1,2,4}
//                };
//        int[][]dp16 = new int[4][3];
//        initializewithminus1(dp16);
//        int min = Integer.MAX_VALUE;
//        for(int i = 0;i<paintFenceMany[0].length;i++){
//            min = Math.min(min,paintHouseMinCostMany(paintFenceMany,0,i,dp16));
//        }
//        System.out.println(min);

        //System.out.println(paintFenceWays(4,3));

//        long[]dp17 = new long[80];
//        Arrays.fill(dp17,-1);
//        System.out.println(paintFenceWays(79,53,dp17));
//        for(int i =0;i<dp17.length;i++){
//            System.out.print(dp17[i]+" , ");
//        }
//        long dp18[] = new long[3+1];
//        Arrays.fill(dp18,-1);
//        System.out.println(tiling2X1(3,dp18)%mod);
//        long[] dp19 = new long [40];
//        Arrays.fill(dp19,-1);
//        System.out.println(tilingMX1(16,39,dp19)%mod);

//        long[] dp19 = new long[6];
//        Arrays.fill(dp19,-1);
//        System.out.println(friendsPairing(5,dp19));
//        long[][] dp20 = new long[10][10];
//        initializewithminus1long(dp20);
//        System.out.println(kPartition(5,2,dp20));
//        int[] prices ={1,3,7,5,10,3};
//        int m = Arrays.stream(prices)
//                .min()
//                .getAsInt();
//        System.out.println(maxProfitStocks(prices,0,Integer.MAX_VALUE));
        int[] prices2 ={2,2,1,1,5,5,3,1,5,4};
        //System.out.println(maxProfitInfiniteTransaction(prices,0,prices[0],0));

        System.out.println(maxProfitInfiniteTransactionWithFees(prices2,0,prices2[0],0,2));
    }

    private static int maxProfitInfiniteTransactionWithFees(int[] prices, int day, int minPrice, int max, int fee) {
        if(day>=prices.length){
            if(prices[prices.length-1]>minPrice)
                return Math.max(max - minPrice - fee, 0);
            return 0;
        }
        int profit = 0;
        if(prices[day]>max-fee){
            max = Math.max(prices[day],max);
            if(prices[day]<minPrice){
                minPrice=prices[day];
            }
        }
        else{
            if(max-minPrice-fee >= 0) {
                profit = max-minPrice-fee;
                minPrice = prices[day];
                max = prices[day];
            }
            if(prices[day]<minPrice){
                minPrice=prices[day];
                max = prices[day];
            }
        }
        return profit+ maxProfitInfiniteTransactionWithFees(prices,day+1,minPrice,max,fee);
    }

    private static int maxProfitInfiniteTransaction(int[] prices,int day,int minPrice,int max) {
        if(day>=prices.length){
            if(prices[prices.length-1]>minPrice)
                return max-minPrice;
            return 0;
        }
        int profit = 0;
        if(prices[day]>max){
            max = prices[day];
        }
        else{
            profit = max-minPrice;
            minPrice=prices[day];
            max=prices[day];
        }
        return profit+maxProfitInfiniteTransaction(prices,day+1,minPrice,max);
    }

    private static int maxProfitStocks(int[] prices,int day,int minPrice) {
        if(day>=prices.length){
            return 0;
        }
        if(prices[day]<minPrice){
            minPrice=prices[day];
        }
        int profit = prices[day]-minPrice;
        return Math.max(profit,maxProfitStocks(prices,day+1,minPrice));
    }

    private static long kPartition(int n, int k, long[][] dp) {
        if(n==k){
            return 1;
        }
        if(n<=k){
            return 0;
        }
        if(n<=0){
            return 0;
        }
        if(k<=0){
            return 0;
        }
        if(dp[n][k]!=-1){
            return dp[n][k];
        }
        return dp[n][k]=k*(kPartition(n - 1, k, dp)) + kPartition(n - 1, k-1, dp);
    }

    private static long friendsPairing(int n,long[]dp) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
            return dp[n]=friendsPairing(n-1,dp) + (n-1)*friendsPairing(n-2,dp);
    }

    private static long tilingMX1(int m, int n, long[] dp) {
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }
        if(n<1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        return dp[n]= tilingMX1(m,n-1,dp)+tilingMX1(m,n-m,dp)%mod;
    }

    private static long tiling2X1(int n,long dp[]) {


        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        if(n<1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        //v+h
        return dp[n]=(tiling2X1(n-1,dp)+tiling2X1(n-2,dp))%mod;
    }

    private static long paintFenceWays(int n , int k, long[] dp) {
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==1){
            return k;
        }
        if(n==2){
            return k+k*(k-1);
        }

        long diff = (k-1)*(paintFenceWays(n-1,k, dp));
        long same = (k-1)*paintFenceWays(n-2,k, dp);;
        return dp[n]=(same+diff)%1000000007;
    }

    public static long add(long a, long b) {
        long mod = (long)1e9 + 7;
        return (long)(((long)(a % mod) + (b % mod)) % mod);
    }

    // Driver function to get the modular multiplication.
    public static long mul(long a, long b) {
        long mod = (long)1e9 + 7;
        return (long)(((long)(a % mod) * (b % mod)) % mod);
    }

    private static int paintHouseMinCostMany(int[][] paintHouse, int r,int excl, int[][] dp) {
        if (r >= paintHouse.length) {
            return 0;
        }
        if (dp[r][excl] != -1) {
            return dp[r][excl];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < paintHouse[0].length; i++) {
            if (i != excl)
                min = Math.min(min, paintHouse[r][i] + paintHouseMinCostMany(paintHouse, r + 1, i, dp));
        }
        return min;
    }

    private static int paintHouseMinCost(int[][] paintHouse, int r,int excl, int[][] dp) {

        if(r>=paintHouse.length){
            return 0;
        }
        if(dp[r][excl]!=-1){
            return dp[r][excl];
        }
        int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE,m3=Integer.MAX_VALUE;
        if(excl!=0)
            m1 = paintHouse[r][0]+paintHouseMinCost(paintHouse,r+1,0,dp);
        if(excl!=1)
            m2 = paintHouse[r][1]+paintHouseMinCost(paintHouse,r+1,1,dp);
        if(excl!=2)
            m3 = paintHouse[r][2]+paintHouseMinCost(paintHouse,r+1,2,dp);

        return dp[r][excl]=Math.min(Math.min(m1,m2),m3);
    }

    private static int maxSumNonAdjacentElements(int[] arr, int i,int incl,int[][]dp) {

        if(i>=arr.length){
            return 0;
        }
        if(dp[i][incl]!=-1){
            return dp[i][incl];
        }
        if(incl==1){
           return dp[i][incl]=arr[i] + Math.max(maxSumNonAdjacentElements(arr, i + 2, 1,dp)
                   ,(maxSumNonAdjacentElements(arr, i + 2, 0,dp)));
        }
        else{
            return  dp[i][incl]=Math.max(maxSumNonAdjacentElements(arr, i + 1, 1,dp)
                    ,(maxSumNonAdjacentElements(arr, i + 1, 0,dp)));
        }
    }

    private static int arrangeBuildings(int n, int endingwithZero, int[][] dp) {

        if( dp[n][endingwithZero]!=-1){
            return dp[n][endingwithZero];
        }
        if(n==0){
            return 1 ;
        }
        if(endingwithZero==1) {
            return dp[n][endingwithZero] = countBinaryStrings(n - 1, 1,dp)
                    + countBinaryStrings(n - 1, 0,dp);
        }
        else{
            return dp[n][endingwithZero] = countBinaryStrings(n - 1, 1,dp);
        }
    }

    private static int countBinaryStrings(int digits, int endingwithZero,int[][]dp) {
        if( dp[digits][endingwithZero]!=-1){
            return dp[digits][endingwithZero];
        }
        if(digits==0){
            return 1 ;
        }
        if(endingwithZero==1) {
            return dp[digits][endingwithZero] = countBinaryStrings(digits - 1, 1,dp)
                    + countBinaryStrings(digits - 1, 0,dp);
        }
        else{
            return dp[digits][endingwithZero] = countBinaryStrings(digits - 1, 1,dp);
        }
    }

    private static int coinChangeCount(int[] arr, int tgt,int i, int[][] dp) {
        if(tgt==0){
            return 1;
        }
        if(i>arr.length-1){
            return 0;
        }
        if(dp[tgt][i]!=-1){
            return dp[tgt][i];
        }
        int res = 0;
        if(tgt-arr[i]>=0) {
            res = coinChangeCount(arr, tgt - arr[i], i, dp);
        }
        int  res2 =  coinChangeCount(arr,tgt,i+1, dp);

        return dp[tgt][i] = res+res2;

    }

    private static boolean targetSumSubset(int[] arr, int tgt, int i, int[][] dp) {

        if(tgt==0){
            return true;
        }
        if(i>arr.length-1){
            return false;
        }
        if(dp[tgt][i]!=-1){
            return dp[tgt][i] == 1;
        }
        boolean res = false;
        if(tgt-arr[i]>=0) {
             res = targetSumSubset(arr, tgt - arr[i], i + 1, dp);
        }
        boolean res2 =  targetSumSubset(arr,tgt,i+1, dp);

        dp[tgt][i]=(res || res2)?1:0;

        return res || res2;
    }

    private static int goldMine(int[][] gold, int i, int j, int[][] dp) {

        if(i>=gold.length|| j>=gold[0].length || i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1 = goldMine(gold,i,j+1, dp);
        int c2 = goldMine(gold,i-1,j+1, dp);
        int c3 = goldMine(gold,i+1,j+1, dp);

        dp[i][j] = gold[i][j]+Math.max(c3,Math.max(c1,c2));
        return dp[i][j];
    }


    private static int minCost(int[][] maze, int i, int j,int[][] dp) {
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==maze.length-1 && j==maze[0].length-1){
            return maze[i][j];
        }
        int m1=Integer.MAX_VALUE,m2= Integer.MAX_VALUE;
        if(j+1 < maze[0].length) {
             m1 = maze[i][j] + minCost(maze, i, j + 1,dp);
        }
        if(i+1<maze.length){
             m2 =  maze[i][j] + minCost(maze, i+1, j,dp);
        }
          return dp[i][j]=Math.min(m1,m2);
    }

    private static int climbStairsMinJump(int[] arr, int i, int[] dp) {
        int min = Integer.MAX_VALUE-1;
        if(i>=arr.length-1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=1;j<=arr[i];j++) {
            min = Math.min(min,1 + climbStairsMinJump(arr, i+j, dp));
            dp[i]=min;
        }
        return min;
    }

    private static int climbStairsJump(int[] arr, int i, int[] dp) {
        int ans = 0;
        if(i>arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        if(i==arr.length){
            return 1;
        }
        for(int j=1;j<=arr[i];j++) {
            ans = ans + climbStairsJump(arr, i+j, dp);
            dp[i]=ans;
        }
        //System.out.println();
        return ans;
    }

    private static int evaluateToTrue(String str, int i, int j, int[][] dp7) {
        if( i >=  j)
            return 0;
        if(dp7[i][j]!=-1){
            return dp7[i][j];
        }
        int ans = Integer.MAX_VALUE;
        int count = 0;
        for(int k = i; k < j; k++)
        {
            count = evaluateToTrue(str, i, k, dp7) +
                    evaluateToTrue(str, k + 1, j, dp7) + 1;

        }
        return dp7[i][j]=count;
    }

    private static int palindromePartitioning(String str, int i, int j, int[][] dp7) {
        if( i >= j || isPalindrome(str,i,j) )
            return 0;
        if(dp7[i][j]!=-1){
            return dp7[i][j];
        }
        int ans = Integer.MAX_VALUE;
        int count;
        for(int k = i; k < j; k++)
        {
            count = palindromePartitioning(str, i, k, dp7) +
                    palindromePartitioning(str, k + 1, j, dp7) + 1;

            ans = Math.min(ans, count);
        }
        return dp7[i][j]=ans;
    }
    private static boolean isPalindrome(String str,int i ,int j) {
        {
            while(i < j)
            {
                if(str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
    }

    private static void printLCS(String A, String B, int[][] dp, int i, int j) {
        String res = "";
        List<String> resArr = new ArrayList<>();
        while (i > 0 && j > 0) {
            if (A.charAt(i - 1) == B.charAt(j - 1)) {
                res += A.charAt(i - 1);
                i--;
                j--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    j--;
                } else if(dp[i][j - 1] < dp[i - 1][j])  {
                    i--;
                }
                else{

                }
            }
        }
        resArr.add(new StringBuilder(res).reverse().toString());
        System.out.println(resArr);
    }

    private static int generateLCSDP(String A, String B, int i, int j, int[][] dp) {

        if (i <= 0 || j <= 0) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        if (A.charAt(i - 1) == B.charAt(j - 1)) {
            return dp[i][j] = 1 + generateLCSDP(A, B, i - 1, j - 1, dp);
        } else {
            return dp[i][j] = Math.max(generateLCSDP(A, B, i, j - 1, dp),
                    generateLCSDP(A, B, i - 1, j, dp));
        }
    }

    private static int LCSubStringRecursive(String A, String B, int count, HashMap<String, Integer> map, int i, int j) {
        if (i >= A.length() || j >= B.length()) {
            return count;
        }
        String key = i + "code" + j + "bix" + count;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        int res = 0;
        if (A.charAt(i) == B.charAt(j)) {
            res = LCSubStringRecursive(A, B, count + 1, map, i + 1, j + 1);
        }
        res = Math.max(res, Math.max(LCSubStringRecursive(A, B, 0, map, i, j + 1),
                LCSubStringRecursive(A, B, 0, map, i + 1, j)));
        map.put(key, res);
        return res;

    }

    private static int LCSTopDown(String A, String B, int[][] dp, int m, int n) {
        for (int i = 1; i < A.length() + 1; i++) {
            for (int j = 1; j < B.length() + 1; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1],
                            dp[i - 1][j]);
                }
            }
        }
        return dp[m][n];
    }

    private static int LCSRecursive(String A, String B, int[][] dp) {
        if (A.length() == 0 || B.length() == 0) {
            return 0;
        }
        if (dp[A.length()][B.length()] != 0) {
            return dp[A.length()][B.length()];
        }
        if (A.charAt(0) == B.charAt(0)) {
            return 1 + LCSRecursive(A.substring(1), B.substring(1), dp);
        } else {
            return dp[A.length()][B.length()] = Math.max(LCSRecursive(A, B.substring(1), dp)
                    , LCSRecursive(A.substring(1), B, dp));
        }

    }


    private static int coinChangeTopDown(int[] arr, int tgt, int[][] dp) {
        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 0; j < tgt + 1; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < tgt + 1; j++) {
                int m1 = 0;
                if (j >= arr[i - 1])
                    m1 = dp[i][j - arr[i - 1]];
                int m2 = dp[i - 1][j];
                dp[i][j] = m1 + m2;
            }
        }
        return dp[arr.length][tgt];
    }

    private static int coinChange(int[] arr, int tgt, int idx, int[][] dp) {
        if (dp[idx][tgt] != 0) {
            return dp[idx][tgt];
        }
        if (tgt == 0)
            return 1;
        if (idx >= arr.length) {
            return 0;
        }
        int m1 = 0;
        if (tgt >= arr[idx])
            m1 = coinChange(arr, tgt - arr[idx], idx, dp);
        int m2 = coinChange(arr, tgt, idx + 1, dp);
        return dp[idx][tgt] = m1 + m2;
    }

    private static int rodCuttingProblemTopDown(int[] price, int N, int[][] dp) {

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (j >= i)
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - i], dp[i - 1][j]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[N][N];
    }

    private static int rodCuttingProblemMemoized(int[] price, int N, int i, int[][] dp) {

        if (N <= 0 || i >= price.length) {
            return 0;
        }
        if (dp[i][N] != 0) {
            return dp[i][N];
        }
        int m1 = 0;
        if (N - (i + 1) >= 0) {
            m1 = price[i] + rodCuttingProblemMemoized(price, N - (i + 1), i, dp);
        }
        int m2 = rodCuttingProblemMemoized(price, N, i + 1, dp);
        return dp[i][N] = Math.max(m1, m2);
    }

    private static int rodCuttingProblem(int[] price, int N, int i) {

        if (N <= 0 || i >= price.length) {
            return 0;
        }
        int m1 = 0;
        if (N - (i + 1) >= 0) {
            m1 = price[i] + rodCuttingProblem(price, N - (i + 1), i);
        }
        int m2 = rodCuttingProblem(price, N, i + 1);
        return Math.max(m1, m2);
    }


    private static int knapsack01(int cap, int[] weight, int[] values, int idx, int msf) {

        if (idx == weight.length) {
            return msf;
        }
        int m1 = 0;
        if (cap - weight[idx] >= 0) {
            m1 = knapsack01(cap - weight[idx], weight, values, idx + 1, msf + values[idx]);
        }
        int m2 = knapsack01(cap, weight, values, idx + 1, msf);
        return Math.max(m1, m2);
    }

    private static int knapSack01(int[] wt,  int[] val, int w, int n) {

        if (n == 0 || w == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) {
            int m1 = val[n - 1] + knapSack01(wt, val, w - wt[n - 1], n - 1);
            return Math.max(m1,
                    knapSack01(wt, val, w, n - 1));
        } else {
            return knapSack01(wt, val, w, n - 1);
        }
    }

    private static int knapsack01Dp(int cap, int[] weight, int[] values, int idx, int msf, int[][] dp) {

        if (dp[cap][idx] != 0) {
            if (cap == 1)
                System.out.print(dp[cap][idx] + " " + idx + ",");
            //return dp[cap][idx];
        }
        if (idx == weight.length) {
            return msf;
        }
        int m1 = 0;
        if (cap >= weight[idx]) {
            m1 = knapsack01Dp(cap - weight[idx], weight, values, idx + 1, msf + values[idx], dp);
        }
        int m2 = knapsack01Dp(cap, weight, values, idx + 1, msf, dp);
        return dp[cap][idx] = Math.max(m1, m2);
    }

    private static int knapSack01Dp(int[] wt, int[] val, int w, int n, int[][] dp) {

        if (dp[w][n] != 0) {
            return dp[w][n];
        }
        if (n == 0 || w == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) {
            int m1 = val[n - 1] + knapSack01Dp(wt, val, w - wt[n - 1], n - 1, dp);
            return dp[w][n] = Math.max(m1,
                    knapSack01Dp(wt, val, w, n - 1, dp));
        } else {
            return dp[w][n] = knapSack01Dp(wt, val, w, n - 1, dp);
        }
    }


    private static int knapSack01DpTopDown(int[] wt, int[] val, int w, int n, int[][] dp) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt[i - 1]] + val[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }

    private static boolean subsetSumProblem(int[] ar, int tgt, int i) {
        if (i == ar.length) {
            return false;
        }
        boolean t1 = false;
        if (tgt - ar[i] == 0) {
            System.out.println("hi");
            return true;
        } else if (tgt - ar[i] > 0) {
            t1 = subsetSumProblem(ar, tgt - ar[i], i + 1);
        }
        boolean t2 = subsetSumProblem(ar, tgt, i + 1);

        if (t1 || t2) {
            return true;
        }
        return false;
    }

    private static int subsetSumProblemMemoized(int[] ar, int tgt, int i, int[][] dp) {
        if (i == ar.length) {
            return 0;
        }
        if (dp[i][tgt] != -1) {
            return dp[i][tgt];
        }
        int t1 = 0;
        if (tgt - ar[i] == 0) {
            System.out.println("hi");
            return 1;
        } else if (tgt - ar[i] > 0) {
            t1 = dp[i][tgt - ar[i]] = subsetSumProblemMemoized(ar, tgt - ar[i], i + 1, dp);
        }
        int t2 = dp[i][tgt] = subsetSumProblemMemoized(ar, tgt, i + 1, dp);
        if (t1 == 1 || t2 == 1) {
            return 1;
        }
        return 0;
    }

    private static boolean subsetSumProblemTopDown(int[] ar, int tgt, boolean[][] dp) {


        for (int i = 1; i < ar.length + 1; i++) {
            for (int j = 1; j < tgt + 1; j++) {
                if (ar[i - 1] <= j)
                    dp[i][j] = (dp[i - 1][j - ar[i - 1]] || dp[i - 1][j]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[ar.length][tgt];
    }

    public static void initializewithminus1(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }

    public static void initializewithminus1long(long[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }

    private static void mathodCalls(){
        int wt[] = {1, 4, 5, 7, 12};
        int val[] = {1, 3, 12, 5, 9};
        int[] values = LoveBabbarListDP.convert("57 95 13 29 1 99 34 77 61 23 24 70 73 88 33 61 43 5 41 63 8 67 20 72 98 59 46 58 64 94 97 70 46 81 42 7 1 52 20 54 81 3 73 78 81 11 41 45 18 94 24 82 9 19 59 48 2 72");
        int[] weight = LoveBabbarListDP.convert("83 84 85 76 13 87 2 23 33 82 79 100 88 85 91 78 83 44 4 50 11 68 90 88 73 83 46 16 7 35 76 31 40 49 65 2 18 47 55 38 75 58 86 77 96 94 82 92 10 86 54 49 65 44 77 22 81 52");
        //System.out.println(knapsack01(41 ,weight,values  ,0,0));
        //System.out.println(knapSack01(weight,values  ,41,58));
        int[][] dp = new int[41 + 1][58 + 1];
        int[][] dp2 = new int[58 + 1][41 + 1];
        int[][] dp3 = new int[5 + 1][14 + 1];
        boolean[][] dp4 = new boolean[5 + 1][14 + 1];
        for (int i = 0; i < dp4.length; i++) {
            for (int j = 0; j < dp4[0].length; j++) {
                if (j == 0)
                    dp4[i][j] = true;
            }
        }
        initializewithminus1(dp3);
        //System.out.println(knapsack01Dp(41 ,weight,values  ,0,0,dp));
        //System.out.println(knapSack01Dp(weight,values  ,41,58,dp));

        //System.out.println(Solution.knapSack(41,weight,values,58));

        //int x =  knapSack01Dp(weight,values,41,58,dp);
        // RecursionAndBackTracking.displayBoard(dp);
        //System.out.println(x);
        //System.out.println(knapSack01DpTopDown(weight,values,41,58,dp2));
        int arr1[] = {2, 3, 7, 8, 10};
        int[] price = {1, 5, 8, 9, 10, 17, 7, 20};
        //System.out.println(subsetSumProblem(arr1,12,0));
        // System.out.println(subsetSumProblemMemoized(arr1,12,0,dp3));

        // System.out.println(subsetSumProblemTopDown(arr1,12,dp4));

        //  System.out.println(equalSumPartitionWrapper(arr1,12,dp4));
        //RecursionAndBackTracking.displayBoard(dp2);

        // System.out.println(rodCuttingProblem(price,8,0));
        int[][] dp5 = new int[9][9];
        // System.out.println(rodCuttingProblemMemoized(price,8,0,dp5));
        //System.out.println(rodCuttingProblemTopDown(price,8,dp5));
        //
//        int count = 0;
//        System.out.println(coinChange(arr1, 10, 0, dp));
//        int[][] dp6 = new int[6][11];
//        System.out.println(coinChangeTopDown(arr1, 10,dp6));
//        RecursionAndBackTracking.displayBoard(dp6);
        int[][] dp6 = new int[7][8];
        //System.out.println(LCSRecursive("abcdgh","abedfha",dp6));
        //System.out.println(LCSTopDown("abcdgh","abedfha",dp6,6,7));
        //initializewithminus1(dp6);
        //HashMap<String,Integer> map = new HashMap<>();
        //System.out.println(LCSubStringRecursive("ABCDGH","ACDGHR",0,map,0,0));
        //int[][] dp7 = new int[6][8];
        //System.out.println(generateLCSDP("abaaa ", "baabaca", 5, 7, dp7));
        //RecursionAndBackTracking.displayBoard(dp7);
        //printLCS("abaaa ", "baabaca", dp7, 5, 7);
        int dp7 [][] = new int [6][6];
        initializewithminus1(dp7);
        //System.out.println(palindromePartitioning("nitik",0,4,dp7));
        //TBD System.out.println(evaluateToTrue("T|T&F^T",0,6,dp7));
        int[] arr2 ={3,3,0,2,2,3};
        //int[] arr2 ={3,3,3,3,3,3};
        int[]dp8= new int[arr2.length+1];
        Arrays.fill(dp8, -1);
        //System.out.println(climbStairsJump(arr2,0,dp8));
        //System.out.println(climbStairsMinJump(arr2,0,dp8));
        //int maze[][] = {{1,2,3}, {4,5,6}, {1,2,4}};
    }
}
