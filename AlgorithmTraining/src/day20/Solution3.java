package day20;
/*
 *@Author:anran
 *@Date:2020/8/28
 *@Version 1.0
 * 排序
 */

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        InsertSort(array);
        System.out.println(Arrays.toString(array));
        int[] array1={9,5,2,7,3,6,8};
        shellSort(array1);
        System.out.println(Arrays.toString(array1));
        int[] array2={9,5,2,7,3,6,8};
        selectSort(array2);
        System.out.println(Arrays.toString(array2));
        int[] array3={9,5,2,7,3,6,8};
        bubbleSort(array3);
        System.out.println(Arrays.toString(array3));
        int[] array4={9,5,2,7,3,6,8};
        quickSort(array4);
        System.out.println(Arrays.toString(array4));
        int[] array5={9,5,2,7,3,6,8};
        mergeSort(array5);
        System.out.println(Arrays.toString(array5));
    }

    private static void InsertSort(int[] array) {
        for (int i = 1; i <array.length ; i++) {
            int v=array[i];
            int cur=i-1;
            for (; cur >=0 ; cur--) {
                if (array[cur]>v){
                    array[cur+1]=array[cur];
                }else {
                    break;
                }
            }
            array[cur+1]=v;
        }
    }

    private static void shellSort(int[] array) {
        int gap=array.length/2;
        while (gap>1){
            shellSortHelper(array,gap);
            gap=gap/2;
        }
        shellSortHelper(array,gap);
    }
    private static void shellSortHelper(int[] array,int gap){
        for (int i = gap; i <array.length ; i++) {
            int v=array[i];
            int cur=i-gap;
            for (; cur >=0 ; cur-=gap) {
                if (array[cur]>v){
                    array[cur+gap]=array[cur];
                }else {
                    break;
                }
            }
            array[cur+gap]=v;
        }
    }

    private static void selectSort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[j]<array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if (array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }

    private static void quickSort(int[] array) {
        quickSortHelper(array,0,array.length-1);
    }
    private static void quickSortHelper(int[] array,int low,int high){
        if (low>=high){
            return;
        }
        int index=partition(array,low,high);
        quickSortHelper(array,low,index-1);
        quickSortHelper(array,index+1,high);
    }
    private static int partition(int[] array,int low,int high){
        int i=low;
        int j=high;
        int index=array[high];
        while (i<j){
            while (i<j&&array[i]<=index){
                i++;
            }
            while (i<j&&array[j]>=index){
                j--;
            }
            swap(array,i,j);
        }
        swap(array,i,high);
        return i;
    }
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    private static void mergeSort(int[] array) {
        mergeSortHelper(array,0,array.length);
    }
    public static void mergeSortHelper(int[] array,int left,int right){
        if (right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        mergeSortHelper(array,left,mid);
        mergeSortHelper(array,mid,right);
        mergePartition(array,left,mid,right);
    }

    private static void mergePartition(int[] array, int left, int mid, int right) {
        int i=left;
        int j=mid;
        int[] index=new int[left+right];
        int k=0;
        while (i<mid&&j<right){
            if (array[i]<array[j]){
                index[k]=array[i];
                k++;
                i++;
            }else {
                index[k]=array[j];
                k++;
                j++;
            }
        }
        while (i<mid){
            index[k]=array[i];
            k++;
            i++;
        }
        while (j<right){
            index[k]=array[j];
            k++;
            j++;
        }
        for (int l = 0; l <right-left ; l++) {
            array[left+l]=index[l];
        }
    }
}
