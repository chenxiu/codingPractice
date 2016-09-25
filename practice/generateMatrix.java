package practice;

public class generateMatrix {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n = 4;
    printMatrix(generateMatrix(n));
  }

  public static void printMatrix(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.print(matrix[i][j]);
      System.out.println();
    }
  }

  public static int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];

    rec(matrix, 1, 0, 0, n - 1, n - 1);

    return matrix;
  }

  public static void rec(int[][] matrix, int count, int x1, int y1, int x2,
      int y2) {
    if (x1 > x2 || y1 > y2)
      return;
    else if (x1 == x2) {
      matrix[x1][y1] = count;
      return;
    }

    for (int j = y1; j < y2; j++)
      matrix[x1][j] = count++;
    for (int i = x1; i < x2; i++)
      matrix[i][y2] = count++;
    for (int j = y2; j > y1; j--)
      matrix[x2][j] = count++;
    for (int i = x2; i > x1; i--)
      matrix[i][y1] = count++;

    rec(matrix, count, x1 + 1, y1 + 1, x2 - 1, y2 - 1);
  }

}
