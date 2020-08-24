package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/24
 *@Version 1.0
 * 机器人路径
 * 如果在图中加入了一些障碍，有多少不同的路径？
    分别用0和1代表空区域和障碍
    例如
    下图表示有一个障碍在3*3的图中央。
    [
    [0,0,0],
    [0,1,0],
    [0,0,0]
    ]
 */

public class Solution9 {
    public int uniquePathsWithObstacles (int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        int[][] array=new int[row][col];
        for (int i = 0; i <row ; i++) {
            if (obstacleGrid[i][0]==0){
                array[i][0]=1;
            }else {
                break;
            }
        }
        for (int i = 0; i <col ; i++) {
            if (obstacleGrid[0][i]==0){
                array[0][i]=1;
            }else {
                break;
            }
        }
        for (int i = 1; i <row ; i++) {
            for (int j = 1; j <col; j++) {
                if (obstacleGrid[i][j]==0){
                    array[i][j]=array[i-1][j]+array[i][j-1];
                }
            }
        }
        return array[row-1][col-1];
    }
}
