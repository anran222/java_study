/**
 * @Author:xiang
 * @Date:2020/7/12 18:36
 * 风中的猪
 */
public class PigInTheWind {
    public static void main(String[] args) {
        int[] price={3,8,5,1,7,8};
        System.out.println(calculateMax(price));
    }

    public static int calculateMax(int[] prices) {
        int min=Integer.MAX_VALUE;
        int first=0;
        int min2=Integer.MIN_VALUE;
        int max=0;

        for (int i = 0; i <prices.length ; i++) {
            min=Math.min(min,prices[i]);

            first=Math.max(first,prices[i]-min);

            min2=Math.max(min2,first-prices[i]);

            max=Math.max(max,prices[i]+min2);
        }
        return max;
    }
}
