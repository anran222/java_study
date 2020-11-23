package day67;
/*
 *@Author:anran
 *@Date:2020/11/23
 *@Version 1.0
 * 汽水瓶
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n==0){
                break;
            }
            System.out.println(result(n));
        }
    }
    public static int result(int num){
        int count=0;
        while (num>=3){
            count+=num/3;
            int flag=num%3;
            num/=3;
            num+=flag;
        }
        if (num==2){
            count++;
        }
        return count;
    }
}
