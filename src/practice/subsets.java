package practice;

import java.util.ArrayList;
import java.util.List;

public class subsets {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {1, 2, 2};
    System.out.println(subsets(nums).toString());

  }

  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> tmpList = new ArrayList<Integer>();

    tryAdd(result, tmpList, nums, 0);
    return result;
  }

  public static void tryAdd(List<List<Integer>> result, List<Integer> tmpList,
      int[] nums, int startIdx) {
    if (!result.contains(tmpList))
      result.add(new ArrayList<Integer>(tmpList));
    for (int i = startIdx; i < nums.length; i++) {
      tmpList.add(nums[i]);
      tryAdd(result, tmpList, nums, i + 1);
      tmpList.remove(tmpList.size() - 1);
    }
  }


}
