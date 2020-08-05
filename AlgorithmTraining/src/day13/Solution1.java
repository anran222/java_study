package day13;

import java.util.Arrays;

/**
 * @Author:xiang
 * 快速排序
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array){
        quickSortHelper(array,0,array.length-1);
    }

    public static void quickSortHelper(int[] array,int low,int high){
        if (low>=high){
            return;
        }
        int index=partition(array,low,high);
        quickSortHelper(array,low,index-1);
        quickSortHelper(array,index+1,high);
    }

    public static int partition(int[] array,int low,int high){
        int i=low;
        int j=high;
        int base=array[high];
        while (i<j){
            while (i<j&&array[i]<=base){
                i++;
            }
            while (i<j&&array[j]>=base){
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
}
