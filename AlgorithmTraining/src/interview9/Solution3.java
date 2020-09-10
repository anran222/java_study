package interview9;
/*
 *@Author:anran
 *@Date:2020/9/10
 *@Version 1.0
 * 合并两个有序数组
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int m=4;
        int[] array1={1,3,5,7};
        int[] array2={8,6,4,2};
        System.out.println(Arrays.toString(arrayMerge(array1,4,array2,4)));
    }
    public static int[] arrayMerge (int[] array1, int n, int[] array2, int m) {
        if (n==0){
            return array2;
        }
        if (m==0){
            return array1;
        }
        int i=0;
        int j=m-1;
        int[] arr=new int[n+m];
        int k=0;
        while (i<n&&j>=0){
            if (array1[i]<array2[j]){
                arr[k]=array1[i];
                k++;
                i++;
            }else {
                arr[k]=array2[j];
                k++;
                j--;
            }
        }
        while (i<n){
            arr[k]=array1[i];
            i++;
            k++;
        }
        while (j>=0){
            arr[k]=array2[j];
            k++;
            j--;
        }
        return arr;
    }
}
