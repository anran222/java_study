package day73;
/*
 *@Author:anran
 *@Date:2020/12/3
 *@Version 1.0
 * 数字颠倒
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            StringBuilder sb=new StringBuilder(s);
            System.out.println(sb.reverse());
        }
    }
}
