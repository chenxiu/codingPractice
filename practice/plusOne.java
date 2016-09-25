package practice;

public class plusOne {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {9};
    int len = nums.length;

    boolean allNines = true;
    for (int i = 0; i < len; i++) {
      if (nums[i] != 9)
        allNines = false;
    }

    if (allNines) {
      int[] newNums = new int[len + 1];
      newNums[0] = 1;
      for (int i = 1; i < (len + 1); i++) {
        newNums[i] = 0;
      }
      System.out.println("allNines");
      for (int j = 0; j < (len + 1); j++) {
        System.out.print(newNums[j] + " ");
      }
    } else {
      nums[len - 1] += 1;
      for (int cur = len - 1; cur > 0; cur--) {
        if (nums[cur] == 10) {
          nums[cur] = 0;
          nums[cur - 1] += 1;
        }
      }
      System.out.println("not allNines");
      for (int j = 0; j < len; j++) {
        System.out.print(nums[j] + " ");
      }
    }

  }

}
