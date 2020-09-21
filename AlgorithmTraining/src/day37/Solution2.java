package day37;
/*
 *@Author:anran
 *@Date:2020/9/20
 *@Version 1.0
 * 朋友圈
 */

public class Solution2 {

    static int[][] array={{0,1},{1,0},{0,-1},{-1,0}};

    public static int findCircleNum(int[][] M) {
        int row=M.length;
        if (row==0){
            return 0;
        }
        int col=M[0].length;
        boolean[][] visit=new boolean[row][col];
        int count=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (M[i][j]==1&&!visit[i][j]){
                    count++;
                    DFS(M,visit,row,col,i,j);
                }
            }
        }
        return count;
    }

    public static void DFS(int[][] M,boolean[][] visit,int row,int col,int x,int y){
        visit[x][y]=true;
        for (int k = 0; k <4 ; k++) {
            int newX=x+array[k][0];
            int newY=y+array[k][1];
            if (newX>=row||newX<0||newY>=col||newY<0){
                continue;
            }
            if (M[newX][newY]==1&&visit[newX][newY]==false){
                DFS(M,visit,row,col,newX,newY);
            }
        }
    }

    public static void main(String[] args) {
        int[][] m={{1,0,0,1},
                   {0,1,1,0},
                   {0,1,1,1},
                   {1,0,1,1}};
        System.out.println(findCircleNum(m));
    }
}
