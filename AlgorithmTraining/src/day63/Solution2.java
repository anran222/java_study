package day63;
/*
 *@Author:anran
 *@Date:2020/11/8
 *@Version 1.0
 * 买卖股票的最佳时机2
 */

public class Solution2 {
    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int send=0;
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]-prices[i-1]>0){
                send+=prices[i]-prices[i-1];
            }
        }
        return send;
    }
}
