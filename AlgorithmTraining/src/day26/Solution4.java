package day26;
/*
 *@Author:anran
 *@Date:2020/9/6
 *@Version 1.0
 * 机器人走方格
 *有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
 * 给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
 */

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(num(x,y));
        }
    }
    public static int num(int x,int y){
        int[][] array=new int[x][y];
        for (int i = 0; i <x ; i++) {
            array[i][0]=1;
        }
        for (int i = 0; i <y ; i++) {
            array[0][i]=1;
        }
        for (int i = 1; i <x ; i++) {
            for (int j = 1; j <y ; j++) {
                array[i][j]=array[i-1][j]+array[i][j-1];
            }
        }
        return array[x-1][y-1];
    }
}
