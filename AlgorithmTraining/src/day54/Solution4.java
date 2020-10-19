package day54;
/*
 *@Author:anran
 *@Date:2020/10/19
 *@Version 1.0
 * 右旋转字符串
 */

public class Solution4 {
    public static void main(String[] args) {
        String s="abcdefg";
        int n=2;
        System.out.println(reverserightWords(s,n));
    }

    public static String reverserightWords(String s, int n) {
        String str="";
        char[] chars = s.toCharArray();
        while (n>0) {
            char ch = chars[chars.length - 1];
            char[] chars1 = new char[chars.length];
            chars1[0] = ch;
            for (int i = 0; i < chars.length - 1; i++) {
                chars1[i + 1] = chars[i];
            }
            chars=chars1;
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i <chars.length ; i++) {
                sb.append(chars[i]);
            }
            str=new String(sb);
            n--;
        }
        return str;
    }
}
