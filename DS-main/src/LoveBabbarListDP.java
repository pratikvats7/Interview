import java.util.Arrays;

public class LoveBabbarListDP {
    private static int staticCount=0;
    public static void main(String[] args) {
        int val[]={1,3,4,5};
        int wt[] = {1,4,5,7};

        //System.out.println(KnapSack01(4,wt,val,0,0,0));

        int[] weight =  convert("83 84 85 76 13 87 2 23 33 82 79 100 88 85 91 78 83 44 4 50 11 68 90 88 73 83 46 16 7 35 76 31 40 49 65 2 18 47 55 38 75 58 86 77 96 94 82 92 10 86 54 49 65 44 77 22 81 52");
        int[] values = convert("57 95 13 29 1 99 34 77 61 23 24 70 73 88 33 61 43 5 41 63 8 67 20 72 98 59 46 58 64 94 97 70 46 81 4 7 1 52 20 54 81 3 73 78 81 11 41 45 18 94 24 82 9 19 59 48 72");
                //99 34 77 61 23 24 70 73 88 33 61 43 5 41 63 8 67 20 72 98 59 46 58 64 94 97 70 46 81 4 7 1 52 20 54 81 3 73 78 81 11 41 45 18 94 24 82 9 19 59 48 2 72");

                //" 87 2 23 33 82 79 100 88 85 91 78 83 44 4 50 11 68 90 88 73 83 46 16 7 35 76 31 40 49 65 2 18 47 55 38 75 58 86 77 96 94 82 92 10 86 54 49 65 44 77 22 81 52");

        System.out.println(KnapSack01(9,wt,val,0,0,0));
        int [][] arr1 = new int[values.length+1][42];
        for (int[] row: arr1)
            Arrays.fill(row, -1);
        //System.out.println(KnapSack01Memoized(41,weight,values,0,0,0,arr1));
       // RecursionAndBackTracking.displayBoard(arr1);

        //System.out.println(count(wt,3,4));


    }

    public static long count(int S[], int m, int n) {
        // code here.
        int [][] dp1 = new int[m+1][n+1];
        for (int[] row: dp1)
            Arrays.fill(row, -1);
        return knapSackUnboundedDP(n,S,0,0,0,dp1);

    }

    private static int knapSackUnboundedDP(int W, int[] wt, int wsf, int vsf, int i,int[][]dp) {

        if(W==0 ){
            return 1;
        }
        else if(W<0 || i==wt.length){
            return 0;
        }
        if(dp[i][W]!=-1){
            return dp[i][W];
        }
        return dp[i][W] = knapSackUnboundedDP(W-wt[i],wt,wsf+wt[i],vsf+wt[i],i,dp)+
                knapSackUnboundedDP(W,wt,wsf,vsf,i+1,dp);
    }

    private static int knapSackUnbounded(int W, int[] wt, int wsf, int vsf, int i) {

        if(wsf==W ){
            return 1;
        }
        else if(wsf>W || i==wt.length){
            return 0;
        }
       return knapSackUnbounded(W,wt,wsf+wt[i],vsf+wt[i],i)+
        knapSackUnbounded(W,wt,wsf,vsf,i+1);
    }


    private static int KnapSack01Memoized(int W, int[] wt, int[] val,int wsf,int vsf,int i,int[][] mem) {

        if(W==0 || i==wt.length-1){
            return 0;
        }
        if(mem[i][W]!=-1){
            return mem[i][W];
        }
        if(wt[i+1]<=W) {
            return mem[i][W]=Math.max(val[i+1]+KnapSack01Memoized(W-wt[i+1], wt, val, wsf + wt[i+1], vsf + val[i+1], i + 1, mem),
                    KnapSack01Memoized(W,wt,val,wsf,vsf,i+1,mem));
        }
        else {
            return mem[i][W]=KnapSack01Memoized(W, wt, val, wsf, vsf, i + 1, mem);
        }
    }

    private static int KnapSack01(int W, int[] wt, int[] val,int wsf,int vsf,int i) {

        if(wsf>=W || i>=wt.length){
            return vsf;
        }
        int m1=0;
        if(wsf+wt[i]<=W)
            m1=KnapSack01(W,wt,val,wsf+wt[i],vsf+val[i],i+1);
        int m2 = KnapSack01(W,wt,val,wsf,vsf,i+1);

        return Math.max(m1,m2);
    }

    static long[] convert2(String str){
        String[] res =  str.split(" ");
        long[] result = new long[res.length];
        int i=0;
        for(String st : res){
            result[i]=Integer.parseInt(res[i]);
            //System.out.print(Integer.parseInt(res[i])+" ");
            i++;
        }
        return result;
    }

    static int[] convert(String str){
        String[] res =  str.split(" ");
        int[] result = new int[res.length];
        int i=0;
        for(String st : res){
            result[i]=Integer.parseInt(res[i]);
            //System.out.print(Integer.parseInt(res[i])+" ");
            i++;
        }
        return result;
    }

}
