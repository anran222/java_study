package day20;
/*
 *@Author:anran
 *@Date:2020/8/28
 *@Version 1.0
 * 寻找第k大
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] array=new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(findKth(array,n,k));
    }

    public static int findKth(int[] a,int n,int k){
        return findKthHelper(a,0,a.length-1,k);
    }

    private static int findKthHelper(int[] a, int low, int high, int k) {
        int part = patition(a, low, high);
        if(k == part - low + 1) {
            return a[part];
        } else if(k > part - low + 1) {
            return findKthHelper(a, part + 1, high, k - part + low -1);
        } else {
            return findKthHelper(a, low, part -1, k);
        }
    }

    private static int patition(int[] a, int left, int right) {
        int i=left;
        int j=right;
        int index=a[right];
        while (i<j){
            while (i<j&&a[i]>=index){
                i++;
            }
            while (i<j&&a[j]<=index){
                j--;
            }
            swap(a,i,j);
        }
        swap(a,i,right);
        return i;
    }

    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

}
