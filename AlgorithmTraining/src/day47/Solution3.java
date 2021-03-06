package day47;
/*
 *@Author:anran
 *@Date:2020/10/5
 *@Version 1.0
 * 礼物的最大价值
 */

public class Solution3 {
    public static void main(String[] args) {
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(maxValue(grid));
    }

    public static int maxValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for (int i = 1; i <m ; i++) {
            grid[i][0]+=grid[i-1][0];
        }
        for (int i = 1; i <n ; i++) {
            grid[0][i]+=grid[0][i-1];
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                grid[i][j]+=Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
