package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/24
 *@Version 1.0
 * 背包问题
 * 有 n 个物品和一个大小为 m 的背包. 给定数组 A 表示每个物品的大小和数组 V 表示每个物品的价值.
    问最多能装入背包的总价值是多大?
 */

public class Solution11 {
    public int backPackII(int m, int[] A, int[] V) {
        int n=A.length;
        if (m==0||n==0){
            return 0;
        }
        int[][] array=new int[m+1][n+1];
        for (int i = 0; i <m ; i++) {
            array[m][0]=0;
        }
        for (int i = 0; i <n ; i++) {
            array[0][n]=0;
        }
        for (int i = 1; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
                if (A[i-1]<j){
                    array[i][j]=Math.max(array[i-1][j],array[i-1][j-A[i-1]]+V[i-1]);
                }else {
                    array[i][j]=array[i-1][j];
                }
            }
        }
        return array[m][n];
    }
}
