package practice;

public class MinimumSizeSubArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {1, 4, 4};
    int s = 4;
    System.out.println(minSubArrayLen(s, nums));
  }



  public static int minSubArrayLen(int s, int[] nums) {
    int len = nums.length;
    if (len == 0)
      return 0;
    int i = 0;
    int j = 0;

    int result = Integer.MAX_VALUE;
    int sum = 0;

    while (i < len) {
      sum += nums[i++];
      while (sum >= s) {
        sum = sum - nums[j++];
        result = Math.min(result, i - j + 1);
      }
    }

    if (result == Integer.MAX_VALUE)
      return 0;
    else
      return result;
  }
}
