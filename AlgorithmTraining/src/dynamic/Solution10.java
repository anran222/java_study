package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/24
 *@Version 1.0
 * 最小路径和
 * 给定一个由非负整数填充的m x n的二维数组，现在要从二维数组的左上角走到右下角，请找出路径上的所有数字之和最小的路径。
    注意：你每次只能向下或向右移动。
 */

public class Solution10 {
    public int minPathSum (int[][] grid) {
        if (grid.length==0){
            return 0;
        }
        int row=grid.length;
        int col=grid[0].length;
        for (int i = 1; i <row ; i++) {
            grid[i][0]=grid[i-1][0]+grid[i][0];
        }
        for (int i = 1; i <col ; i++) {
            grid[0][i]=grid[0][i-1]+grid[0][i];
        }
        for (int i = 1; i <row ; i++) {
            for (int j = 1; j <col ; j++) {
                grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }
}
