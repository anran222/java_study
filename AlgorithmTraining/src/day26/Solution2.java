package day26;
/*
 *@Author:anran
 *@Date:2020/9/6
 *@Version 1.0
 * 数字颠倒
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(re(n));
        }
    }
    public static String re(int n){
        String str=String.valueOf(n);
        char[] array=str.toCharArray();
        int len=array.length-1;
        StringBuilder sb=new StringBuilder();
        for (int i = len; i >=0 ; i--) {
            sb.append(array[i]);
        }
        return new String(sb);
    }
}
