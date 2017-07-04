package practice;

import java.util.ArrayList;
import java.util.List;

public class pascalTri2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int numRows = 1;
    List<Integer> row = new ArrayList<Integer>();

    if (numRows < 0)
      System.out.println("numRows < 0");

    for (int i = 0; i <= numRows; i++)
      row.add(0); // Initialization

    for (int i = 0; i <= numRows; i++) { // repeat numRows times
      for (int j = numRows; j > 0; j--) {
        row.set(j, row.get(j) + row.get(j - 1));
      }
      row.set(0, 1);
    }
    System.out.println(row.toString());

  }

}
