package practice;

public class findMinimumRotatedSorted {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {3, 3, 1, 3};
    System.out.println(findMin(nums));
  }

  public static int findMin(int[] nums) {
    if (nums.length == 0)
      return 0;
    return iteration(nums, 0, nums.length - 1);
  }

  public static int iteration(int[] nums, int start, int end) {
    int min = Integer.MIN_VALUE;
    System.out.println("start " + start + " end " + end);
    if (start + 1 >= end) {
      return Math.min(nums[start], nums[end]);
    }
    int middle = (start + end) / 2;
    if (nums[middle] == nums[start] && nums[middle] == nums[end])
      return iteration(nums, start + 1, end - 1);
    else if (nums[middle] > nums[start] && nums[middle] <= nums[end])
      return iteration(nums, start, middle);
    else if (nums[middle] >= nums[start] && nums[middle] > nums[end])
      return iteration(nums, middle, end);
    else
      return iteration(nums, start, middle);

  }


}
