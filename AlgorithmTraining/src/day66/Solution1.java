package day66;
/*
 *@Author:anran
 *@Date:2020/11/22
 *@Version 1.0
 * 反转数位
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            System.out.println(reverseBits(num));
        }
    }

    public static int reverseBits(int num) {
            String str=Integer.toBinaryString(num);
            if (num==-1){
                return 32;
            }
            String[] s=str.split("0");
            if (s.length < 1) {
                return s.length + 1;
            }
            int max=s[0].length();
            int res=max+1;
            for (int i = 1; i <s.length ; i++) {
                if (s[i - 1].length() + s[i].length() > max) {
                    max = s[i - 1].length() + s[i].length();
                    res = max + 1;
                }
            }
        return res;
    }
}
