package practice;

public class maxArea {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int len = height.length;
    int p1 = 0;
    int p2 = len - 1;
    int total = 0;
    int level = 0;
    int lower = 0;

    while (p2 > p1) {
      lower = Math.min(height[p1], height[p2]);
      level = Math.max(lower, level);
      total += (level - lower);

      if (height[p1] <= height[p2])
        p1++;
      else
        p2--;
    }



    System.out.println("total: " + total);
  }

}
