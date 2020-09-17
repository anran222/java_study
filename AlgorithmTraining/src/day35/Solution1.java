package day35;
/*
 *@Author:anran
 *@Date:2020/9/16
 *@Version 1.0
 * 统计每个月兔子的总数
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int month=sc.nextInt();
            System.out.println(count(month));
        }
    }
    public static int count(int month){
        if (month<=2){
            return 1;
        }
        return count(month-2)+count(month-1);
    }
}
