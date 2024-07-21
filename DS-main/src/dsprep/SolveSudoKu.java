package dsprep;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SolveSudoKu {
    public static void main(String[] args) {

        char[][] sudoku = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };


        SolveSudoKu obj = new SolveSudoKu();
        obj.solveSudoku(sudoku);

    }

    static char[][] result;
    public void solveSudoku(char[][] board) {
        result = new char[board.length][board.length];
        solveSudoku(board, 0, 0);
        //printBoard(result);
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(result[i], 0, board[i], 0, board.length);
        }
    }

    private void solveSudoku(char[][] sudoku, int r, int c) {
        if (c == 9) {
            r++;
            c = 0;
        }
        if (r == 9 && c == 0) {
            // Display the solved board (if needed)
            // System.out.println();
            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku[0].length; j++) {
                    result[i][j] = sudoku[i][j];
                }
            }
            return;
        }
        if (r < sudoku.length && sudoku[r][c] != '.') {
            solveSudoku(sudoku, r, c + 1);
        } else {
            LinkedList<Character> leastValues = findLeastValues(sudoku, r, c);
            for (char i : leastValues) {
                sudoku[r][c] = i;
                solveSudoku(sudoku, r, c + 1);
                sudoku[r][c] = '.';
            }
        }
    }

    public boolean isValid(char[][] sudoku, int x, int y, char n) {
        for (int j = 0; j < sudoku[0].length; j++) {
            if (sudoku[x][j] == n) {
                return false;
            }
        }
        for (int i = 0; i < sudoku[0].length; i++) {
            if (sudoku[i][y] == n) {
                return false;
            }
        }
        int smi = (x / 3) * 3;
        int smj = (y / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[smi + i][smj + j] == n) {
                    return false;
                }
            }
        }
        return true;
    }




    private LinkedList<Character> findLeastValues(char[][] sudoku, int x, int y) {
        // Create a set to store valid values
        Set<Character> validValues = new HashSet<>();

        // Check rows, columns, and the 3x3 subgrid
        for (char i = '1'; i <= '9'; i++) {
            if (isValid(sudoku, x, y, i)) {
                validValues.add(i);
            }
        }

        // Convert the set to a linked list
        return new LinkedList<>(validValues);
    }


    private static void displayBoard1(char[][] sudoku) {
        for (char[] chars : sudoku) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }



}
