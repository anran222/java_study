package day22;
/*
 *@Author:anran
 *@Date:2020/8/30
 *@Version 1.0
 * 买苹果
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 *  可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。
 * 如果不能购买恰好n个苹果，小易将不会购买。
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(num(n));
        }
    }
    public static int num(int n){
        if (n%2!=0||n==10||n<6){
            return -1;
        }
        int number=n/8;
        int number2=n%8;
        if (number2==0){
            return number;
        }
        return number+1;
    }
}
