class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!isValidRowColBox(i, j, board)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValidRowColBox(int i, int j, char[][] board) {
      
        //check if val is reapting in the same column and row
        for (int k = 0; k < 9; k++) {
            if (j != k && board[i][j] == board[i][k]) {
                return false;
            }
            if (i != k && board[i][j] == board[k][j]) {
                return false;
            }
        }
      
      
        // find the end row for 3x3 box
        int endRow = (int) Math.ceil((i + 1) / 3.0) * 3;
        int endCol = (int) Math.ceil((j + 1) / 3.0) * 3;
        
        // check if val is repeating in the 3x3 box
        for (int k = endRow - 3; k < endRow; k++) {
            for (int l = endCol - 3; l < endCol; l++) {
                if (i != k && j != l) {
                    if (board[i][j] == board[k][l]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
