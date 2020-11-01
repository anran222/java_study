package day59;
/*
 *@Author:anran
 *@Date:2020/11/1
 *@Version 1.0
 * URl化
 */

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            int length=sc.nextInt();
            System.out.println(replaceSpaces(str,length));
        }
    }

    public static String replaceSpaces(String S, int length) {
        char[] chars=S.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <length ; i++) {
            if (chars[i]==' '){
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return new String(sb);
    }
}
