package practice;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int numRows = 4;
    List<List<Integer>> tri = new ArrayList<List<Integer>>();

    if (numRows <= 0)
      System.out.println("numRows < 0");

    for (int rowIdx = 0; rowIdx < numRows; rowIdx++) {
      List<Integer> row = new ArrayList<Integer>();
      for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
        if (colIdx == 0 || colIdx == rowIdx) {
          row.add(1);
        } else
          row.add((tri.get(rowIdx - 1).get(colIdx - 1))
              + (tri.get(rowIdx - 1).get(colIdx)));
      }
      tri.add(row);
    }
    System.out.println(tri.toString());
  }
}
