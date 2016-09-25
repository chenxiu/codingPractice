package practice;

public class PackProblem {

  public static void main(String[] args) {
    /*
     * 0 0 0 0 0 0 0 0 0 0 0 0
     * 
     * 0 0 0 0 0 0 0 7 7 7 7 7
     * 
     * 0 0 0 3 3 3 3 7 7 7 10 10
     * 
     * 0 0 2 3 3 5 5 7 7 9 10 10
     * 
     * 0 0 2 3 3 5 5 7 8 9 10 10
     */
    int n = 4;// number of elements
    int A[] = {7, 3, 2, 5}; // bulk of each element
    int m = 11; // pack volume
    System.out.println(uniqueSteps(n, A, m));

  }

  private static int getMax(int a, int b) {
    if (a >= b)
      return a;
    else
      return b;
  }

  private static int uniqueSteps(int n, int[] A, int m) {
    int[][] B = new int[n + 1][m + 1];
    for (int j = 0; j <= m; j++)
      B[0][j] = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        B[i][j] = B[i - 1][j];
        if (j - A[i - 1] >= 0)
          B[i][j] = getMax(B[i - 1][j], B[i - 1][j - A[i - 1]] + A[i - 1]);
        // B[i-1][j] : if not put new staff A[i-1] inside
        // B[i-1][j-A[i-1]]+A[i-1] : if put new staff A[i-1] inside
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
