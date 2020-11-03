package day60;
/*
 *@Author:anran
 *@Date:2020/11/3
 *@Version 1.0
 * 字符串压缩
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            System.out.println(compressString(s));
        }
    }

    public static String compressString(String S) {
        if (S==null||S.length()<=2){
            return S;
        }
        char[] chars=S.toCharArray();
        StringBuilder sb=new StringBuilder();
        int count=1;
        sb.append(chars[0]);
        for (int i = 1; i <chars.length ; i++) {
            if (chars[i]==chars[i-1]){
                count++;
            }else {
                sb.append(count).append(chars[i]);
                count=1;
            }
        }
        sb.append(count);
        if (sb.length()<S.length()) {
            return new String(sb);
        }else {
            return S;
        }
    }
}
