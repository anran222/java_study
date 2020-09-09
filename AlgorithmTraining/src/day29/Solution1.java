package day29;
/*
 *@Author:anran
 *@Date:2020/9/8
 *@Version 1.0
 * 无缓存交换
 *
 */

public class Solution1 {
    public int[] exchangeAB(int[] AB) {
        AB[0]=AB[0]^AB[1];
        AB[1]=AB[0]^AB[1];
        AB[0]=AB[0]^AB[1];
        return AB;
    }
}
