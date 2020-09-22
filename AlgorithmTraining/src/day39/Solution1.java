package day39;
/*
 *@Author:anran
 *@Date:2020/9/22
 *@Version 1.0
 * 剪绳子
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(result(n));
        }
    }
    public static int result(int n){
        if (n<=1){
            return n;
        }
        if (n==2||n==3){
            return n-1;
        }
        int count=1;
        while (n>4){
            n=n-3;
            count=count*3;
        }
        return count*n;
    }
}
