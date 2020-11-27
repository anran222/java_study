package day70;
/*
 *@Author:anran
 *@Date:2020/11/27
 *@Version 1.0
 * 计算糖果
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int x3=sc.nextInt();
            int x4=sc.nextInt();
            int a=0;
            int b=0;
            int c=0;
            if ((x3-x1-x2)==x4){
                a=(x1+x3)/2;
                b=(x3-x1)/2;
                c=(x3-x1-2*x2)/2;
                System.out.println(a+" "+b+" "+c);
            }else {
                System.out.println("No");
            }
        }
    }
}
