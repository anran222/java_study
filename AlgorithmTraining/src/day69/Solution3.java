package day69;
/*
 *@Author:anran
 *@Date:2020/11/26
 *@Version 1.0
 * 买苹果
 */

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if (n%2!=0){
                System.out.println(-1);
            }else if ((n<=10)&&(n!=6)&&(n!=8)){
                System.out.println(-1);
            }else {
                if (n % 8 == 0) {
                    System.out.println(n / 8);
                } else {
                    System.out.println(n / 8 + 1);
                }
            }
        }
    }
}
