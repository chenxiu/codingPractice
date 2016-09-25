package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    int len = nums.length;
    int p1 = 0;
    int p2 = 1;
    int p3 = len - 1;

    Arrays.sort(nums);

    for (p1 = 0; p1 < len - 2; p1++) {
      p3 = len - 1;
      while (p3 > p1 + 1) {
        p2 = p1 + (p3 - p1) / 2;
        while (p2 > p1 && p2 < p3) {
          if (nums[p1] + nums[p2] + nums[p3] == 0) {
            List<Integer> set = new ArrayList<Integer>();
            set.add(nums[p1]);
            set.add(nums[p2]);
            set.add(nums[p3]);
            if (!result.contains(set))
              result.add(set);
            break;
          } else if (nums[p1] + nums[p2] + nums[p3] < 0)
            p2++;
          else
            p2--;
        }
        p3--;
      }
    }

    System.out.println(result.toString());
  }
}
