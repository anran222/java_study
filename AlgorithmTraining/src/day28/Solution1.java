package day28;
/*
 *@author:anran
 *@Date:2020/9/8
 *@Version 1.0
 * 构建乘积数组
 *
 */

public class Solution1 {
    public int[] constructarr(int[] a) {
        int len=a.length;
        int[] b=new int[len];
        if (len!=1) {
            b[0] = 1;
            for (int i = 1; i < len; i++) {
                b[i] = b[i - 1] * a[i - 1];
            }
            int temp = 1;
            for (int i = len- 2; i >=0; i--) {
                temp *= a[i + 1];
                b[i] *= temp;
            }
        }
        return b;
    }
}
