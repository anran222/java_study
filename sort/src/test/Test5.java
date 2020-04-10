package test;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/10 21:40
 * 冒泡排序
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,9,1,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-1-i ; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
