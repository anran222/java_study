package day35;
/*
 *@Author:anran
 *@Date:2020/9/16
 *@Version 1.0
 * 到底买不买
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            char[] chars1=str1.toCharArray();
            char[] chars2=str2.toCharArray();
            boolean[] b1=new boolean[chars1.length];
            boolean[] b2=new boolean[chars2.length];
            for (int i = 0; i <chars2.length ; i++) {
                for (int j = 0; j <chars1.length ; j++) {
                    if (chars1[j]==chars2[i]&&b1[j]==false){
                        b2[i]=true;
                        b1[j]=true;
                        break;
                    }
                }
            }
            int count=0;
            for (int i = 0; i <b2.length ; i++) {
                if (b2[i]==true){
                    count++;
                }
            }
            int count2=0;
            for (int i = 0; i <b1.length ; i++) {
                if (b1[i]==true){
                    count2++;
                }
            }
            if (count==b2.length){
                System.out.println("Yes"+" "+(b1.length-count2));
            }else {
                System.out.println("No"+""+(b2.length-count));
            }
        }
    }
}
