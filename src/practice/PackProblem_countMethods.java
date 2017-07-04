package practice;

public class PackProblem_countMethods {

  /*
   * 1 0 0 0 0 0 0 0 0 0 0 0
   * 
   * 1 0 0 0 0 0 0 1 0 0 0 0
   * 
   * 1 0 0 1 0 0 0 1 0 0 1 0
   * 
   * 1 0 1 1 0 1 0 1 0 1 1 0
   * 
   * 1 0 1 1 0 2 0 2 1 1 2 0
   * 
   */
  public static void main(String[] args) {
    int n = 4;// number of elements
    int A[] = {7, 3, 2, 5}; // bulk of each element
    int V[] = {1, 5, 2, 4}; // value of each element
    int m = 11; // pack volume
    System.out.println(uniqueSteps(n, A, V, m));
  }

  private static int uniqueSteps(int n, int[] A, int[] V, int m) {
    int[][] B = new int[n + 1][m + 1];
    // initialization
    B[0][0] = 1;
    for (int j = 1; j <= m; j++)
      B[0][j] = 0;
    // time complexity: O(n*m)
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        B[i][j] = B[i - 1][j];
        if (j - A[i - 1] >= 0)
          B[i][j] = B[i - 1][j] + B[i - 1][j - A[i - 1]];
        // put i elements into pack with volume of j
        // possible number of methods = B[i - 1][j] + B[i - 1][j - A[i - 1]]
        // B[i-1][j]: reach j without put element A[i-1]
        // B[i-1][j-A[i-1]]: reach j with putting element A[i-1]
      }
    }
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println();
    }

    return B[n][m];
  }
}
