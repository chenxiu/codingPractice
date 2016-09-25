package practice;

import java.util.ArrayList;
import java.util.List;

public class summaryRange {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {-1};
    System.out.println(summaryRanges(nums));
  }

  public static List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<String>();
    if (nums.length == 1) {
      result.add(Integer.toString(nums[0]));
      return result;
    }
    int start = 0;
    int end = 0;

    while (end + 1 < nums.length) {
      if (nums[end + 1] > nums[end] + 1) {
        if (start == end) {
          result.add(Integer.toString(nums[end]));
          start = end + 1;
        } else {
          result.add(nums[start] + "->" + nums[end]);
          start = end + 1;
        }
      }

      end++;
      if (end == nums.length - 1) {
        if (start < end && nums[end] == nums[end - 1] + 1)
          result.add(nums[start] + "->" + nums[end]);
        else // end the last range
          result.add(Integer.toString(nums[end]));

      }

      // end++;
    }
    return result;
  }
}
