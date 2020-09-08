package interview8;
/*
 *@Author:anran
 *@Date:2020/9/8
 *@Version 1.0
 * 单词搜索
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] array={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        while (sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(panduan(array,str));
        }
    }
    public static boolean panduan(char[][] array,String str){
        char[] chars=str.toCharArray();
        char ch=chars[0];
        int flag=1;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                if (array[i][j]==ch){
                    flag=0;
                    sb.append(array[i][j]);
                    DFS(array,str,i,j,sb,0,chars);
                }
            }
        }
        if (flag==1) {
            return false;
        }else if (String.valueOf(sb)==str){
            return true;
        }else {
            return false;
        }
    }

    static int[][] index={{1,0},{0,1},{-1,0},{0,-1}};

    public static void DFS(char[][] array,String str,int i,int j,StringBuilder sb,int nu,char[] chars){
        if (String.valueOf(sb).equals(str)){
            return;
        }
        for (int k = 0; k <4 ; k++) {
            int newX=i+index[i][0];
            int newY=j+index[i][1];
            if (newX>=array.length||newX<0||newY>=array[0].length||newY<0){
                continue;
            }
            if (array[newX][newY]==chars[nu+1]){
                nu=nu+1;
                sb.append(array[newX][newY]);
                DFS(array,str,newX,newY,sb,nu,chars);
            }
        }
    }
}
