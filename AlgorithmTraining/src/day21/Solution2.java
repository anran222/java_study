package day21;
/*
 *@Author:anran
 *@Date:2020/8/29
 *@Version 1.0
 * 数组中的逆序对
 * 有一组数，对于其中任意两个数组，若前面一个大于后面一个数字，则这两个数字组成一个逆序对。请设计
 * 一个高效的算法，计算给定数组中的逆序对个数
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(sum(array,n));
    }

    public static int sum(int[] array,int n){
        int count=0;
        for (int i = n-1; i >0 ; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if (array[j]>array[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
