package day33;
/*
 *@Author:anran
 *@Date:2020/9/14
 *@Version 1.0
 * 十转十六进制
 */

import java.util.Scanner;

public class Solution5 {

    static char[] array={'A','B','C','D','E','F'};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            if (num<=9){
                System.out.println(num);
            }else {
                while (num>0){
                    int count=num%16;
                    if (count<=9){
                        sb.append(count);
                    }else {
                        sb.append(array[count%10]);
                    }
                    num/=16;
                }
            }
            System.out.println(sb.reverse());
        }
    }
}
