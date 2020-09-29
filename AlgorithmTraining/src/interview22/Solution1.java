package interview22;
/*
 *@Author:anran
 *@Date:2020/9/29
 *@Version 1.0
 * 解密字符串
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            result(str);
        }
    }
    public static void result(String str){
        if (str.length()==0){
            System.out.println("");
        }
        char[] chars=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]>='b'&&chars[i]<='z'){
                sb.append(String.valueOf((char)(chars[i]-1)).toUpperCase());
            }else if (chars[i]=='a'){
                sb.append('Z');
            }else if (chars[i]>='B'&&chars[i]<='Z'){
                sb.append(String.valueOf((char)(chars[i]-1)).toLowerCase());
            }else if (chars[i]=='A'){
                sb.append('z');
            }else if (chars[i]>='1'&&chars[i]<='9'){
                sb.append((char)(chars[i]-1));
            }else if (chars[i]=='0'){
                sb.append('9');
            }else {
                continue;
            }
        }
        System.out.println(sb);
    }
}
