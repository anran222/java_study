package day73;
/*
 *@Author:anran
 *@Date:2020/12/3
 *@Version 1.0
 * 阶乘末尾0的个数
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int count=0;
            for (int i = n; i >=5 ; i--) {
                int num=i;
                while (num%5==0){
                    count++;
                    num/=5;
                }
            }
            System.out.println(count);
        }
    }
}
