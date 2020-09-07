package day27;
/*
 *@Author:anran
 *@Date:2020/9/7
 *@Version 1.0
 * 腐烂的橘子
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。

 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<Pair> queue=new LinkedList<>();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (grid[i][j]==2){
                    queue.offer(new Pair(i,j));
                }
            }
        }
        int count=0;
        int[][] array={{1,0},{0,1},{-1,0},{0,-1}};
        while (!queue.isEmpty()){
            int size=queue.size();
            int flag=1;
            while (size!=0){
                Pair cur=queue.poll();
                for (int i = 0; i <4 ; i++) {
                    int newX=cur.x+array[i][0];
                    int newY=cur.y+array[i][1];
                    if (newX>=row||newX<0||newY>=col||newY<0||grid[newX][newY]!=1){
                        continue;
                    }
                    flag=0;
                    grid[newX][newY]=2;
                    queue.offer(new Pair(newX,newY));
                }
                size--;
            }
            if(flag==0){
                count++;
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (grid[i][j]==1){
                    return -1;
                }
            }
        }
        return count;
    }
}
