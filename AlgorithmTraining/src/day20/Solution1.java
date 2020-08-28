package day20;
/*
 *@Author:anran
 *@Date:2020/8/28
 *@Version 1.0
 * 统计回文
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            System.out.println(sum(str1,str2));
        }
    }

    public static int sum(String str1,String str2){
        int count=0;
        StringBuilder sb=new StringBuilder();
//        if (isHuiWen(sb.append(str1).append(str2))){
//            count++;
//        }
        StringBuilder sb1=new StringBuilder();
        if (isHuiWen(sb1.append(str2).append(str1))){
            count++;
        }
        for (int i = 0; i <str1.length() ; i++) {
            StringBuilder sb2=new StringBuilder(str1);
            sb2.insert(i,str2);
            if (isHuiWen(sb2)){
                count++;
            }
        }
        return count;
    }

    public static boolean isHuiWen(StringBuilder sb){
        int start=0;
        int end=sb.length()-1;
        while (start<end){
            if (sb.charAt(start)==sb.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
