package practice;

import java.util.Arrays;

public class buySellStock {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] prices = {1, 2, 4, 2, 1};
    Arrays.sort(prices);
    System.out.println(prices[1]);
    System.out.println(maxProfit(prices));

  }

  public static int maxProfit(int[] prices) {
    int len = prices.length;
    int sum = 0;
    int start = 0;
    boolean hold = false;
    int i = 0;

    if (len <= 1)
      return 0;

    for (i = 0; i < len - 1; i++) {
      if (prices[i] < prices[i + 1] && hold == false) {// buy the stock
        start = i;
        hold = true;
      } else if (prices[i] > prices[i + 1] && hold == true) {// sell the stock
        sum += prices[i] - prices[start];
        hold = false;
      }
    }

    if (hold)
      sum += prices[len - 1] - prices[start];
    return sum;

  }
}
