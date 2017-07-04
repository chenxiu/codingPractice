package practice;

public class rotateArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int n = nums.length;
    int k = 3;
    int[] head = new int[k];

    for (int i = 0; i < k; i++) { // store head
      head[i] = nums[n - k + i];
    }

    for (int j = n - 1; j >= n - k - 1; j--) { // move forward
      nums[j] = nums[j - k];
    }

    for (int i = 0; i < k; i++) {
      nums[i] = head[i];
    }

    for (int i = 0; i < n; i++)
      System.out.print(nums[i]);
  }

}
