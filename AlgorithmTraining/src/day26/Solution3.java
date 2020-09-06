package day26;
/*
 *@Author:anran
 *@Date:2020/9/6
 *@Version 1.0
 * 最小步数成为斐波那契数
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。
 * 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(bushu(n));
        }
    }
    public static int bushu(int n){
        int a=0;
        int b=1;
        int c=1;
        while (c<n){
            a=b;
            b=c;
            c=a+b;
        }
        if((n-b)>(c-n)){
            return c-n;
        }else {
            return n-b;
        }
    }
}
