package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/24
 *@Version 1.0
 * 机器人路径
 * 一个机器人在m×n大小的地图的左上角（起点，下图中的标记“start"的位置）。
    机器人每次向下或向右移动。机器人要到达地图的右下角。（终点，下图中的标记“Finish"的位置）。
    可以有多少种不同的路径从起点走到终点？
 */

public class Solution8 {
    public int uniquePaths (int m, int n) {
        int[][] array=new int[m][n];
        for (int i = 0; i <m ; i++) {
            array[i][0]=1;
        }
        for (int i = 0; i <n ; i++) {
            array[0][i]=1;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                array[i][j]=array[i-1][j]+array[i][j-1];
            }
        }
        return array[m-1][n-1];
    }
}
