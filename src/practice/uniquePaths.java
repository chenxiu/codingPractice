package practice;

public class uniquePaths {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int m = 3;
    int n = 100;
    // System.out.print(uniquePaths1(m, n));
    int[][] obstacleGrid = {{1}, {0}};
    System.out.println(uniquePathsWithObstacles(obstacleGrid));
  }

  public static int uniquePaths1(int m, int n) {
    double result = 1;
    int k = Math.min(m - 1, n - 1);
    for (int i = 1; i <= k; i++) {
      result = result * (m - 1 + n - i) / i;
    }
    return (int) result;
  }

  public static int uniquePaths2(int m, int n) {
    int[][] path = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0)
          path[i][j] = 1;
        else
          path[i][j] = path[i - 1][j] + path[i][j - 1];
      }
    }
    return path[m - 1][n - 1];
  }

  public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] matrix = new int[m][n];

    int xObstacle = 0;
    int yObstacle = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        // if (i == 0 && (obstacleGrid[i][j] == 1 || xObstacle == 1)) {
        // matrix[i][j] = 0;
        // xObstacle = 1;
        // }
        // if (j == 0 && (obstacleGrid[i][j] == 1 || yObstacle == 1)) {
        // matrix[i][j] = 0;
        // yObstacle = 1;
        // }
        // if ((i == 0 && xObstacle == 0) || (j == 0 && yObstacle == 0))
        // matrix[i][j] = 1;
        if (i == 0) {
          if (obstacleGrid[i][j] == 1 || xObstacle == 1) {
            matrix[i][j] = 0;
            xObstacle = 1;
          } else
            matrix[i][j] = 1;
        }
        if (j == 0) {
          if (obstacleGrid[i][j] == 1 || yObstacle == 1) {
            matrix[i][j] = 0;
            yObstacle = 1;
          } else
            matrix[i][j] = 1;
        }
        if (i != 0 && j != 0) {
          if (obstacleGrid[i][j] == 1)
            matrix[i][j] = 0;
          else
            matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
        }
      }
    }
    return matrix[m - 1][n - 1];
  }

}
