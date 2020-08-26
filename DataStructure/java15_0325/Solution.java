package java15_0325;
/*
 *@Author:anran
 *@Date:2020/8/25
 *@Version 1.0
 * 杨辉三角
 * 特点：
 * 1、第一行固定，就是一个1
 * 2、第二行也固定，就是两个1
 * 3、第i行，首尾固定都是1
 * 4、第i行有i个元素
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(generate(n));
        }
    }
//
//    private static ArrayList<ArrayList<Integer>> yanghui(int numRows) {
//        if (numRows<=0){
//            return new ArrayList<>();
//        }
//        int[][] array=new int[numRows][numRows];
//        for (int i = 0; i <numRows ; i++) {
//            array[i][0]=1;
//        }
//        for (int i = 0; i <numRows ; i++) {
//            for (int j = 0; j <numRows ; j++) {
//                if (i==j){
//                    array[i][j]=1;
//                }
//            }
//        }
//        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//        ArrayList<Integer> list=new ArrayList<>();
//        if (numRows==1){
//            list.add(array[0][0]);
//            result.add(list);
//            return result;
//        }
//        if (numRows==2){
//            list.add(array[1][0]);
//            list.add(array[1][1]);
//            result.add(list);
//            return result;
//        }
//        for (int i = 2; i <numRows ; i++) {
//            list.add(array[i][0]);
//            int j=1;
//            for (; j <i-1 ; j++) {
//                array[i][j]=array[i-1][j]+array[i-1][j-1];
//                list.add(array[i][j]);
//            }
//            list.add(array[i][j]);
//            result.add(list);
//        }
//        return result;
//    }

    public static List<List<Integer>> generate(int numRows){
        if (numRows<=0){
            return new ArrayList<>();
        }
        List<List<Integer>> result=new ArrayList<>();
        //先准备第一行就只有一个元素
        List<Integer> firstline=new ArrayList<>();
        firstline.add(1);
        result.add(firstline);
        if (numRows==1){
            return result;
        }
        //第二行只有两个元素
        List<Integer> secondLine=new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows==2){
            return result;
        }
        //第i行
        for (int row = 3; row <=numRows ; row++) {
            //如果想知道第row行的情况，就得先知道row-1行的内容
            //第一次row-1是为了得到第row-1行，第二次是为了得到row-1的下标
            List<Integer> prevLine=result.get(row-1-1);
            List<Integer> curLine=new ArrayList<>();
            curLine.add(1);
            for (int col = 2; col <row ; col++) {
                int curNum=prevLine.get(col-1-1)+prevLine.get(col-1);
                curLine.add(curNum);
            }
            //最后处理该行的最后一个1
            curLine.add(1);
            result.add(curLine);
        }
        return result;
     }
 }
