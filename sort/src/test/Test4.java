package test;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/10 21:23
 * 堆排序
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,9,1,4};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] array){
        createHeap(array);
        for (int i = 0; i <array.length-1 ; i++) {
            int heapSize=array.length-i;
            swap(array,0,heapSize-1);
            heapSize--;
            shiftDown(array,heapSize,0);
        }
    }

    private static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >=0 ; i--) {
            shiftDown(array,array.length,i);
        }
    }

    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    private static void shiftDown(int[] array, int heapLength, int index) {
        int parent=index;
        int chird=parent*2+1;
        while (chird<heapLength){
            if (chird+1<heapLength&&array[chird+1]>array[chird]){
                chird=chird+1;
            }
            if (array[chird]>array[parent]){
                swap(array,chird,parent);
            }else {
                break;
            }
            parent=chird;
            chird=parent*2+1;
        }
    }
}
