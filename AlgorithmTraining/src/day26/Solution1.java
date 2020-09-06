package day26;
/*
 *@Author:anran
 *@Date:2020/9/6
 *@Version 1.0
 * 末尾0的个数
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(count(n));
        }
    }
    public static int count(int n){
        if (n<5){
            return 0;
        }
        int num=0;
        for (int i = 1; i <=n ; i++) {
            int index=i;
            while (index%5==0){
                num++;
                index/=5;
            }
        }
        return num;
    }
}
