package day32;
/*
 *@Author:anran
 *@Date:2020/9/13
 *@Version 1.0
 * DNA序列
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            int n=sc.nextInt();
            strs(str,n);
        }
    }
    public static void strs(String str,int n){
        if (n>str.length()){
            return;
        }
        char[] chars=str.toCharArray();
        int max=0;
        int flag=0;
        for (int i = 0; i <chars.length-n ; i++) {
            int count=0;
            for (int j = i; j <i+n ; j++) {
                if (chars[j]=='G'||chars[j]=='C'){
                    count++;
                }
            }
            if (count>max){
                max=count;
                flag=i;
            }
        }
        System.out.println(str.substring(flag,flag+n));
    }
}
