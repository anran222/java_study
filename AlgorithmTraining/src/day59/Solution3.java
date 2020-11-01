package day59;
/*
 *@Author:anran
 *@Date:2020/11/1
 *@Version 1.0
 * 判断两个字符串是不是互为重排
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            System.out.println(CheckPermutation(s1,s2));
        }
    }

    public static boolean CheckPermutation(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if (len1!=len2){
            return false;
        }
        int[] array=new int[128];
        for (int i = 0; i <s1.length() ; i++) {
            array[s1.charAt(i)]++;
            array[s2.charAt(i)]--;
        }
        for (int i = 0; i <128 ; i++) {
            if (array[i]!=0){
                return false;
            }
        }
        return true;
    }
}
