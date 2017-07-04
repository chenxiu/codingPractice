package practice;

import java.util.ArrayList;
import java.util.List;

public class triangle {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<List<Integer>> path = new ArrayList<List<Integer>>();
    List<Integer> row1 = new ArrayList<Integer>();
    row1.add(2);
    List<Integer> row2 = new ArrayList<Integer>();
    row2.add(3);
    row2.add(4);
    List<Integer> row3 = new ArrayList<Integer>();
    row3.add(6);
    row3.add(5);
    row3.add(7);
    List<Integer> row4 = new ArrayList<Integer>();
    row4.add(4);
    row4.add(1);
    row4.add(8);
    row4.add(3);
    path.add(row1);
    path.add(row2);
    path.add(row3);
    path.add(row4);

    System.out.println(minimumTotal(path));
  }

  public static int minimumTotal(List<List<Integer>> triangle) {
    List<List<Integer>> path = new ArrayList<List<Integer>>(triangle);
    for (int i = triangle.size() - 2; i >= 0; i--) {
      List<Integer> tmpRow = new ArrayList<Integer>();
      for (int j = 0; j < triangle.get(i).size(); j++) {
        tmpRow.add(Math.min(path.get(i + 1).get(j), path.get(i + 1).get(j + 1))
            + triangle.get(i).get(j));
      }
      path.set(i, tmpRow);
    }
    return path.get(0).get(0);
  }
}
