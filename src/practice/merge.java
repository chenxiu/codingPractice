package practice;

public class merge {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums1 = {1, 0};
    int[] nums2 = {0};
    int m = 1;
    int n = 1;
    int cur = m + n - 1;
    int i = m - 1;
    int j = n - 1;

    for (cur = m + n - 1; cur >= 0; cur--) {
      if (i == -1) {
        nums1[cur] = nums2[j];
        j--;
      } else if (j == -1) {
        nums1[cur] = nums1[i];
        i--;
      } else {
        if (nums1[i] >= nums2[j]) {
          System.out.println("cur:" + cur + " i:" + i);
          nums1[cur] = nums1[i];
          i--;
        } else {
          nums1[cur] = nums2[j];
          j--;
        }
      }
    }
    for (int k = 0; k < nums1.length; k++) {
      System.out.print(nums1[k] + " ");
    }
  }
}
