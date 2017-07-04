package practice;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[][] matrix = {{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    System.out.println(spiralOrder(matrix).toString());
  }

  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<Integer>();
    int m = matrix.length;
    int n = matrix[0].length;

    rec(matrix, result, 0, 0, m - 1, n - 1);

    return result;
  }

  public static List<Integer> rec(int[][] matrix, List<Integer> result, int x1,
      int y1, int x2, int y2) {

    int m = x2 - x1 + 1;
    if (m <= 0)
      return result;
    else if (m == 1) {// single row
      for (int j = y1; j <= y2; j++)
        result.add(matrix[x1][j]);
      return result;
    }

    int n = y2 - y1 + 1;
    if (n <= 0)
      return result;
    else if (n == 1) {// single column
      for (int i = x1; i <= x2; i++)
        result.add(matrix[i][y1]);
      return result;
    }

    // top row
    for (int j = y1; j < y2; j++)
      result.add(matrix[x1][j]);
    // right column
    for (int i = x1; i < x2; i++)
      result.add(matrix[i][y2]);
    // bottom row
    for (int j = y2; j > y1; j--)
      result.add(matrix[x2][j]);
    // left column
    for (int i = x2; i > x1; i--)
      result.add(matrix[i][y1]);

    rec(matrix, result, x1 + 1, y1 + 1, x2 - 1, y2 - 1);

    return result;
  }

}
