package search;
/*
 *@Author:anran
 *@Date:2020/8/31
 *@Version 1.0
 * 图像渲染
 * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
 * 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。
 * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，
 * 接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，
 * 重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
 * 最后返回经过上色渲染后的图像。
 */

public class Solution2 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor=image[sr][sc];
        int row=image.length;
        int col=image[0].length;
        int[][] visit=new int[row][col];
        DFS(image,visit,row,col,sr,sc,oldColor,newColor);
        return image;
    }

    //四个方向
    int[][] fang={{0,1},{1,0},{0,-1},{-1,0}};

    public void DFS(int[][] img,int[][] visit,int row,int col,int newX,int newY,int oldColor,int newColor){
        //给新位置染色
        img[newX][newY]=newColor;
        visit[newX][newY]=1;
        //遍历每一种可能，四个方向
        for (int i = 0; i <4 ; i++) {
            int newRow=newX+fang[i][0];
            int newCol=newY+fang[0][i];
            //判断是否越界
            if (newRow>=row||newRow<0||newCol>=col||newCol<0){
                continue;
            }
            //符合要求，继续渲染，并且之前也没有被渲染过
            if (img[newRow][newCol]==oldColor&&visit[newRow][newCol]==0){
                DFS(img,visit,row,col,newRow,newCol,oldColor,newColor);
            }
        }
    }
}
