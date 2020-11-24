package day68;
/*
 *@Author:anran
 *@Date:2020/11/24
 *@Version 1.0
 * 字符串中找出最长的数字串
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            print(str);
        }
    }
    public static void print(String str){
        if (str==null){
            return;
        }
        int i=0;
        int max=0;
        int k=0;
        while (i<str.length()){
            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                int j=i;
                int count=0;
                while (j<str.length()){
                    if (str.charAt(j)>='0'&&str.charAt(j)<='9'){
                        count++;
                        j++;
                    }else {
                        break;
                    }
                }
                if (count>max){
                    max=count;
                    k=i;
                }
                i=j+1;
            }else {
                i++;
            }
        }
        System.out.println(str.substring(k,k+max));
    }
}
