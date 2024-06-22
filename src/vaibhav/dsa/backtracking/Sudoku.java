package vaibhav.dsa.backtracking;

public class Sudoku {

    public static void main(String[] args) {
        int n = 9;
        int board[][] = new int[9][9];
        solveSudoku(board, 0, 0);
    }

    private static void solveSudoku(int[][] board, int i, int j) {

        if (i == board.length) {
            // display the board and return
            return;
        }
        int ni = 0;
        int nj = 0;

        if (j == board.length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i + 1;
        }

        if (board[i][j] != 0) {
            solveSudoku(board, ni, nj);
        } else {
            for (int possible = 1; possible <= 9; possible++) {
                if (isValid(board, possible, i, j)) {
                    board[i][j] = possible;
                    solveSudoku(board, ni, nj);
                    board[i][j] = 0;
                }
            }
        }
    }

    private static boolean isValid(int[][] board, int value, int x, int y) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][y] == value) {
                return false;
            }
        }

        for (int j = 0; j < board[0].length; j++) {
            if (board[x][j] == value) {
                return false;
            }
        }

        int smi = (x / 3) * 3;
        int smj = (y / 3) * 3;

        for (int i = 0; i < smi; i++) {
            for (int j = 0; j < smj; j++) {
                if (board[smi + i][smj + j] == value) {
                    return false;
                }
            }
        }

        return true;

    }
}
