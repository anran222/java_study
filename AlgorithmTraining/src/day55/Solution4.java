package day55;
/*
 *@Author:anran
 *@Date:2020/10/20
 *@Version 1.0
 * 股票的最大利润
 */

public class Solution4 {
    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int send=0;
        for (int i = 0; i <prices.length ; i++) {
            buy=Math.min(buy,prices[i]);
            send=Math.max(send,prices[i]-buy);
        }
        return send;
    }
}
