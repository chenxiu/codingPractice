package practice;

public class DecodeWays_91 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s = "101110";
    System.out.println(numDecodings(s));
  }

  public static int numDecodings(String s) {
    int len = s.length();
    if (len == 0)
      return 0;

    int result[] = new int[len + 1];
    result[0] = 1;
    if (s.charAt(0) == '0')
      result[1] = 0;
    else
      result[1] = 1;

    for (int i = 2; i <= len; i++) {
      int oneDigit = Integer.valueOf(s.substring(i - 1, i));
      int twoDigit = Integer.valueOf(s.substring(i - 2, i));
      System.out.println("oneDigit: " + oneDigit + "twoDigit " + twoDigit);

      if (oneDigit >= 1 && oneDigit <= 9)
        result[i] += result[i - 1];
      if (twoDigit >= 10 && twoDigit <= 26)
        result[i] += result[i - 2];
    }
    return result[len];
  }
}
