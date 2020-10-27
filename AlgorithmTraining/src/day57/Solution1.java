package day57;
/*
 *@Author:anran
 *@Date:2020/10/27
 *@Version 1.0
 * 最大数值
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(maximum(a,b));
        }
    }
    public static int maximum(int a, int b) {
        return Math.max(a,b);
    }
}
