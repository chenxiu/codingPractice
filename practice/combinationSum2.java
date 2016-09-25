package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
  public static void main(String[] args) {
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};
    int target = 8;

    Arrays.sort(candidates);

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> tmp = new ArrayList<Integer>();

    backtrackNonDup(result, tmp, candidates, target, 0);

    System.out.println(result.toString());
  }

  public static void backtrackNonDup(List<List<Integer>> result,
      List<Integer> tmp, int[] candidates, int remain, int start) {
    if (remain < 0)
      return;
    else if (remain == 0 && !result.contains(tmp))
      result.add(new ArrayList<Integer>(tmp));
    else {
      for (int i = start; i < candidates.length; i++) {
        // if (i != 0 && candidates[i] == candidates[i - 1])
        // continue; // nonDup
        tmp.add(candidates[i]);
        backtrackNonDup(result, tmp, candidates, remain - candidates[i], i + 1);
        tmp.remove(tmp.size() - 1);
      }
    }
  }

}
