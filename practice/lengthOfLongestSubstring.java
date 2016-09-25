package practice;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {

  public static void main(String[] args) {
    String s1 = "abcabcbb";
    String s2 = "BBBBB";
    String s3 = "pwwkew";
    System.out.println(lengthOfLongestSubstring(s3));

  }

  public static int lengthOfLongestSubstring(String s) {
    int left = 0;
    int max = 0;
    int right = 0;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (right = 0; right < s.length(); right++) {
      if (map.containsKey(s.charAt(right))) {
        left = Math.max(left, map.get(s.charAt(right)) + 1);
      }
      map.put(s.charAt(right), right);
      max = Math.max(max, right - left + 1);
    }
    return max;
  }

}
