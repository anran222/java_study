package day66;
/*
 *@Author:anran
 *@Date:2020/11/22
 *@Version 1.0
 * 统计回文
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
//            System.out.println(huiwen(s1));
//            System.out.println(huiwen(s2));
            System.out.println(result(s1,s2));
        }
    }
    public static int result(String s1,String s2){
        int count=0;
        StringBuilder sb1=new StringBuilder();
        sb1.append(s2).append(s1);
        if (huiwen(new String(sb1))==true){
            count++;
        }
        StringBuilder sb2=new StringBuilder();
        sb2.append(s1).append(s2);
        if (huiwen(new String(sb2))==true){
            count++;
        }
        for (int i = 1; i <s1.length() ; i++) {
            StringBuilder sb3=new StringBuilder();
            int left=0;
            int right=i;
            while (left<right) {
                sb3.append(s1.charAt(left)) ;
                    left++;
            }
            sb3.append(s2);
            while (right<s1.length()){
                    sb3.append(s1.charAt(right));
                    right++;
            }
            if (huiwen(new String(sb3))==true){
                count++;
            }
        }
        return count;
    }
    public static boolean huiwen(String s){
        int i=0;
        int j=s.length()-1;
        boolean flag=true;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                flag=false;
            }
            i++;
            j--;
        }
        if (flag==true){
            return true;
        }else {
            return false;
        }
    }
}
