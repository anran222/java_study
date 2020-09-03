package search;
/*
 *@Author:anran
 *@Date:2020/9/3
 *@Version 1.0
 * 被围绕的岛屿
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 */

public class Solution3 {
    public void solve(char[][] board) {
        if (board.length==1){
            return;
        }
        int row=board.length;
        int col=board[0].length;
        for (int i = 0; i <col ; i++) {
            if (board[0][i]=='O'){
                DFS(board,row,col,0,i);
            }
            if (board[row-1][i]=='O'){
                DFS(board,row,col,row-1,i);
            }
        }
        for (int i = 0; i <row ; i++) {
            if (board[i][0]=='O'){
                DFS(board,row,col,i,0);
            }
            if (board[i][col-1]=='O'){
                DFS(board,row,col,i,col-1);
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (board[i][j]=='O'){
                    board[i][j]='X';
                }
                if (board[i][j]=='a'){
                    board[i][j]='O';
                }
            }
        }
    }

    int[][] array={{1,0},{0,1},{-1,0},{0,-1}};

    public void DFS(char[][] board,int row,int col,int x,int y){
        board[x][y]='a';
        for (int i = 0; i <4 ; i++) {
            int newX=x+array[i][0];
            int newY=y+array[i][1];
            if (newX>=row||newX<0||newY>=col||newY<0){
                continue;
            }
            if (board[newX][newY]=='O'){
                DFS(board,row,col,newX,newY);
            }
        }
    }
}
