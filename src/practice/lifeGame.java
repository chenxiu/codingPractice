package practice;

public class lifeGame {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int board[][] = {{1, 0, 1, 1}, {0, 0, 1, 0}, {0, 1, 1, 1}};
    printBoard(board);

    board = gameOfLife(board);

    printBoard(board);
  }

  public static int[][] gameOfLife(int[][] board) {
    int row = board.length;
    int col = board[0].length;
    int neighbor = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        neighbor = getNeighbor(board, i, j);
        if ((board[i][j] & 1) == 1) {
          if (neighbor >= 2 && neighbor <= 3)
            board[i][j] = 3;
        } else {
          if (neighbor == 3)
            board[i][j] = 2;
        }
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        board[i][j] >>= 1;
      }
    }

    return board;
  }

  private static int getNeighbor(int[][] board, int i, int j) {
    // TODO Auto-generated method stub
    int row = board.length;
    int col = board[0].length;
    int neighborCnt = 0;
    for (int I = Math.max(i - 1, 0); I <= Math.min(i + 1, row - 1); I++) {
      for (int J = Math.max(j - 1, 0); J <= Math.min(j + 1, col - 1); J++) {
        if (!(i == I && j == J))
          if ((board[I][J] & 1) == 1)
            neighborCnt++;
      }
    }
    return neighborCnt;
  }

  private static void printBoard(int[][] board) {
    System.out.println();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

}
