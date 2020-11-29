package day71;
/*
 *@Author:anran
 *@Date:2020/11/29
 *@Version 1.0
 * 不要二
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int w=sc.nextInt();
            int h=sc.nextInt();
            int count=0;
            if (w%4==0||h%4==0){
                count=w*h/2;
            }else if (w%2==0&&h%2==0){
                count=w*h/2+2;
            }else {
                count=w*h/2+1;
            }
            System.out.println(count);
        }
    }
}
