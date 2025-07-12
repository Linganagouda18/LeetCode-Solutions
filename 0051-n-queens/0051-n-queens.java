class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start backtracking from row 0
        solve(0, board, result);
        return result;
    }

    private void solve(int row, char[][] board, List<List<String>> result) {
        int n = board.length;

        // Base case: all rows filled, valid solution found
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }

        // Try placing a queen in each column of this row
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';      // Place queen
                solve(row + 1, board, result); // Recurse for next row
                board[row][col] = '.';      // Backtrack
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private List<String> constructBoard(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
}
