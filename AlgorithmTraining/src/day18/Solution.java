package day18;

import java.util.Scanner;

/*
 *@Author:anran
 *@Date:2020/8/13
 *@Version 1.0
 * 变态青蛙跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶，他也可以跳上n级台阶
 * 求该青蛙跳上一个n级台阶总共有多少种方法
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }

    public static int count(int n){
        return (int)Math.pow(2,n-1);
    }
}
