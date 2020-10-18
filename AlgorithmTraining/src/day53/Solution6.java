package day53;
/*
 *@Author:anran
 *@Date:2020/10/18
 *@Version 1.0
 * 爬楼梯
 */

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            System.out.println(climbStairs(sc.nextInt()));
        }
    }
    public static int climbStairs(int n) {
        if (n<3){
            return n;
        }
        int a1=1;
        int a2=2;
        int num=0;
        while (n>=3){
            num=a1+a2;
            a1=a2;
            a2=num;
            n--;
        }
        return num;
    }
}
