package day14;

import java.util.Arrays;

/**
 * @Author:xiang
 * 排序
 */
public class Solution {
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

    public static void InsertSort(int[] array){
        for (int bound = 1; bound <array.length ; bound++) {
            int v=array[bound];
            int cur=bound-1;
            for (; cur>=0 ;cur--) {
                if (array[cur]>v){
                    array[cur+1]=array[cur];
                }else {
                    break;
                }
            }
            array[cur+1]=v;
        }
    }

    public static void shellSort(int[] array){
        int gap=array.length/2;
        while (gap>1){
            shellSortInsertHelper(array,gap);
            gap=gap/2;
        }
        shellSortInsertHelper(array,gap);
    }

    public static void shellSortInsertHelper(int[] array,int gap){
        for (int bound = gap; bound <array.length ; bound++) {
            int v=array[bound];
            int cur=bound-gap;
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

    public static void selectSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[j]<array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if (array[j-1]>array[j]){
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void quickSort(int[] array){
        quickSortHelper(array,0,array.length-1);
    }

    public static void quickSortHelper(int[] array,int left,int right){
        if (left>=right){
            return;
        }
        int index=partition(array,left,right);
        quickSortHelper(array,left,index-1);
        quickSortHelper(array,index+1,right);
    }

    public static int partition(int[] array,int left,int right){
        int i=left;
        int j=right;
        int cur=array[right];
        while (i<j){
            while (i<j&&array[i]<=cur){
                i++;
            }
            while (i<j&&array[j]>=cur){
                j--;
            }
            swap(array,i,j);
        }
        swap(array,i,right);
        return i;
    }

    public static void swap(int[] array,int left,int right){
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
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

    public static void merge(int[] array,int low,int mid,int high){
        int i=low;
        int j=mid;
        int[] index=new int[low+high];
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
        for (int l = 0; l <(high-low); l++) {
            array[low+l]=index[l];
        }
    }
}
