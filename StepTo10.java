package practice;

public class StepTo10 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int total = 10;
    int step1 = 2;
    int step2 = 3;
    System.out.println(uniqueSteps(total, step1, step2));

  }

  public static int uniqueSteps(int total, int step1, int step2) {
    int cnt = 0;
    if (step1 > step2) { // guarantee step2 is bigger than step1
      int tmp = step1;
      step1 = step2;
      step2 = tmp;
    }
    for (int i = total / step2; i >= 0; i--) {
      for (int j = 0; j <= total / step1; j++) {
        if ((i * step2 + j * step1) == total)
          cnt++;
        System.out.println("i:" + i + " j: " + j + " cnt: " + cnt);
      }
    }
    return cnt;
  }

}
