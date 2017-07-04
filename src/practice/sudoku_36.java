package practice;

public class sudoku_36 {

  public static void main(String[] args) {
    char[][] board = {{'.', '8', '7', '6', '5', '4', '3', '2', '1'},
        {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'5', '.', '.', '.', '4', '.', '.', '.', '.'},
        {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};
    System.out.println(isValidSudoku(board));
  }

  private static boolean isValidSudoku(char[][] board) {
    boolean[][] horizon = new boolean[9][9];
    boolean[][] vertical = new boolean[9][9];
    boolean[][] block = new boolean[9][9];
    int curNum = 0;
    int blkNum = 0;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.') {
          curNum = board[i][j] - '0';
          blkNum = i / 3 * 3 + j / 3;
          if (horizon[i][curNum - 1] || vertical[j][curNum - 1]
              || block[blkNum][curNum - 1])
            return false;
          horizon[i][curNum - 1] = true;
          vertical[j][curNum - 1] = true;
          block[blkNum][curNum - 1] = true;
        }
      }
    }
    return true;
  }
}
