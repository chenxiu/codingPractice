package practice;

public class RemoveDuplicates {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {3, 2, 2, 3, 4, 2, 3};
    int val = 3;
    int len = nums.length;
    // System.out.println(nums.length);
    int idx = 0;
    int cur = 0;
    int ex = 0;
    for (cur = 0; cur < len; cur++) {
      if (nums[cur] != val) {
        ex = nums[idx];
        nums[idx] = nums[cur];
        nums[cur] = ex;
        idx++;
      }
    }
    System.out.println("length:" + idx);
    for (int i = 0; i < idx; i++) {
      System.out.print(nums[i] + " ");
    }
  }

}
