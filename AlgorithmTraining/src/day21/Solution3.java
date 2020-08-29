package day21;
/*
 *@Author:anran
 *@Date:2020/8/29
 *@Version 1.0
 * 字符串中找出最长的字符串
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            System.out.println(TheMost(str));
        }
    }
    public static String TheMost(String str) {
        int max = 0;
        int end = 0;
        int count=0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                count++;
                if (count > max) {
                    max = count;
                    end = j;
                }
            }else {
                count=0;
            }
        }
        return str.substring(end-max+1,end+1);
    }
}
