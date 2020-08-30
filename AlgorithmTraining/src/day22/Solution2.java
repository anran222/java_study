package day22;
/*
 *@Author:anran
 *@Date:2020/8/30
 *@Version 1.0
 * 删除公共字符
 *输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            System.out.println(remove(str1,str2));
    }
    public static String remove(String str1,String str2){
        char[] chars= str1.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <chars.length ; i++) {
            if (str2.contains(String.valueOf(chars[i]))){
                continue;
            }else {
                sb.append(chars[i]);
            }
        }
        return new String(sb);
    }
}
