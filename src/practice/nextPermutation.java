package practice;

public class nextPermutation {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {1};
    int len = nums.length;
    if (len == 0 || len == 1)
      System.out.println("len == 0 || len == 1");

    int head = len - 2;
    int tail = len - 1;
    int next = len - 1;
    int tmp = 0;
    boolean hasPer = false;

    while (head >= 0) { // check if has per, locate head and tail
      tail = head + 1;
      if (nums[head] < nums[tail]) {
        hasPer = true;
        break;
      }
      head--;
    }

    if (!hasPer) {
      reverse(nums, 0, len - 1);
      System.out.println(nums.toString());
    }


    while (next >= tail) { // locate next, the number to be exchanged with head
      if (nums[next] > nums[head])
        break;
      next--;
    }

    // exchange head and next
    swap(nums, head, next);

    // reverse the following subList
    reverse(nums, tail, len - 1);

    for (int j = 0; j < len; j++) {
      System.out.print(nums[j]);
    }
  }

  public static void swap(int[] nums, int idx1, int idx2) {
    int tmp = nums[idx1];
    nums[idx1] = nums[idx2];
    nums[idx2] = tmp;
  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }

  }



}
