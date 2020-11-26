package day69;
/*
 *@Author:anran
 *@Date:2020/11/26
 *@Version 1.0
 *删除公共字符
 */

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.next();
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i <str1.length() ; i++) {
                boolean flag=false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i)==str2.charAt(j)){
                        flag=true;
                    }
                }
                if (flag==true){
                    continue;
                }else {
                    sb.append(str1.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
