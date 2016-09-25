package practice;

public class wordSearch {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    char[][] board =
        {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "ABCB";
    System.out.println(exist(board, word));

  }

  public static boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;
    if (m == 0 || n == 0 || word.length() == 0)
      return false;

    // iniatialize to be all false
    boolean[][] visited = new boolean[m][n];
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        visited[i][j] = false;

    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++) {
        if (exist(board, visited, word, i, j, 0))
          return true;
      }
    return false;
  }


  public static boolean exist(char[][] board, boolean[][] visited, String word,
      int i, int j, int Idx) {
    if (word.length() == Idx)
      return true;
    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
      return false;
    else if (board[i][j] != word.charAt(Idx) || visited[i][j])
      return false;

    visited[i][j] = true;
    boolean res = exist(board, visited, word, i + 1, j, Idx + 1)
        || exist(board, visited, word, i, j + 1, Idx + 1)
        || exist(board, visited, word, i - 1, j, Idx + 1)
        || exist(board, visited, word, i, j - 1, Idx + 1);
    visited[i][j] = false;

    return res;
  }

}
