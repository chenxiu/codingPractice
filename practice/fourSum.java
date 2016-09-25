package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {1, 0, -1, 0, 0, -2, 2};
    int target = 0;

    int len = nums.length;
    int p1 = 0;
    int p2 = 1;
    int p3 = 2;
    int p4 = len - 1;

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    Arrays.sort(nums);

    for (p1 = 0; p1 < len - 3; p1++) {
      for (p2 = p1 + 1; p2 < len - 2; p2++) {
        p3 = p2 + 1;
        p4 = len - 1;
        while (p3 < p4) {
          if (nums[p1] + nums[p2] + nums[p3] + nums[p4] == target) {
            List<Integer> set = new ArrayList<Integer>();
            set.addAll(Arrays.asList(nums[p1], nums[p2], nums[p3], nums[p4]));
            result.add(set);
            p3++;
            p4--;
          } else if (nums[p1] + nums[p2] + nums[p3] + nums[p4] < target)
            p3++;
          else
            p4--;
        }
      }
    }
    System.out.println(result.toString());
  }

}
