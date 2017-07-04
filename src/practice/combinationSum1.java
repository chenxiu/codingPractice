package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] nums = {2, 3, 6, 7};
    int target = 7;

    if (nums.length <= 0)
      System.out.println("length <= 0");

    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> tmpList = new ArrayList<Integer>();

    backtrack(result, tmpList, nums, target, 0);

    System.out.println(result.toString());

  }

  public static void backtrack(List<List<Integer>> result,
      List<Integer> tmpList, int[] nums, int remain, int start) {
    if (remain == 0) {
      result.add(new ArrayList<Integer>(tmpList));
    } else if (remain > 0) {
      for (int i = start; i < nums.length; i++) {
        tmpList.add(nums[i]);
        backtrack(result, tmpList, nums, remain - nums[i], i);
        tmpList.remove(tmpList.size() - 1);
      }
    }
  }

}
