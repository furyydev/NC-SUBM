class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> dup = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (dup.contains(board[i][j])) {
                    return false;
                }
                dup.add(board[i][j]);
            }
            dup.clear();
        }
        dup.clear();
        for (int k = 0; k < board.length; k++) {
            for (int l = 0; l < board.length; l++) {
                if (board[l][k] == '.')
                    continue;
                if (dup.contains(board[l][k])) {
                    return false;
                }
                dup.add(board[l][k]);
            }
            dup.clear();
        }
        dup.clear();

        for (int square = 0; square < 9; square++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.')
                        continue;
                    if (dup.contains(board[row][col]))
                        return false;
                    dup.add(board[row][col]);
                }
            }
            dup.clear();
        }
        return true;
    }
}
