package day47;
/*
 *@Author:anran
 *@Date:2020/10/5
 *@Version 1.0
 * 最长不含重复字符的子字符串
 */

import java.util.HashSet;

public class Solution4 {
    public static void main(String[] args) {
        String s1="abcabcbb";
        String s2="pwwkew";
        String s3="bbbbb";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars=s.toCharArray();
        int i=0;
        int j=0;
        int count=0;
        HashSet<Character> list=new HashSet<>();
        while (j<s.length()){
            while (list.contains(chars[j])){
                list.remove(chars[i]);
                i++;
            }
            list.add(chars[j]);
            j++;
            int max=j-i;
            if (max>count){
                count=max;
            }
        }
        return count;
    }
}
