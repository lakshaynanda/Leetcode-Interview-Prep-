class Solution {
    public String tictactoe(int[][] moves) {
        Character[][] board = getFilled(moves);
        for(int i = 0; i < 3; i++) {
            if (board[i][0] != null && (board[i][0] == board[i][1]) && (board[i][1] == board[i][2])) {
                return board[i][0] == 'X' ? "A" : "B";
            } else if (board[0][i] != null && (board[0][i] == board[1][i]) && (board[1][i] == board[2][i])) {
                return board[0][i] == 'X' ? "A" : "B";
            } else if (board[1][1] != null && (board[1][1] == board[0][0] && board[1][1] == board[2][2] || board[1][1] == board[2][0] && board[1][1] == board[0][2])) {
                return board[1][1] == 'X' ? "A" : "B";
            }
        }
        return moves.length == 9 ? "Draw" : "Pending"; 
    }
    public Character[][] getFilled(int[][] moves) {
        Character board[][] = new Character[3][3];
        for(int i = 0; i < moves.length; i++) {
            board[moves[i][0]][moves[i][1]] = (i % 2) == 0 ? 'X' : 'O';
        }
        return board;
    }
}