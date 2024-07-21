package dsprep;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    static List<List<String>> base = new ArrayList<>();

    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int[n][n];
        //for (int i = 0; i < n; i++) {
            List<List<String>> lists = solveNQueens(n, 0, 0, board);
        //}
        System.out.println(base);
    }

    public List<List<String>> solveNQueens(int n) {
        base = new ArrayList<>();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            solveNQueens(n, i, 0, board);
        }
        return base;
    }

    public static List<List<String>> solveNQueens(int n, int row, int col, int[][] board) {
        if (n==0) {
            List<String> list = new ArrayList<>();
            for (int[] ints : board) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    if (ints[j] == 1) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
            base.add(list);
        }
        if(row>=board.length) {
            return base;
        }
        for (int i = 0; i < board.length; i++) {
            if (isQueenSafe(row, i, board)) {
                board[row][i] = 1;
                solveNQueens(n - 1, row + 1, i, board);
                board[row][i] = 0;
            }
        }
        return base;
    }

    private static boolean isQueenSafe(int row, int col, int[][] board) {
        // Check horizontal and vertical directions
        for (int i = 0; i < row; i++) {
            if (board[i][col] != 0) {
                return false;
            }
        }
        for (int j = col; j >= 0; j--) {
            if (board[row][j] != 0) {
                return false;
            }
        }
        // Check diagonal directions
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] != 0) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] != 0) {
                return false;
            }
        }
        // If no other queens are found, return true
        return true;
    }
}
