package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/19
 *@Version 1.0
 * 判断子序列
 */

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            String t=sc.next();
            System.out.println(isSubsequence(s,t));
        }
    }

    public static boolean isSubsequence(String s, String t) {
        if (t.contains(s)){
            return true;
        }
        char[] chars=s.toCharArray();
        char[] chars1=t.toCharArray();
        int i=0;
        int j=0;
        while (i<chars.length&&j<chars1.length){
            if (chars[i]==chars1[j]){
                i++;
            }
            j++;
        }
        if (i==chars.length){
            return true;
        }
        return false;
    }
}
