class TicTacToe {
    private int[][] board;
    int n;
    public TicTacToe(int n) {
        board = new int[n][n];
        this.n = n;
    }
    
    public int move(int row, int col, int player) {
        board[row][col] = player;
        if(checkRow(row, player) || 
           checkCol(col, player) || 
           (row == col && checkDiag(player)) || 
           (col == n - row - 1) && checkAntiDiag(player)) {
            return player;
        }
        return 0;
    }
    public boolean checkRow(int row, int player) {
        for(int col = 0; col < n; col++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }
    public boolean checkCol(int col, int player) {
        for(int row = 0; row < n; row++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }
    public boolean checkDiag(int player) {
        for(int row = 0; row < n; row++) {
            if (board[row][row] != player) {
                return false;
            }
        }
        return true;
    }
    public boolean checkAntiDiag(int player) {
        for(int row = 0; row < n; row++) {
            if (board[row][n - row - 1] != player) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */