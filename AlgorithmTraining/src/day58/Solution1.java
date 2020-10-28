package day58;
/*
 *@Author:anran
 *@Date:2020/10/28
 *@Version 1.0
 * 不用加号的加法
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(add(a,b));
        }
    }
    public static int add(int a, int b) {
        while (b!=0){
            int temp=a^b;
            int d=(a&b)<<1;
            a=temp;
            b=d;
        }
        return a;
    }
}
