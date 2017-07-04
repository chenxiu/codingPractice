package practice;

public class palindrome {

  public static void main(String[] args) {
    String s1 = "civic";
    String s2 = "Zbz";
    String s3 = "abc";
    System.out.println(pal(s2));
  }

  private static boolean pal(String s) {
    int len = s.length();
    for (int i = 0; i < len / 2; i++) {
      System.out.println(Math.abs(s.charAt(i) - s.charAt(len - i - 1)));
      if (s.charAt(i) != s.charAt(len - 1 - i)
          && Math.abs(s.charAt(i) - s.charAt(len - i - 1)) != 32)
        return false;
    }

    return true;
  }
}
