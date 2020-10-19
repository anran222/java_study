package day54;
/*
 *@Author:anran
 *@Date:2020/10/19
 *@Version 1.0
 * 左旋转字符串
 */

public class Solution5 {
    public static void main(String[] args) {
        String s="lrloseumgh";
        int n=6;
        System.out.println(reverseLeftWords(s,n));
    }
    public static String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        char[] chars1=new char[chars.length];
        while (n>0) {
            char ch = chars[0];
            for (int i = 1; i < chars.length; i++) {
                chars1[i-1] = chars[i];
            }
            chars1[chars1.length-1] = ch;
            chars=chars1;
            n--;
        }
        return new String(chars);
    }
}
