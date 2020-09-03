package day24;
/*
 *@Author:anran
 *@Date:2020/9/3
 *@Version 1.0
 * 求最小公倍数
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            System.out.println(gongBei(m,n));
        }
    }

    public static int gongBei(int m,int n){
        return m*n/gongYue(m,n);
    }

    public static int gongYue(int m,int n){
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
