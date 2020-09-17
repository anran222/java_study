package day36;
/*
 *@Author:anran
 *@Date:2020/9/17
 *@Version 1.0
 * 小易的升级之路
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int num=sc.nextInt();
            int[] array=new int[m];
            for (int i = 0; i <m ; i++) {
                array[i]=sc.nextInt();
            }
            for (int i = 0; i <m ; i++) {
                if (array[i]<=num){
                    num+=array[i];
                }else {
                    num+=gongyue(num,array[i]);
                }
            }
            System.out.println(num);
        }
    }
    public static int gongyue(int m,int n){
        if (n>m){
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
