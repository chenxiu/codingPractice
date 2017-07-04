package practice;

import java.util.Arrays;

public class threeSumCloest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {-2, 1, 3, 20, 80};
    int target = 70;

    Arrays.sort(nums);

    int len = nums.length;
    int closest = 1000000;
    int sum = 0;
    int p1 = 0;
    int p2 = 1;
    int p3 = len - 1;

    for (p1 = 0; p1 < len - 2; p1++) {
      p2 = p1 + 1;
      p3 = len - 1;

      while (p2 < p3) {
        sum = nums[p1] + nums[p2] + nums[p3];
        if (sum == target)
          System.out.println("sum == target");
        if (Math.abs(sum - target) < Math.abs(closest - target)) {
          closest = sum;
          System.out.println("closest: " + closest);
        }
        if (sum < target)
          p2++;
        else
          p3--;
      }
    }
    System.out.println("closest:" + closest);
  }

}
