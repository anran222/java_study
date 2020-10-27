package day57;
/*
 *@Author:anran
 *@Date:2020/10/27
 *@Version 1.0
 * 跳水板
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int shorter=sc.nextInt();
            int longer=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(Arrays.toString(divingBoard(shorter,longer,k)));
        }
    }

    public static int[] divingBoard(int shorter, int longer, int k) {
        int[] array1=new int[k];
        if (k==0){
            return array1;
        }
        if (shorter==longer){
            return new int[]{shorter*k};
        }
        int[] array=new int[k+1];
        int c=0;
        for (int i = 0; i <=k ; i++) {
            int num1=k-i;
            int num2=i;
            array[c++]=num1*shorter+num2*longer;
        }
        return array;
    }
}
