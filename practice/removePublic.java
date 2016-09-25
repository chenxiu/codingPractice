package practice;

public class removePublic {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {1, 1, 1, 2, 2, 3};
    System.out.println(removeDuplicates(nums));
    for (int i = 0; i < nums.length; i++)
      System.out.print(nums[i]);
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length <= 2)
      return nums.length;

    int idx = 2;
    int cur = 2;

    for (cur = 2; cur < nums.length; cur++) {
      if (nums[cur] > nums[idx - 2]) {
        nums[idx] = nums[cur];
        idx++;
      }
    }
    return idx;
  }

}
