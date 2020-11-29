package day71;
/*
 *@Author:anran
 *@Date:2020/11/29
 *@Version 1.0
 * 求最小公倍数
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int number=(m*n)/gongyue(m,n);
            System.out.println(number);
        }
    }

    public static int gongyue(int m,int n){
        if (m<n){
            int temp=m;
            m=n;
            n=temp;
        }
        while (n!=0){
            int num=m%n;
            m=n;
            n=num;
        }
        return m;
    }
}
