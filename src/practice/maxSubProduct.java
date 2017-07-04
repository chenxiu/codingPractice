package practice;

public class maxSubProduct {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {2, 3, -1, 4, -1};
    System.out.println(solution(nums));
  }

  private static int solution(int[] nums) {
    // TODO Auto-generated method stub
    if (nums.length == 0)
      return 0;

    int maxPrev = nums[0];
    int minPrev = nums[0];
    int maxHere = nums[0];
    int minHere = nums[0];
    int result = nums[0];

    for (int i = 1; i < nums.length; i++) {
      maxHere =
          Math.max(Math.max(maxPrev * nums[i], minPrev * nums[i]), nums[i]);
      minHere =
          Math.min(Math.min(maxPrev * nums[i], minPrev * nums[i]), nums[i]);
      result = Math.max(maxHere, result);
      maxPrev = maxHere;
      minPrev = minHere;
    }
    return result;
  }

}
