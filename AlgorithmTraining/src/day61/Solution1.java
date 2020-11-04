package day61;
/*
 *@Author:anran
 *@Date:2020/11/4
 *@Version 1.0
 * 字符串轮转
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            System.out.println(isFlipedString(s1,s2));
        }
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        String s=s1+s1;
        if (s.indexOf(s2)!=-1){
            return true;
        }else {
            return false;
        }
    }
}
