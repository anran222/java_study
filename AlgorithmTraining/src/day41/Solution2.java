package day41;
/*
 *@Author:anran
 *@Date:2020/9/26
 *@Version 1.0
 * 股票的最大利润
 */

public class Solution2 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int send=0;
        for (int i = 0; i <prices.length ; i++) {
            buy=Math.min(prices[i],buy);
            send=Math.max(prices[i]-buy,send);
        }
        return send;
    }
}

