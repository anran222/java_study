package day32;
/*
 *@Author:anran
 *@Date:2020/9/13
 *@Version 1.0
 * 百万富翁问题
 */

public class Solution3 {
    public static void main(String[] args) {
        long result=10*30;
        System.out.println(result);
        int result2=0;
        for (int i = 0; i <30 ; i++) {
            result2+=(long)Math.pow(2,i);
        }
        System.out.println(result2);
    }
}
