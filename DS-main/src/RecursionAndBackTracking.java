import java.util.*;

public class RecursionAndBackTracking {


    final static Map<String, String> keypadmap = new HashMap<>() {
        {
            put("1", "abc");
            put("2", "def");
            put("3", "ghi");
            put("4", "jkl");
            put("5", "mno");
            put("6", "pqrs");
            put("7", "tu");
            put("8", "vwx");
            put("9", "yz");
        }  };

    static int count = 0;
    private final static Map<String, String> CharacterMap = new HashMap<>() {
        {
            put("1", "a");
            put("2", "b");
            put("3", "c");
            put("4", "d");
            put("5", "e");
            put("6", "f");
            put("7", "g");
            put("8", "h");
            put("9", "i");
            put("10", "j");
            put("11", "k");
            put("12", "l");
            put("13", "m");
            put("14", "n");
            put("15", "o");
            put("16", "p");
            put("17", "q");
            put("18", "r");
            put("19", "s");
            put("20", "t");
            put("21", "u");
            put("22", "v");
            put("23", "w");
            put("24", "x");
            put("25", "y");
            put("26", "z");
        }  };
    private static int mindiff = Integer.MAX_VALUE;
    private static int maze[][] = {{0, 0, 0}, {1, 0, 0}, {1, 0, 0}};
    public static int chess[][] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    //private static int chess [][]= {{0,0,0},{0,0,0},{0,0,0}};
    private static boolean visitedAr[][] = {{false, false, false}, {false, false, false}, {false, false, false}};
    public static int[][] goldMine = {{0, 2, 0, 5, 0}, {0, 1, 0, 4, 0}, {0, 4, 4, 0, 0}, {0, 9, 0, 0, 0}, {0, 8, 0, 0, 8}};
    static int[][] sudoku =
            {
                    {3, 0, 6, 5, 0, 8, 4, 0, 0},
                    {5, 2, 0, 0, 0, 0, 0, 0, 0},
                    {0, 8, 7, 0, 0, 0, 0, 3, 1},
                    {0, 0, 3, 0, 1, 0, 0, 8, 0},
                    {9, 0, 0, 8, 6, 3, 0, 0, 5},
                    {0, 5, 0, 0, 9, 0, 6, 0, 0},
                    {1, 3, 0, 0, 0, 0, 2, 5, 0},
                    {0, 0, 0, 0, 0, 0, 0, 7, 4},
                    {0, 0, 5, 2, 0, 6, 3, 0, 0}
            };
    static String[][] crossword =
            {
                    {"+", "_", "+", "+", "+", "+", "+", "+", "+", "+"},
                    {"+", "_", "+", "+", "+", "+", "+", "+", "+", "+"},
                    {"+", "_", "+", "+", "+", "+", "+", "+", "+", "+"},
                    {"+", "_", "_", "_", "_", "_", "+", "+", "+", "+"},
                    {"+", "_", "+", "+", "+", "_", "+", "+", "+", "+"},
                    {"+", "_", "+", "+", "+", "_", "+", "+", "+", "+"},
                    {"+", "+", "+", "+", "+", "_", "+", "+", "+", "+"},
                    {"+", "+", "_", "_", "_", "_", "_", "_", "+", "+"},
                    {"+", "+", "+", "+", "+", "_", "+", "+", "+", "+"},
                    {"+", "+", "+", "+", "+", "_", "+", "+", "+", "+"}
            };

    private static int paths[][] =
            {
                    {2, 8, 4, 1, 6, 4, 2},
                    {6, 0, 9, 5, 3, 8, 5},
                    {1, 4, 3, 4, 0, 6, 5},
                    {6, 4, 7, 2, 4, 6, 1},
                    {1, 0, 3, 7, 1, 2, 7},
                    {1, 5, 3, 2, 3, 0, 9},
                    {2, 2, 5, 1, 9, 8, 2}
            };

    private static int gold[][] =
            {
                    {0, 1, 4, 2, 8, 2},
                    {4, 3, 6, 5, 0, 4},
                    {1, 2, 4, 1, 4, 6},
                    {2, 0, 7, 3, 2, 2},
                    {3, 1, 5, 9, 2, 4},
                    {2, 7, 0, 8, 5, 1}
            };

    public static void main(String[] args) {
        //System.out.println("hi There");
        //printIncreasing(10);
        //printDecreasing(10);
        //printIncreasingDecreasing(10);
        // System.out.println(factorial(5));
        //System.out.println(powerLinear(3,5));
        //System.out.println(powerLinear2(3,5));
        //TowerOfHanoi(3,10,11,12);
        Integer[] array = {10, 20, 14, 30, 23, 245, 14, 16, 7, 70, 50, 125};
        List<Integer> ar = Arrays.asList(array);
        List<String> strAr = Arrays.asList(new String[]{"dog", "cat", "dad", "good"});
        List<String> letters = Arrays.asList(new String[]{"a", "a", "c", "d", "d", "d", "g", "o", "o"});
        List<Integer> score = Arrays.asList(new Integer[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        //printArray2(ar,0);
        //System.out.println(MaximumInArray(ar,0));
        //System.out.println(firstIndex(ar,70,0));
        //System.out.println(lastIndex(ar,32,0));
        //System.out.println(allIndices(ar,14,0));
        //System.out.println(subsequence("abc"));
        //System.out.println(keyPadCombination("543"));
        //System.out.println(getStairsPath(3));
        //System.out.println(getMazePaths(1,1,3,3));
        //System.out.println(getMazePathsJump(1,1,3,3));
        //printSubsequence("abc","");
        PrintkeyPadCombination("543","");
        //printStairsPath(3,"");
        //printMazePaths(1,1,3,3,"");
        //printMazePathsJump(1,1,3,3,"");
        //permutations("abc","");
        //encodings("193","");
        //floodFill(maze,0,0,"",visitedAr);
        //targetSubsets(ar,0,60,"",0);
        printNQueens(chess,"",0);
        //KnightsTour(chess,4,1,0);
        //abbreviations("pep","",0,0);
        //System.out.println(maxScore(strAr,new ArrayList<String>(),0,letters,score));
        sudoku(sudoku,0,0);
        //List<String> words = new ArrayList<>(){{add("LONDON");add("DELHI");add("ICELAND");add("ANKARA");}};
        //crossword(crossword,words,0);

//        List<String> list = Arrays.asList(( "send"+ "more" + "money").split(""));
//        HashSet<String> set = new HashSet<>(list);
//        Map<String,Integer> map = new TreeMap<>();
//        set.forEach(x->map.put(x,-1));
//        boolean[] usedNumbers = new boolean[10];
//
//        crypto(map.keySet().stream().reduce((x,y)->x+y).get(),0,"send","more","money",map,usedNumbers);
//
        boolean[] used= new boolean[4];
          friendsPairing(1,3,used,"");

//        boolean[] used= new boolean[4];
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        for(int i =0;i<3;i++){
//            ans.add(new ArrayList<Integer>());
//        }
//        kPartition(1,4,3,0,ans);


        //practice

        ///abbrprctice("pep",0,"",0);
        //System.out.println(maxStringKSwaps("129814999",4));
//        System.out.println(combinations(4,2));
//        ArrayList<String> strListWords= new ArrayList<>();
//        strListWords.add("ab");
//        strListWords.add("cd");
        //System.out.println(specialStrings(strListWords));
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        HashSet<ArrayList<Integer>> result2 = new HashSet<>();
//        Integer[] inp ={ 1,2,2};
//        ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(inp));
//        //System.out.println(combinationSum(new ArrayList<Integer>(Arrays.asList(inp)),28));
//        System.out.println(subsetsWithDup(ar2,result2));

        //practice

        //dynamic programming

//        System.out.println(fibonnaci(10));
//
//         System.out.println(fibonnaciMemoised(10,new int [11]));
        Integer[] jumps = {1, 2, 2, 1, 1, 5, 1, 1, 1, 4};
        Integer[] arset = {2,3,5,6};
        Integer[] weight = {2,5,1,3,4};
        Integer[] price = {15,14,10,45,30};
        Integer[] maxSumNonAdjacentAr = {5,10,10,100,5,6};

        System.out.println(countPaths(6,new int [11])+"countp");
//        System.out.println(countPathsTabulation(10));
//        System.out.println(countPathsTabulation2(10,jumps));
//        System.out.println(countPathsTabulationmin(10,jumps));
        //System.out.println(minimumcostPath(paths)+"ggfgh");
        //System.out.println("Max gold is "+maximumGold(gold));
        //System.out.println(targetSumSubset(arset,10));
//        System.out.println(coinChangeCombination(arset,10));
//        System.out.println(coinChangePermutation(arset,10));
        //System.out.println(" Knapsack :"+KnapSack01(weight,price,7));

       // System.out.println(KnapSackUB(weight,price,7));

        //System.out.println(countBinaryStrings(4));

        //System.out.println(arrangeBuildings(4));

        //System.out.println(countEncodings(123));

        //System.out.println(countSubsequences("abcabc"));

       // System.out.println(maxSumNonAdjacentElements(maxSumNonAdjacentAr));
        int paintHouse[][] =
                {
                        {1,5,7},
                        {5,8,4},
                        {3,2,9},
                        {1,2,4}
                };

        int paintHouse2[][] =
                {
                        {1,5,7,2,1,4},
                        {5,8,4,3,6,1},
                        {3,2,9,7,2,3},
                        {1,2,4,9,1,7}
                };

        //System.out.println(paintHouse(paintHouse));
        //System.out.println(paintHouse2(paintHouse2));


        //backtracking 2
//        Integer[] mindset = {1,2,3,4,5,6};
//        minimumSubsetDifference(mindset,0,new ArrayList<Integer>(),new ArrayList<Integer>(),0,0);

        //permutation(new int [5],1,3);
       // combination(new int [5],1,3,0,"-");
        //combination2(new int [5],1,3,-1);
//        HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();
//        fmap.put('a',2);
//        fmap.put('b',2);
//        permutationStr(fmap,1,4,"");

    }

    private static void permutationStr(HashMap<Character, Integer> fmap, int ci, int ti, String asf) {
        if(ci>ti){
            System.out.println(asf);
            return;
        }
        for (char ch: fmap.keySet()) {
            if(fmap.get(ch)>0) {
                fmap.put(ch,fmap.get(ch)-1);
                permutationStr(fmap, ci + 1, ti, asf + ch);
                fmap.put(ch,fmap.get(ch)+1);
            }
        }
    }

    private static void combination2(int[] boxes, int ci, int ti,int ind) {
        if (ci > ti) {
            displayAr(boxes);
            System.out.println();
            return;
        }

        for (int i = ind+1; i < boxes.length; i++) {
            if (boxes[i] == 0) {
                boxes[i] = 1;
                combination2(boxes, ci + 1, ti,i);
                boxes[i] = 0;
            }
        }
    }

    private static void combination(int[] boxes, int ci, int ti,int ssf ,String asf) {
        if(ci>=boxes.length) {
            if (ssf == ti) {
                System.out.println(asf);
            }
            return;
        }

            combination(boxes, ci + 1, ti,ssf,asf+"-");
            combination(boxes, ci + 1, ti,ssf+1,asf+"i");
        }

    private static void permutation(int[] boxes, int ci, int ti) {
        if(ci>ti){
            displayAr(boxes);
            System.out.println();
            return;
        }

        for (int i=0;i<boxes.length;i++){
            if(boxes[i]==0) {
                boxes[i] = ci;
                permutation(boxes, ci + 1, ti);
                boxes[i] = 0;
            }
        }
    }

    private static void minimumSubsetDifference(Integer[] mindset,int vidx, ArrayList<Integer> set1
            ,ArrayList<Integer> set2,int soset1,int soset2) {

        if(vidx==mindset.length){

            int delta = Math.abs(soset1-soset2);
            if(delta<mindiff){
                mindiff=delta;
                ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
                ar.add(set1);
                ar.add(set2);
                System.out.println(ar);
            }
        };
        if(set1.size()<(mindset.length+1)/2) {
            set1.add(mindset[vidx]);
           minimumSubsetDifference(mindset, vidx + 1, set1, set2,
                    soset1 + mindset[vidx], soset2);
            set1.remove(mindset[vidx]);
        }
        if(set2.size()<(mindset.length+1)/2) {
            set2.add(mindset[vidx]);
             minimumSubsetDifference(mindset, vidx + 1, set1, set2,
                    soset1, soset2 + mindset[vidx]);
            set2.remove(mindset[vidx]);
        }
    }


    private static int paintHouse2(int[][] paintHouse) {
        int[][]dp = new int [paintHouse[0].length][paintHouse.length];
        for(int i=0;i<dp.length;i++){
            dp[i][0] = paintHouse[0][i];
        }
        for(int i=1;i<dp[0].length;i++) {
            for (int j = 0; j < dp.length;j++)
            {
                int min=Integer.MAX_VALUE;
                for (int k = 0; k < dp.length;k++)
                {
                    if(k!=j) {
                        if (dp[k][i - 1] < min) {
                            min = dp[k][i - 1];
                        }
                    }
                }
                dp[j][i] = paintHouse[i][j]+min;
            }
        }
        displayBoard(dp);
        return 0;
    }

    private static int paintHouse(int[][] paintHouse) {
        int[][]dp = new int [paintHouse[0].length][paintHouse.length];
        dp[0][0]=paintHouse[0][0];
        dp[1][0]=paintHouse[0][1];
        dp[2][0]=paintHouse[0][2];
        for(int i=1;i<dp[0].length;i++){
            dp[0][i] = paintHouse[i][0] + Math.min(dp[1][i - 1], dp[2][i - 1]);
            dp[1][i]=paintHouse[i][1]+Math.min(dp[0][i-1],dp[2][i-1]);
            dp[2][i]=paintHouse[i][2]+Math.min(dp[0][i-1],dp[1][i-1]);
        }
        displayBoard(dp);
        return 0;
    }

    private static int maxSumNonAdjacentElements(Integer[] arr) {

       int exccount=0;
       int inclcount=arr[0];
        for(int i=1;i<arr.length;i++){
           int newInclCount = exccount+arr[i];
           int newExclCount = Math.max(exccount,inclcount);
            exccount = newExclCount;
            inclcount = newInclCount;
       }
        return Math.max(exccount,inclcount);
    }

    private static int countSubsequences(String str) {
        int a=0;
        int ab =0;
        int abc =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'){
                a=2*a+1;
            }
            else if(ch=='b'){
                ab=2*ab+a;
            }
            else if(ch=='c'){
                abc=2*abc+ab;
            }
        }
        return abc;
    }

    private static byte countEncodings(int n) {

        return 0;
    }

    private static int arrangeBuildings(int n) {
        return countBinaryStrings(n)*countBinaryStrings(n);
    }

    private static int countBinaryStrings(int n) {

        int [] dp1 = new int[n+1];
        int [] dp0 = new int[n+1];

        dp0[1]=1;
        dp1[1]=1;

        int oldcount0=1;
        int oldcount1=1;

        for(int i=2;i<n;i++){
            dp0[i]=dp1[i-1];
            dp1[i]=dp0[i-1]+dp1[i-1];
            int newcount1=oldcount0+oldcount1;
            int newcount0 = oldcount1;
            oldcount1=newcount1;
            oldcount0=newcount0;
        }
       // System.out.println(oldcount1+oldcount0);
        return dp1[n-1]+dp0[n-1];
    }

    private static int KnapSackUB(Integer[] weight, Integer[] price, int n) {
        int [][] dp = new int [weight.length+1][n+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=weight[i-1])
                    dp[i][j]=Math.max(dp[i-1][j],(price[i-1]+dp[i][j-weight[i-1]]));
            }
        }
        displayBoard(dp);
        return dp[weight.length][n];
    }

    private static int KnapSack01(Integer[] weight, Integer[] price, int n) {
        int [][] dp = new int [weight.length+1][n+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                  dp[i][j]=dp[i-1][j];
                  if(j>=weight[i-1])
                    dp[i][j]=Math.max(dp[i-1][j],(price[i-1]+dp[i][j-weight[i-1]]));
            }
        }
        displayBoard(dp);
        return dp[weight.length][n];
    }

    private static int coinChangePermutation(Integer[] arset, int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j< arset.length;j++){
                if(i-arset[j]>=0)
                    dp[i]=dp[i]+dp[i-arset[j]];
            }
            displayAr(dp);
            System.out.println();
        }

        return dp[n];

    }

    private static int coinChangeCombination(Integer[] arset,int n) {

        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=0;i<arset.length;i++){
            for(int j=arset[i];j<=n;j++){
                    dp[j]=dp[j]+dp[j-arset[i]];
                }
            displayAr(dp);
            System.out.println();
            }

            return dp[n];
    }

    static void displayAr(int[] dp) {
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
    }

    static void displayAr(String[] dp) {
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
    }

    private static void displayA2r(String[] dp) {
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
    }

    private static boolean targetSumSubset(Integer[] arr, int target) {
        boolean dp[][] = new boolean[arr.length+1][target+1];
        for(int i=0;i<dp.length;i++){
           for(int j=0;j<dp[0].length;j++){
               if(i==0 && j==0){
                   dp[i][j]=true;
               }
               else if (i==0){
                   dp[i][j]=false;
               }
               else if(j==0){
                   dp[i][j]=true;
               }
               else {
                   if (dp[i - 1][j] == true) {
                       dp[i][j] = true;
                   }
                   else
                   {
                       int val = arr[i-1];
                       if(j>=val){
                            if(dp[i-1][j-val]==true){
                                dp[i][j] = true;
                            }
                       }
                   }
               }
            }
        }
        displayBoardBoolean(dp);

        return dp[arr.length][target];
    }

    private static int maximumGold(int[][] paths) {
        int[][] dp = new int[paths.length][paths[0].length];
        for (int j = paths[0].length - 1; j >= 0; j--) {
            for (int i = paths[0].length - 1; i >= 0; i--) {
                if (j == paths[0].length - 1) {
                    dp[i][j] = paths[i][j];
                }
                else if(i==0){
                    dp[i][j] = paths[i][j] + Math.max(dp[i + 1][j+1], dp[i][j + 1]);
                }
                else if(i==paths.length-1){
                    dp[i][j] = paths[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                    System.out.println(Math.max(dp[i][j+1], dp[i-1][j+1])+"max");
                    System.out.println(paths[i][j]);
                }
                else {
                    dp[i][j] = paths[i][j] + Math.max(Math.max(dp[i + 1][j+1], dp[i][j + 1]),dp[i - 1][j+1]);
                }
            }
        }
        displayBoard(dp);
        int max = dp[0][0];
        for(int i=0;i<paths.length;i++){
            if(dp[i][0]> max){
                max=dp[i][0];
            }
        }
        return max;
    }

    private static int minimumcostPath(int[][] paths) {
        int[][]dp = new int[paths.length][paths[0].length];
        for (int i=paths.length-1;i>=0;i--){
            for(int j=paths[0].length-1;j>=0;j--){

                if(i==paths.length-1 && j==paths.length-1){
                    dp[i][j]=paths[i][j];
                }
                else if(i==paths.length-1) {
                    dp[i][j]=dp[i][j+1]+paths[i][j];
                }
                else if(j==paths[0].length-1) {
                    dp[i][j]=dp[i+1][j]+paths[i][j];
                }
                else{
                    dp[i][j] = paths[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }

        }

        displayBoard(dp);
        return 0;
    }

    private static int countPathsTabulationmin(int n, Integer[] jumps) {
        Integer [] dp = new Integer [n+1];
        Integer [] ar = new Integer [n+1];
        dp[n]=0;
        for (int i = n-1; i >=0; i--) {
            if (jumps[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= jumps[i] && (i + j < dp.length); j++) {
                    if (dp[i+j]!=null && dp[i+j] < min) {
                        min = dp[i+j];
                    }
                }
                if(min!=Integer.MAX_VALUE) {
                    dp[i] = min+1;
                }
            }
        }
        return dp[0];
    }

    private static int countPathsTabulation2(int n, Integer[] jumps) {
        int [] dp = new int [n+1];
        dp[n]=1;
        for (int i = n-1; i >=0; i--) {
            for(int j=1;j<=jumps[i] && (i+j< dp.length);j++){
                dp[i]+=dp[i+j];
            }
        }
        return dp[0];
    }

    private static int countPathsTabulation(int n) {
        int [] dp = new int [n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }

        }
        return dp[n];
    }

    private static int countPaths(int n, int[] qb) {

        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(qb[n]==0) {
            int n1 = countPaths(n - 1, qb);
            int n2 = countPaths(n - 2, qb);
            int n3 = countPaths(n - 3, qb);
            qb[n]=n1+n2+n3;
            return n1 + n2 + n3;
        }
        return qb[n];
    }

    private static int fibonnaci(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return  fibonnaci(n-1)+fibonnaci(n-2) ;
    }

    private static int fibonnaciMemoised(int n,int[] qb) {
        if(n==0 || n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int res =  fibonnaciMemoised(n-1,qb)+fibonnaciMemoised(n-2,qb);
        qb[n]=res;
        return res;
    }


    public static HashSet<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A, HashSet<ArrayList<Integer>> result) {

        if(A.size()==0){
            HashSet<ArrayList<Integer>> res = new HashSet<>();
            res.add(new ArrayList<Integer>());
            return res;
        }
        for(int i=A.size()-1;i>=0;i--) {
            HashSet<ArrayList<Integer>> res = subsetsWithDup(new ArrayList<Integer>(A.subList(0, i)), result);
            result.addAll(res);
            ArrayList<ArrayList<Integer>> res2 = new ArrayList<>();
            result.add(new ArrayList<>(A.subList(i,A.size())));
        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {

        //int sum = A.stream().reduce((x,y)->x+y).get();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(B<0){
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            return res;
        }
        if(B==0){
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<Integer>());
            return res;
        }

        for (Integer num: A) {
            ArrayList<ArrayList<Integer>> res = combinationSum(A, B-num);
            for (int j=0;j<res.size();j++) {
                if(res.get(j).size()==0 || res.get(j).get(res.get(j).size()-1)<=num) {
                    res.get(j).add(num);
                    if (!result.contains(res.get(j))) {
                        result.add(res.get(j));
                    }
                }
                //result.remove(res.get(j));
            }
        }
        return result;
    }

    private static ArrayList<String> specialStrings(ArrayList<String> list) {

        if(list.size()==0){
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }

        ArrayList<String> res = specialStrings(new ArrayList<String>(list.subList(0,list.size()-1)));
        ArrayList<String> result = new ArrayList<>();
        String left = list.get(list.size()-1);
       for(int i=0;i<left.length();i++){
           for(int j=0;j<res.size();j++){
               result.add(res.get(j)+left.charAt(i));
           }
       }

        return result;
    }

    private static ArrayList<ArrayList<Integer>> combinations(int A, int B) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if(A<B){
            return result;
        }
        if(A==B){
            ArrayList<Integer> res2 = new ArrayList<Integer>();
            for(int i =1 ;i<=A ;i++){
                res2.add(i);
            }
            result.add(res2);
            return result;
        }

        if(B==0){
            ArrayList<Integer> ar = new ArrayList<>();
            result.add(ar);
            return result;
        }

        for(int i=1;i<=A;i++){
            ArrayList<ArrayList<Integer>> res = combinations(A, B-1);
            for (ArrayList<Integer> j:res) {
                if((j.size()>0 && i<j.get(0)) || j.size()==0) {
                    j.add(0,i);
                    result.add(j);
                    //System.out.println(result);
                }

                //System.out.println();
            }
        }
        //System.out.println(result);
        return result;
    }

    private static String maxStringKSwaps(String A, int B) {
        
        if(B==0){
            return A;
        }
        int max = 0;
        for (int i = 0;i<A.length();i++) {
            for (int j = i + 1; j < A.length(); j++) {
                String left = A.substring(0, i);
                String middle = A.substring(i + 1, j);
                String right = A.substring(j + 1);
                if (!A.equals(left + A.charAt(j) + middle + A.charAt(i) + right)) {
                    max = Math.max(Integer.parseInt(maxStringKSwaps(left + A.charAt(j) + middle + A.charAt(i) + right, B - 1)), max);
                }
            }
        }

        return max+"";
    }

//    private static void abbrprctice(String pep, int idx, String asf, int count) {
//
//        if(idx==pep.length()){
//                System.out.println(asf);
//            return;
//        }
//        abbrprctice(pep,idx+1,asf+pep.charAt(idx),count);
//        abbrprctice(pep,idx+1,asf+(count+1),count+1);
//
//    }

    private static void kPartition(int i, int n, int k,int nos, ArrayList<ArrayList<Integer>> ans) {

        if(i>n){
            if(nos==k){
                for (ArrayList<Integer> set : ans)
                {
                    System.out.print(set);
                }
                System.out.println();
            }
            return;
        }

        for (int j=0;j<ans.size();j++){
            if(ans.get(j).size()>0){
                ans.get(j).add(i);
                kPartition(i+1,n,k,nos,ans);
               // System.out.println(ans+" gg" +nos);
                ans.get(j).remove(ans.get(j).size()-1);
                //System.out.println(ans+" gg2" +nos);
            }
            else{
                ans.get(j).add(i);
                //System.out.println(ans+" ggr" +nos);
                kPartition(i+1,n,k,nos+1,ans);
                ans.get(j).remove(ans.get(j).size()-1);
                break;
            }
        }



    }



    private static void friendsPairing(int i, int n, boolean[] used, String asf) {

        if(i>n){
            System.out.println(asf);
            return;
        }
        if (used[i] == true) {
            friendsPairing(i + 1, n, used, asf);
        }
        else {
            used[i] = true;
            friendsPairing(i + 1, n, used, asf + "(" + i + ")");
            for (int num = i + 1; num <= n; num++) {
                if (used[num] == false) {
                    used[num] = true;
                    friendsPairing(i + 1, n, used, asf + "(" + i + "" + num + ")");
                    used[num] = false;
                }
            }
            used[i] = false;
        }
        }

    private static void crypto(String unique, int idx, String s1, String s2, String s3, Map<String, Integer> charMap,boolean[] usedNumbers) {

        count ++;
        if(count==2){
            return;
        }

        if(idx == unique.length()){
            int num1 = getNum(s1,charMap);
            int num2 = getNum(s2,charMap);
            int num3 = getNum(s3,charMap);

            if(num1+num2==num3){
                System.out.println(charMap);

            }
            return;
        }

        char ch = unique.charAt(idx);

        for(int num =0;num<=9;num++){
            if (usedNumbers[num] == false){
                charMap.put(ch+"",num);
                usedNumbers[num] = true;
                crypto(unique,idx+1,s1,s2,s3,charMap,usedNumbers);
                usedNumbers[num] = false;
                charMap.put(ch+"",-1);
            }
        }

    }

    private static int getNum(String s1, Map<String, Integer> charMap) {
        return 0;
    }

    private static void crossword(String[][] crossword, List<String> words, int vidx) {

        if(vidx==words.size()){
           displayBoardString(crossword);
            return;
        }
        String word = words.get(vidx);
        for(int i= 0;i<crossword.length;i++){
            for(int j=0;j< crossword[0].length;j++){
                if(crossword[i][j]=="_"||crossword[i][j].equals(word.charAt(0)+"")){
                    if(canPlaceWordHorizontally(crossword,word,i,j)){
                        boolean[] wePlaced = placeWordHorizontally(crossword, word, i, j);
                        crossword(crossword,words,vidx+1);
                        unplaceWordHorizontally(crossword,wePlaced,i,j);
                    }
                    if(canPlaceWordVertically(crossword,word,i,j)){
                        boolean[] wePlaced = placeWordVertically(crossword, word, i, j);
                        crossword(crossword,words,vidx+1);
                        unplaceWordVertically(crossword,wePlaced,i,j);
                    }
                }
            }
        }
    }

    private static void unplaceWordVertically(String[][] crossword, boolean[] weplaced, int i, int j) {

        for (int ii = 0; ii < weplaced.length; ii++) {
            if(weplaced[ii]==true) {
                crossword[i+ii][j] = "_";
            }
        }
    }

    private static boolean[] placeWordVertically(String[][] crossword, String word, int i, int j) {
        boolean[] weplaced = new boolean[word.length()];
        for(int ii=0;ii<word.length();ii++){
            if(crossword[i+ii][j].equals("_")){
                crossword[i+ii][j]=word.charAt(ii)+"";
                weplaced[ii]=true;
            }
        }
        return weplaced;
    }

    private static boolean canPlaceWordVertically(String[][] crossword, String word, int i, int j) {
        if(i-1>=0 && crossword[i-1][j]!="+"){
            return false;
        }
        else if(i+word.length()<crossword.length && crossword[i+word.length()][j]!="+"){
            return false;
        }
        for(int ii =0;ii<word.length();ii++){
            if(i+ii>=crossword[0].length){
                return false;
            }
            if(crossword[i+ii][j].equals("_")|| crossword[i+ii][j].equals(word.charAt(ii)+"")){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    private static void unplaceWordHorizontally(String[][] crossword, boolean[] weplaced, int i, int j) {
        for (int jj = 0; jj < weplaced.length; jj++) {
            if(weplaced[jj]==true) {
                crossword[i][j + jj] = "_";
            }
        }
    }

    static boolean[] placeWordHorizontally(String[][] crossword, String word, int i, int j) {
        boolean[] weplaced = new boolean[word.length()];
        for(int jj=0;jj<word.length();jj++){
            if(crossword[i][j+jj].equals("_")){
                crossword[i][j+jj]=word.charAt(jj)+"";
                weplaced[jj]=true;
            }
        }
        return weplaced;
    }

    static boolean canPlaceWordHorizontally(String[][] crossword, String word, int i, int j) {
        if(j-1>=0 && crossword[i][j-1]!="+"){
            return false;
        }
        else if(j+word.length()<crossword[0].length && crossword[i][j+word.length()]!="+"){
            return false;
        }
        for(int jj =0;jj<word.length();jj++){
            if(j+jj>=crossword[0].length){
                return false;
            }
            if(crossword[i][j+jj].equals("_")|| crossword[i][j+jj].equals(word.charAt(jj)+"")){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    private static void sudoku(int[][] sudoku,int i,int j) {

        if(i==sudoku.length){
            displayBoard(sudoku);
            return;
        }
        int ni = 0;
        int nj = 0;
        if (j == sudoku[0].length-1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }

        if (sudoku[i][j] != 0) {
            sudoku(sudoku, ni, nj);
        } else {
            for (int n = 1; n <= 9; n++) {
                if(isValid(sudoku,i,j,n))
                {
                    sudoku[i][j] = n;
                    sudoku(sudoku, ni, nj);
                    sudoku[i][j] = 0;
                }
            }
        }
    }

    public static boolean isValid(int[][] sudoku, int x, int y, int n) {
        for(int j=0;j<sudoku[0].length;j++){
            if(sudoku[x][j]==n) {
                return false;
            }
        }
        for(int i=0;i<sudoku[0].length;i++){
            if(sudoku[i][y]==n) {
                return false;
            }
        }
        int smi=(x/3)*3;
        int smj=(y/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(sudoku[smi+i][smj+j]==n){
                    return false;
                }
            }
        }
        return true;
    }

    private static int goldMine2(int[][] goldMine) {
        boolean[][] visited = new boolean[goldMine.length][goldMine[0].length];
        int max =0;
        for(int i=0;i<goldMine.length;i++){
            for(int j=0;j<goldMine[i].length;j++){
                if(goldMine[i][j]!=0 && visited[i][j]!=true) {
                    ArrayList<Integer> bag = new ArrayList<>();
                    travelAndCollectGold(goldMine, i, j,visited, bag);
                    int sum=0;
                    for (Integer val: bag) {
                        sum+=val;
                    }
                    if (sum>max){
                        max = sum;
                    }
                }
            }
        }
        return max;
    }

    private static void travelAndCollectGold(int[][] goldMine, int i, int j, boolean[][] visited, ArrayList<Integer> bag) {

        if (i<0 || j<0 ||  i>= goldMine.length || j>= goldMine[i].length ||  goldMine[i][j]==0 || visited[i][j]==true) {
            return;

        }
            visited[i][j]=true;
            bag.add(goldMine[i][j]);
            travelAndCollectGold(goldMine, i + 1, j, visited, bag);
            travelAndCollectGold(goldMine, i - 1, j, visited, bag);
            travelAndCollectGold(goldMine, i, j + 1, visited, bag);
            travelAndCollectGold(goldMine, i, j - 1, visited, bag);
    }


    private static void lexicographical(int x, int n) {
        if(x>n)
            return;
        System.out.println(x);
        for(int i=0;i<=9;i++){
            lexicographical(x*10+i,n);
        }
    }

    private static int josephusProlem(int n, int k) {

        if(n==1){
            return 0;
        }
        int x = josephusProlem(n-1,k);
        int y = (x+k)%n;
        return y;
    }

    private static int maxScore(List<String> strAr,List<String> asf,int pos,List<String> letters,List<Integer> score) {

        if(pos>=strAr.size()){
            System.out.println(asf);
            int sum =0;
            Map<String,Integer> freqMap = new HashMap<>();
            for (String letter : letters) {
                if(freqMap.get(letter)!=null)
                    freqMap.put(letter,freqMap.get(letter)+1);
                else{
                    freqMap.put(letter,1);
                }
            }
            for (String str: asf) {
                for(int i =0 ;i<str.length();i++){
                    if(!(freqMap.get((str.charAt(i)+""))==null || freqMap.get((str.charAt(i)+""))==0)) {
                        int points = score.get(str.charAt(i) - 'a');
                        sum+=points;
                        freqMap.put(str.charAt(i)+"",freqMap.get((str.charAt(i)+""))-1);
                    }
                }
            }
            System.out.println(sum);
            return sum;
        }
        asf.add(strAr.get(pos));
        int maxwithincl = maxScore(strAr,asf,pos+1,letters,score);
        asf.remove(strAr.get(pos));
        int maxwoincl= maxScore(strAr,asf,pos+1,letters,score);

        return Math.max(maxwithincl,maxwoincl);
    }

    private static void abbreviations(String str, String asf, int count, int pos) {

        if(str.length()==pos){
            if(count==0){
            System.out.println(asf);}
            else{
                System.out.println(asf+count);
            }
            return;
        }
        if(count>0)
        abbreviations(str,asf+count+str.charAt(pos),0,pos+1);
        else
        abbreviations(str,asf+str.charAt(pos),0,pos+1);

        abbreviations(str,asf,count+1,pos+1);

    }

    private static void KnightsTour(int[][] chess, int row, int col,int move) {

           if(row < 0 || col < 0 || row >=chess.length || col >= chess.length || chess[row][col]>0){
               return;
        }else if(move == chess.length* chess.length){
            chess[row][col]=move;
            displayBoard(chess);
        }
        if(chess[row][col]==0) {
            chess[row][col] = move;
            KnightsTour(chess, row-2, col-1,move+1);
            KnightsTour(chess, row-1, col+2,move+1);
            KnightsTour(chess, row+1, col+2,move+1);
            KnightsTour(chess, row+2, col+1,move+1);
            KnightsTour(chess, row+2, col-1,move+1);
            KnightsTour(chess, row+1, col-2,move+1);
            KnightsTour(chess, row-1, col-2,move+1);
            KnightsTour(chess, row-2, col+1,move+1);
            chess[row][col] = 0;
        }
    }

    public static void displayBoard(int[][] chess) {
        for (int row=0;row<chess.length;row++){
            for(int col=0;col<chess[0].length;col++){
                System.out.print(chess[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void displayBoardBoolean(boolean[][] chess) {
        for (int row=0;row<chess.length;row++){
            for(int col=0;col<chess.length;col++){
                if(chess[row][col]==true)
                    System.out.print(chess[row][col]+"  ");
                else
                    System.out.print(chess[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void displayBoardString(String[][] chess) {
        for (int row=0;row<chess.length;row++){
            for(int col=0;col<chess.length;col++){
                System.out.print(chess[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }

        for(int col=0;col<chess.length;col++){
            if(isQueensafe(chess,row,col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "_" + col + ",", row + 1);
                chess[row][col] = 0;
            }
        }

    }

    static boolean isQueensafe(int[][] chess, int row, int col) {
        for (int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i=row-1,j=col+1;i>=0 && j< chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }

        return true;
    }

    private static void targetSubsets(List<Integer> ar,int index, int target,String set,int sumSoFar) {

        if(sumSoFar==target){
            System.out.println(set);
            return;
        }
        else if(sumSoFar>target){
            return;
        }
        if(ar.size()==index){
            return;
        }
        targetSubsets(ar,index+1, target,set+" "+ar.get(index) ,sumSoFar + ar.get(index));
        targetSubsets(ar,index+1, target,set ,sumSoFar);

    }

    private static void floodFill(int[][] maze, int sr, int sc, String asf,boolean[][] visited) {

       int len = maze.length;
       if(sr>=len || sc>=len || sr<0 || sc<0 ||  maze[sr][sc] == 1 || visited[sr][sc] == true){
           return;
       }
       else if(sr==len-1 && sc ==len-1){
           System.out.println(asf );
       }
        visited[sr][sc] = true;
        floodFill(maze,sr+1,sc,"d"+asf,visited);
        floodFill(maze,sr,sc+1,"r"+asf,visited);
        floodFill(maze,sr-1,sc,"l"+asf,visited);
        floodFill(maze,sr,sc-1,"t"+asf,visited);
        visited[sr][sc] = false;
    }

    private static void encodings(String str, String asf) {

        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        else if(str.length()==1){
            String ch0 = str.substring(0, 1);
            String roq0 = str.substring(1);
            encodings(roq0, asf + CharacterMap.get(ch0));
        }
        else {
            encodings(str.substring(1), asf + CharacterMap.get(str.substring(0, 1)));
            encodings(str.substring(2), asf + CharacterMap.get(str.substring(0, 2)));
        }
    }



    private static void permutations(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<str.length();i++ ) {
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            System.out.println(str+"    str");
            System.out.println("left--> " + left+ "  right-->  " + right+" ans-->  "+ans+str.charAt(i) +"  i-"+i);
            permutations(left+right, ans+str.charAt(i));
        }
    }

    private static void printMazePathsJump(int sr, int sc, int dr, int dc, String ans) {

        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        else if(sr>dr ||sc>dc){
            return;
        }

        for(int ms=1;ms<=dc-sc;ms++){
            printMazePathsJump(sr,sc+ms,dr,dc,"h"+ms+ans);
        }
        for(int ms=1;ms<=dr-sr;ms++){
            printMazePathsJump(sr+ms,sc,dr,dc,"v"+ms+ans);
        }
        for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
            printMazePathsJump(sr+ms,sc+ms,dr,dc,"d"+ms+ans);
        }
    }

    private static void printMazePaths(int sr, int sc, int dr, int dc,String ans) {

        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        else if(sr>dc||sc>dc){
            return;
        }
        printMazePaths(sr+1,sc,dr,dc,"h"+ans);
        printMazePaths(sr,sc+1,dr,dc,"v"+ans);
    }

    private static void printStairsPath(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }
        else if(n<0){
            return;
        }
        printStairsPath(n-1,"1"+path);
        printStairsPath(n-2,"2"+path);
        printStairsPath(n-3,"3"+path);
    }

    private static void PrintkeyPadCombination(String ques, String ans) {
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        String seq = keypadmap.get(ques.charAt(0)+"");
        for(int i=0;i<seq.length();i++){
            //System.out.print(seq.charAt(i)+ans +" ");
            PrintkeyPadCombination(ques.substring(1),seq.charAt(i)+ans);
        }

    }

    private static void printSubsequence(String str,String ans) {

        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        printSubsequence(str.substring(1),ans+str.charAt(0));
        printSubsequence(str.substring(1),ans+"");

    }

    private static  List<String> getMazePathsJump(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc)
        {
            ArrayList< String> bres = new ArrayList< >();
            bres.add("");
            return bres;
        }
        else if (sr > dr || sc > dc)
        {
            ArrayList< String> bres = new ArrayList< >();
            return bres;
        }
         List< String> paths = new ArrayList< >();
        for(int ms=1 ;ms<=dc-sc ;ms++){
            List<String> hpaths = getMazePathsJump(sr , sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" +ms+ hpath);
            }
        }
        for(int ms=1 ;ms<=dr-sr ;ms++){
            List<String> vpaths = getMazePathsJump(sr + ms, sc , dr, dc);
            for (String vpath : vpaths) {
                paths.add("v"+ ms + vpath);
            }
        }
        for(int ms=1 ;ms<=dr-sr && ms<=dc-sc ;ms++) {
            List<String> dpaths = getMazePathsJump(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d"+ms + dpath);
            }
        }
        return paths;
    }

    public static ArrayList< String> getMazePaths2(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc)
        {
            ArrayList< String> bres = new ArrayList< >();
            bres.add("");
            return bres;
        }
        else if (sr > dr || sc > dc)
        {
            ArrayList< String> bres = new ArrayList< >();
            return bres;
        }

        ArrayList< String> paths = new ArrayList< >();
        for (int hms = 1; hms <= dc - sc; hms++)
        {
            ArrayList< String> hpaths = getMazePaths2(sr, sc + hms, dr, dc);

            for (String hpath : hpaths)
            {
                paths.add("h" + hms + hpath);
            }
        }

        for (int vms = 1; vms <= dr - sr; vms++)
        {
            ArrayList< String> vpaths = getMazePaths2(sr + vms, sc, dr, dc);

            for (String vpath : vpaths) {
                paths.add("v" + vms + vpath);
            }
        }

        for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++)
        {
            ArrayList< String> dpaths = getMazePaths2(sr + dms, sc + dms, dr, dc);

            for (String dpath : dpaths)    {
                paths.add("d" + dms + dpath);
            }
        }
        return paths;
    }

    private static List<String> getMazePaths(int i, int j, int m, int n) {

        if (i == m && j == n) {
            return new ArrayList<String>() {{
                add("");
            }};
        } else if (i > m || j > n) {
            return new ArrayList<String>();
        }
        List<String> resh = getMazePaths(i + 1, j, m, n);
        List<String> resv = getMazePaths(i , j + 1, m, n);
        List<String> rres = new ArrayList<>();
        for (String strh : resh) {
            rres.add("h" + strh);
        }
        for (String strv : resv) {
            rres.add("v" + strv);
        }
        return rres;
    }

    private static List<String> getStairsPath(int n) {

        if(n==0){
            return new ArrayList<String>(){{add("");}};
        }
        else if(n<0){
            return new ArrayList<String>();
        }

        List<String> res1 = getStairsPath(n-1);//9/8..7888[[[1
        List<String> res2 = getStairsPath(n-2);//9/8..7888[[[1
        List<String> res3 = getStairsPath(n-3);//9/8..7888[[[1
        List<String> rres = new ArrayList<>();

            for (String str:res1) {
                rres.add("1"+str);
        }
            for (String str:res2) {
                rres.add("2"+str);
            }
            for (String str:res3) {
                rres.add("3"+str);
            }

            return  rres;
    }

    private static List<String> keyPadCombination(String str) {

        if(str.length()==0){
            return new ArrayList<String>(){{add("");}};
        }
        List<String> combination = keyPadCombination(str.substring(1));
        List<String> res = new ArrayList<>();
        String chars = keypadmap.get(str.charAt(0)+"");
        for(int i=0;i<chars.length();i++){
            for (String str2: combination) {
                res.add(str2+chars.charAt(i));
            }
        }
        return res;
    }

    private static List<String> subsequence(String str) {

        if(str.length()==0){
            return new ArrayList<String>(){{add("");}};
        }
        List<String> arr = subsequence(str.substring(1));
        List<String> arRES = new ArrayList<>();
        for (String st:arr) {
            arRES.add(str.charAt(0)+st);
            arRES.add(""+st);
        }
        return arRES;
    }

    private static List<Integer> allIndices(List<Integer> ar,int a,int idx) {
        if(ar.size()==idx){
            return new ArrayList<Integer>();
        }
        if(ar.get(idx)==a){
            List<Integer> arres = allIndices(ar,a,idx+1);
            arres.add(idx);
            return arres;
        }
        else {
            List<Integer> arres = allIndices(ar,a,idx+1);
            return arres;
        }
    }

    private static int lastIndex(List<Integer> ar,int a,int idx) {
        if(ar.size()==idx){
            return -1;
        }
        if(ar.get(ar.size()-1-idx)==a)
            return ar.size()-1-idx;

        return lastIndex(ar,a,idx+1);
    }

    private static int firstIndex(List<Integer> ar,int a,int idx) {
        if(ar.size()==idx){
            return -1;
        }
        if(ar.get(idx)==a)
            return idx;

        return firstIndex(ar,a,idx+1);
    }

    private static int MaximumInArray(List<Integer> ar, int idx) {
        if(idx==ar.size())
            return ar.get(idx-1);
        int newMax = MaximumInArray(ar,idx+1);
        if(ar.get(idx) > newMax)
            return ar.get(idx);
        return newMax;
    }

    private static void printArray(List<Integer> ar,int idx) {
        if(ar.size()==0)
            return;
        System.out.print(ar.get(ar.size()-1-idx)+" ");
        printArray(ar.subList(1,ar.size()),idx-1);
    }

    private static void printArray2(List<Integer> ar,int idx) {
        if(idx==ar.size())
            return;
        printArray2(ar,idx+1);
        System.out.println(ar.get(idx));
    }

    private static void TowerOfHanoi(int n,int t1id, int t2id,int t3id) {
        if(n==0){
            return;
        }

        TowerOfHanoi(n-1,t1id,t3id,t2id);
        //10->11 10-->12 11-->12 10-->11 -- fix 1
        TowerOfHanoi(n-1,t3id,t2id,t1id);
        //12 --> 10 12 --> 11 10 -->11
    }

    private static int powerLinear2(int a, int n) {
        if (n == 0) {
            return 1;
        }
         int apn = powerLinear2(a, n / 2);
          int an = apn*apn;
          if(n%2==1){
              an = an *a;
          }
          return an;
    }

    private static int powerLinear(int a, int n) {
        if(n==0){
            return 1;
        }
        return a * powerLinear(a,n-1);
    }

    private static int factorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    private static void printIncreasingDecreasing(int i) {
        if(i==0){
            return;
        }
        System.out.print(i+" ");
        printIncreasingDecreasing(i-1);
        System.out.print(i+" ");
    }

    private static void printDecreasing(int i) {
        if(i==0){
            return;
        }
        System.out.print(i+" ");
        printIncreasing(i-1);
    }

    private static void printIncreasing(int i) {
        if(i==0){
            return;
        }
        printIncreasing(i-1);
        System.out.print(i+" ");
    }


}
