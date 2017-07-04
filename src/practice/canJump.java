package practice;

public class canJump {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {3, 2, 1, 0, 4};
    System.out.println(canJump(nums));
  }

  public static boolean canJump(int[] nums) {
    int len = nums.length;
    int i = 0;
    int reach = 0;

    while (i <= reach) {
      reach = Math.max(reach, i + nums[i]);
      if (reach >= len - 1)
        return true;
      i++;
    }
    return false;
  }

}
