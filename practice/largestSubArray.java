package practice;

public class largestSubArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    int len = nums.length;
    int prev = nums[0];
    int max = nums[0];

    for (int i = 1; i < len; i++) {
      prev = Math.max(prev, 0) + nums[i];
      max = Math.max(prev, max);
    }
    System.out.println(max);

  }

}
