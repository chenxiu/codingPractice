package practice;

public class rotateMatrix {
  public static int swap1;
  public static int swap2;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14,
    // 15, 16}};
    int[][] matrix = {{1, 2}, {3, 4}};

    printMatrix(matrix);
    reverseUpDown(matrix);
    printMatrix(matrix);
    reverseDiagonal(matrix);
    printMatrix(matrix);

  }

  public static void reverseDiagonal(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++)
        swap(matrix, i, j, j, i);
    }
  }

  public static void reverseUpDown(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len / 2; i++) {
      for (int j = 0; j < len; j++)
        swap(matrix, i, j, len - i - 1, j);
    }
  }

  public static void reverseLeftRight(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len / 2; j++)
        swap(matrix, i, j, i, len - j - 1);
    }
  }

  public static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
    int tmp = matrix[i1][j1];
    matrix[i1][j1] = matrix[i2][j2];
    matrix[i2][j2] = tmp;
  }

  public static void printMatrix(int[][] matrix) {
    int len = matrix.length;
    System.out.println();
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
  }

}
