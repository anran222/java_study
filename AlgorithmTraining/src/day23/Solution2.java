package day23;
/*
 *@Author:anran
 *@Date:2020/9/2
 *@Version 1.0
 * 图像渲染
 */

public class Solution2 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row=image.length;
        int col=image[0].length;
        int[][] visit=new int[row][col];
        int oldColor=image[sr][sc];
        DFS(image,visit,row,col,sr,sc,oldColor,newColor);
        return image;
    }

    int[][] array={{1,0},{0,1},{-1,0},{0,-1}};

    public void DFS(int[][] image,int[][] visit,int row,int col,int sr,int sc,int oldColor,int newColor){
        image[sr][sc]=newColor;
        visit[sr][sc]=1;
        for (int i = 0; i <4 ; i++) {
            int newX=sr+array[i][0];
            int newY=sc+array[i][1];
            if (newX>=row||newX<0||newY>=col||newY<0){
                continue;
            }
            if (image[newX][newY]==oldColor&&visit[newX][newY]==0){
                DFS(image,visit,row,col,newX,newY,oldColor,newColor);
            }
        }
    }
}
