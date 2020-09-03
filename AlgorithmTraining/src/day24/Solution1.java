package day24;
/*
 *@Author:anran
 *@Date:2020/9/3
 *@Version 1.0
 * n个数中出现次数大于等于n/2的数
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(num(str));
        }
    }
    public static Integer num(String str){
        String[] str1=str.split(" ");
        int len=str.length()/2;
        int[] array=new int[str1.length];
        for (int i = 0; i <str1.length ; i++) {
            array[i]=Integer.valueOf(str1[i]);
        }
        int num=array[0];
        int count=0;
        for (int i = 1; i <array.length ; i++) {
            if (num==array[i]){
                count++;
            }else if (count>0){
                count--;
            }else {
                num=array[i];
            }
        }
        return num;
    }
}
