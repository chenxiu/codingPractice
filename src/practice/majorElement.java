package practice;

import java.util.HashMap;
import java.util.Map;

public class majorElement {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] nums = {6, 5, 5};
    Map<Integer, Integer> majorMap = new HashMap<Integer, Integer>();
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      if (!majorMap.containsKey(nums[i]))
        majorMap.put(nums[i], 1);
      else
        majorMap.put(nums[i], majorMap.get(nums[i]) + 1);
      if (majorMap.get(nums[i]) > nums.length / 2) {
        result = nums[i];
        break;
      }
    }
    System.out.println("major: " + result);
  }

}
