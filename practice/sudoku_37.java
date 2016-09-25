package practice;

public class sudoku_37 {

  public static void main(String[] args) {
    char[][] board = {{'.', '.', '9', '7', '4', '8', '.', '.', '.'},
        {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
        {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
        {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
        {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
        {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
        {'.', '.', '.', '2', '7', '5', '9', '.', '.'}};
    printBoard(board);
    solveSudoku(board);
    printBoard(board);

  }



  public static void solveSudoku(char[][] board) {
    if (board == null || board.length != 9 || board[0].length != 9)
      return;
    solver(board);
  }

  public static boolean solver(char[][] board) {
    // System.out.println("hi");
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          for (int k = 1; k <= 9; k++) {
            board[i][j] = (char) (k + '0');
            if (validate(board))
              if (solver(board))
                return true;
          }
          board[i][j] = '.';
          return false;
        }
      }
    }
    return true;
  }



  private static boolean validate(char[][] board) {
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

  private static void printBoard(char[][] board) {
    System.out.println();
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++)
        System.out.print(board[i][j] + " ");
      System.out.println();
    }
  }
}
