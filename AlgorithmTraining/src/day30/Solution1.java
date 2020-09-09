package day30;
/*
 *@Author:anran
 *@Date:2020/9/9
 *@Version 1.0
 * 超长整数相加
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str= sc.next();
            String str1=sc.next();
            BigInteger m=new BigInteger(str);
            BigInteger n=new BigInteger(str1);
            System.out.println(m.add(n));
        }
    }
}
