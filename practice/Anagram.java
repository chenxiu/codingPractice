package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

  public static void main(String[] args) {
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> result = groupAnagrams(input);
    System.out.println(result.toString());
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    for (String s : strs) {
      char[] c = s.toCharArray();
      Arrays.sort(c);
      String key = String.valueOf(c);
      if (!map.containsKey(key))
        map.put(key, new ArrayList<String>());
      map.get(key).add(s);
    }
    // return new ArrayList<List<String>>(map.values());
    List<List<String>> result = new ArrayList<List<String>>();
    for (String key : map.keySet())
      result.add(map.get(key));
    return result;

  }
}
