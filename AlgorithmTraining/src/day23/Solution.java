package day23;
/*
 *@Author:anran
 *@Date:2020/9/2
 *@Version 1.0
 * 排序
 */

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        insertSort(array);
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

    public static void insertSort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int bound = array[i];
            int cur = i-1;
            for (; cur >= 0; cur--) {
                if (array[cur] > bound) {
                    array[cur + 1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur+1]=bound;
        }
    }

    public static void shellSort(int[] array){
        int gap=array.length/2;
        while (gap>1){
            shellHelper(array,gap);
            gap=gap/2;
        }
        shellHelper(array,gap);
    }
    public static void shellHelper(int[] array,int gap){
        for (int i = gap; i <array.length ; i++) {
            int bound=array[i];
            int cur=i-gap;
            for (; cur >=0 ; cur-=gap) {
                if (array[cur]>bound){
                    array[cur+gap]=array[cur];
                }else {
                    break;
                }
            }
            array[cur+gap]=bound;
        }
    }

    public static void selectSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    swap(array,i,j);
                }
            }
        }
    }

    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if (array[j-1]>array[j]){
                    swap(array,j-1,j);
                }
            }
        }
    }

    public static void quickSort(int[] array){
        quickHelper(array,0,array.length-1);
    }
    public static void quickHelper(int[] array,int left,int right){
        if (left>=right){
            return;
        }
        int index=pattition(array,left,right);
        quickHelper(array,left,index-1);
        quickHelper(array,index+1,right);
    }
    public static int pattition(int[] array,int left,int right){
        int i=left;
        int j=right;
        int bound=array[right];
        while (i<j){
            while (i<j&&array[i]<=bound){
                i++;
            }
            while (i<j&&array[j]>=bound){
                j--;
            }
            swap(array,i,j);
        }
        swap(array,i,right);
        return i;
    }

    public static void mergeSort(int[] array){
        mergeSortHelper(array,0,array.length);
    }
    public static void mergeSortHelper(int[] array,int left,int right){
        if (right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        mergeSortHelper(array,left,mid);
        mergeSortHelper(array,mid,right);
        partition(array,left,mid,right);
    }
    public static void partition(int[] array,int left,int mid,int right){
        int i=left;
        int j=mid;
        int[] index=new int[left+right];
        int k=0;
        while (i<mid&&j<right){
            if (array[i]<=array[j]){
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
        for (int l = 0; l <(right-left) ; l++) {
            array[left+l]=index[l];
        }
    }
}
