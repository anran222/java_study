package interview;

/**
 * @Author:xiang
 * @Date:2020/7/15 22:03
 * 股票的最大利润
 */
public class TheBiggestProfitOfStock {
    public static void main(String[] args) {
        int[] pricees={7,6,4,3,1};
        System.out.println(maxProfit(pricees));
    }

    public static int maxProfit(int[] prices){
        int min=Integer.MAX_VALUE;
        int shell=0;
        for (int i = 0; i <prices.length ; i++) {
            min=Math.min(min,prices[i]);
            shell=Math.max(shell,prices[i]-min);
        }
        return shell;
    }
}
