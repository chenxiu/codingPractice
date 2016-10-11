package practice;

public class UniqueBinarySearchTrees_96 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int n = 6;
    System.out.println(numTrees(n));

  }

  public static int numTrees(int n) {
    int[] result = new int[n + 1];
    result[0] = 1;
    result[1] = 1;
    // result[2] = 2;
    // result[3] = 5;

    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < i / 2; j++) {
          result[i] += result[j] * result[i - j - 1] * 2;
        }
      } else {
        for (int j = 0; j < i / 2; j++) {
          result[i] += result[j] * result[i - j - 1] * 2;
        }
        result[i] += result[i / 2] * result[i / 2];
      }
      System.out.println("i: " + i + "result[i]: " + result[i]);
    }
    return result[n];
  }

}
