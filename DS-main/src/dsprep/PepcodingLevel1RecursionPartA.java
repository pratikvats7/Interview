package dsprep;

import java.util.*;

import static dsprep.RecursionAndBackTracking.displayBoard;


public class PepcodingLevel1RecursionPartA {

    public final static Map<String, String> keypadmap = new HashMap<>() {
        {
            put("1", "");
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }
    };
    static int count = 0;

    static List<List<Integer>> ans = new ArrayList<>();
    static List<Object> res = new ArrayList<>();
    int[][] DP = new int[1][1];
    HashSet<Object> set = new HashSet<>();

    public static void main(String[] args) {
        ans = new ArrayList<>();
        PepcodingLevel1RecursionPartA recursionPartA = new PepcodingLevel1RecursionPartA();
//        System.out.println(recursionPartA.factorial(5));
//        recursionPartA.printIncreasingDecreasing(10);
//        System.out.println();
//        System.out.println(recursionPartA.power(3, 5));
//        System.out.println(recursionPartA.powerlog(3, 5));
//
//        recursionPartA.PreInPost(3);
        //recursionPartA.towerOfHanoi(3, 1, 2, 3);
        int[] ar = new int[]{1, 3, 3, 4, 5, 6, 5, 8, 9, 10};
        //System.out.println(recursionPartA.findMax(ar,0));
//        System.out.println(recursionPartA.firstIndex(ar,0,19));
//        System.out.println(recursionPartA.lastIndex(ar,ar.length-1,5));
//          recursionPartA.getSubsequence("abc",0,"");
//          int[] nums = new int[]{1,2,3};
//          recursionPartA.getSubsequence(nums,0,new ArrayList<>());
//        System.out.println(ans);

        //System.out.println(recursionPartA.letterCombinations("23"));
        //System.out.println(recursionPartA.uniquePaths(2, 7));
//        System.out.println();
//        recursionPartA.printSubsequence("abc", 0, "");
//        System.out.println(res);
        //System.out.println(recursionPartA.numDecodings("216"));
//        boolean[][] visited = new boolean [5][5];
//        recursionPartA.KnightsTour(RecursionAndBackTracking.chess,0,0,visited,1);
        System.out.println(recursionPartA.checkValidGrid(new int[][]{{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}}));
    }

    public boolean checkValidGrid(int[][] grid) {
        boolean[][] visited = new boolean [grid.length][grid[0].length];
        return KnightsTour1(grid , 0, 0,visited,0);
    }

    private boolean KnightsTour1(int[][] chess, int row, int col, boolean[][] visited, int move) {

        if (row >= chess.length || col >= chess[0].length || row < 0 || col < 0 || visited[row][col]) {
            return false;
        }
        if(move == chess.length*chess[0].length-1){
            return true;
        }
        boolean result1 = false;
        if (chess[row][col] == move) {
            visited[row][col] = true;
            result1 = KnightsTour1(chess, row + 2, col + 1, visited, move + 1) ||
                    KnightsTour1(chess, row + 2, col - 1, visited, move + 1) ||
                    KnightsTour1(chess, row - 2, col + 1, visited, move + 1) ||
                    KnightsTour1(chess, row - 2, col - 1, visited, move + 1) ||
                    KnightsTour1(chess, row + 1, col + 2, visited, move + 1) ||
                    KnightsTour1(chess, row - 1, col + 2, visited, move + 1) ||
                    KnightsTour1(chess, row + 1, col - 2, visited, move + 1) ||
                    KnightsTour1(chess, row - 1, col - 2, visited, move + 1);
            visited[row][col] = false;
        }
        return result1;
    }

    private void KnightsTour(int[][] chess, int row, int col, boolean[][] visited,int move){

        if(row>=chess.length || col >= chess[0].length || row<0 || col < 0 || visited[row][col]){
            return ;
        }
        if(move==chess.length*chess[0].length){
            chess[row][col]=move;
            displayBoard(chess);
            chess[row][col]=0;
            return;
        }
        visited[row][col] = true;
        chess[row][col]=move;
        KnightsTour(chess,row+2,col+1, visited,move+1);
        KnightsTour(chess,row+2,col-1, visited,move+1);
        KnightsTour(chess,row-2,col+1, visited,move+1);
        KnightsTour(chess,row-2,col-1, visited,move+1);
        KnightsTour(chess,row+1,col+2, visited,move+1);
        KnightsTour(chess,row-1,col+2, visited,move+1);
        KnightsTour(chess,row+1,col-2, visited,move+1);
        KnightsTour(chess,row-1,col-2, visited,move+1);
        chess[row][col]=0;
        visited[row][col] = false;
    }

    private void printArray(int[][] visited) {
        for (int[] ints : visited) {
            for (int j = 0; j < visited[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
            }
        }

    public int numDecodings(String s) {
        return numDecodings(s, 0);
    }

    private int numDecodings(String str, int idx) {
        if (idx >= str.length()) {
            return 1;
        }
        int sum = 0;
        if (str.charAt(idx) != '0') {
            sum += numDecodings(str, idx + 1);
            if (idx + 1 <= str.length() - 1 && Integer.parseInt(str.substring(idx, idx + 2)) <= 26) {
                sum += numDecodings(str, idx + 2);
            }
        }
        return sum;
    }

    private void printSubsequence(String str, int idx, String asf) {
        if (idx == str.length()) {
            System.out.println(asf);
            res.add(asf);
            return;
        }
        printSubsequence(str, idx + 1, asf + str.charAt(idx));
        printSubsequence(str, idx + 1, asf);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        DP = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(DP[i], -1);
        }
        return uniquePaths(obstacleGrid, m - 1, n - 1, 0, 0);
    }

    private int uniquePaths(int[][] obstacleGrid, int m, int n, int r, int c) {
        if (r > m || c > n || obstacleGrid[r][c] == 1) {
            return 0;
        }
        if (r == m && c == n) {
            return 1;
        }
        if (DP[r][c] != -1) {
            return DP[r][c];
        }
        return DP[r][c] = uniquePaths(obstacleGrid, m, n, r + 1, c)
                + uniquePaths(obstacleGrid, m, n, r, c + 1);
    }

    public int uniquePaths(int m, int n) {
        DP = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(DP[i], -1);
        }
        return uniquePaths(m - 1, n - 1, 0, 0);
    }

    private int uniquePaths(int m, int n, int r, int c) {
        if (r > m || c > n) {
            return 0;
        }
        if (r == m && c == n) {
            return 1;
        }
        if (DP[r][c] != -1) {
            return DP[r][c];
        }
        return DP[r][c] = uniquePaths(m, n, r + 1, c) + uniquePaths(m, n, r, c + 1);
    }


    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public List<String> letterCombinations(String digits) {
        return letterCombinations(digits, 0, "");
    }

    private List<String> letterCombinations(String digits, int idx, String asf) {
        if (idx == digits.length()) {
            ArrayList<String> base = new ArrayList<>();
            base.add(asf);
            return base;
        }
        String ch = digits.charAt(idx) + "";
        List<String> res = new ArrayList<>();
        for (char c : keypadmap.get(ch).toCharArray()) {
            res.addAll(letterCombinations(digits, idx + 1, asf + c));
        }
        return res;

    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private void printIncreasingDecreasing(int n) {

        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n + ", ");
        printIncreasingDecreasing(n - 1);
        System.out.print(n + ", ");

    }

    private int power(int n, int x) {
        if (x == 0) {
            return 1;
        }
        return n * power(n, x - 1);
    }

    private int powerlog(int n, int x) {
        if (x == 0) {
            return 1;
        }
        if (x % 2 == 1) {
            return n * powerlog(n, x / 2) * powerlog(n, x / 2);
        }
        return powerlog(n, x / 2) * powerlog(n, x / 2);
    }

    private void PreInPost(int n) {
        if (n == 0)
            return;

        System.out.println("pre " + n);
        PreInPost(n - 1);
        System.out.println("In " + n);
        PreInPost(n - 1);
        System.out.println("post " + n);
    }

    private void towerOfHanoi(int n, int A, int B, int C) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, A, C, B);
        System.out.println(A + "->" + B);
        towerOfHanoi(n - 1, C, B, A);
    }

    private int findMax(int[] ar, int i) {
        if (i == ar.length - 1) {
            return ar[i];
        }
        return Math.max(findMax(ar, i + 1), ar[i]);
    }

    private int firstIndex(int[] ar, int idx, int tgt) {

        if (idx >= ar.length) {
            return -1;
        } else if (ar[idx] == tgt) {
            return idx;
        }
        return firstIndex(ar, idx + 1, tgt);
    }

    private int lastIndex(int[] ar, int idx, int tgt) {

        if (idx < 0) {
            return -1;
        } else if (ar[idx] == tgt) {
            return idx;
        }
        return lastIndex(ar, idx - 1, tgt);
    }

    private void getSubsequence(String str, int idx, String asf) {
        if (idx == str.length()) {
            System.out.println(asf);
            return;
        }
        getSubsequence(str, idx + 1, asf + str.charAt(idx));
        getSubsequence(str, idx + 1, asf);
    }

    private void getSubsequence(int[] ar, int idx, List<Integer> asf) {
        if (idx == ar.length) {
            ans.add(new ArrayList<>(asf));
            return;
        }
        asf.add(ar[idx]);
        getSubsequence(ar, idx + 1, asf);
        asf.remove(asf.size() - 1);
        getSubsequence(ar, idx + 1, asf);
    }


}
