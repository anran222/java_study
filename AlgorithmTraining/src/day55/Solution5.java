package day55;
/*
 *@Author:anran
 *@Date:2020/10/20
 *@Version 1.0
 * 求1+2+…+n
 */

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(sumNums(n));
        }
    }

    public static int sumNums(int n) {
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum=result(sum,i);
        }
        return sum;
    }
    public static int result(int a,int b){
        while (b!=0){
            int temp=a^b;
            b=(a&b)<<1;
            a=temp;
        }
        return a;
    }
}
