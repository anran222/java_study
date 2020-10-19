package day54;
/*
 *@Author:anran
 *@Date:2020/10/19
 *@Version 1.0
 * 反转单词顺序
 */

public class Solution3 {
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = str.length-1; i >=0 ; i--) {
            if (!str[i].equals("")){
                sb.append(str[i]);
                sb.append(" ");
            }
        }
        return new String(sb).trim();
    }
}
