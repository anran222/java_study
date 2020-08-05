package day13;

import java.util.Arrays;

/**
 * @Author:xiang
 * 归并排序
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array){
        mergeSortHelper(array,0,array.length);
    }

    public static void mergeSortHelper(int[] array,int low,int high){
        if (high-low<=1){
            return;
        }
        int mid=(low+high)/2;
        mergeSortHelper(array,low,mid);
        mergeSortHelper(array,mid,high);
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int i=low;
        int j=mid;
        int[] index=new int[high-low];
        int k=0;
        while (i<mid&&j<high){
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
        while (j<high){
            index[k]=array[j];
            k++;
            j++;
        }
        for (int l = 0; l <(high-low) ; l++) {
            array[low+l]=index[l];
        }
    }
}
