package day70;
/*
 *@Author:anran
 *@Date:2020/11/27
 *@Version 1.0
 * 数组中出现次数超过数组长度一半的数
 * 摩尔投票法
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int count=0;
            String flag=s[0];
            for (int i = 1; i <s.length ; i++) {
                if (!flag.equals(s[i])){
                    count--;
                    if (count<0){
                        flag=s[i];
                        count=0;
                    }
                }else {
                    count++;
                }
            }
            System.out.println(flag);
        }
    }
}
