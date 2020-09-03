package search;
/*
 *@Author:anran
 *@Date:2020/9/3
 *@Version 1.0
 * 岛屿数量
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 */

public class Solution4 {
    public int numIslands(char[][] grid) {
        if (grid.length==0){
            return 0;
        }
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        boolean[][] visit=new boolean[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (grid[i][j]=='1'&&!visit[i][j]){
                    count++;
                    DFS(grid,visit,row,col,i,j);
                }
            }
        }
        return count;
    }

    int[][] array={{1,0},{0,1},{-1,0},{0,-1}};

    public void DFS(char[][] grid,boolean[][] visit,int row,int col,int x,int y){
        visit[x][y]=true;
        for (int i = 0; i <4 ; i++) {
            int newX=x+array[i][0];
            int newY=y+array[i][1];
            if (newX>=row||newX<0||newY>=col||newY<0){
                continue;
            }
            if (grid[newX][newY]=='1'&&!visit[newX][newY]){
                DFS(grid,visit,row,col,newX,newY);
            }
        }
    }
}
