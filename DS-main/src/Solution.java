public class Solution
{
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int[][] dp = new int[W+1][n+1];
        return knapSack01Dp(wt,val,W,n,dp);

    }

    private static int knapSack01Dp(int []wt,int[]val,int w,int n,int[][]dp){

        if(dp[w][n]!=0){
            return dp[w][n];
        }
        if(n==0 || w==0){
            return 0;
        }
        if(wt[n-1]<=w){
            int m1 = val[n-1]+knapSack01Dp(wt,val,w-wt[n-1],n-1,dp);
            return dp[w][n]=Math.max(m1,
                    knapSack01Dp(wt,val,w,n-1,dp));
        }
        else{
            return dp[w][n]=knapSack01Dp(wt,val,w,n-1,dp);
        }
    }
}
