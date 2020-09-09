package day30;
/*
 *@Author:anran
 *@Date:2020/9/9
 *@Version 1.0
 *组个最小数
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array=new int[10];
        for (int i = 0; i <10 ; i++) {
            array[i]=sc.nextInt();
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <10 ; i++) {
            if (array[i]!=0){
                sb.append(i);
                array[i]--;
                break;
            }
        }
        for (int i = 0; i <10 ; i++) {
            while (array[i]>0){
                sb.append(i);
                array[i]--;
            }
        }
        System.out.println(sb);
    }
}
