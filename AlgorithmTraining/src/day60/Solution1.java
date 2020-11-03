package day60;
/*
 *@Author:anran
 *@Date:2020/11/3
 *@Version 1.0
 * 回文排列
 */

import java.util.HashSet;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            System.out.println(canPermutePalindrome(s));
        }
    }

    public static boolean canPermutePalindrome(String s) {
        if (s==null||s.length()==1){
            return true;
        }
        char[] chars=s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i <chars.length ; i++) {
            if (set.contains(chars[i])){
                set.remove(chars[i]);
            }else {
                set.add(chars[i]);
            }
        }
        if (set.size()<=1){
            return true;
        }else {
            return false;
        }
    }
}
