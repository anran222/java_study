package day12;

import java.util.Arrays;

/**
 * @Author:xiang
 * 冒泡排序
 */
public class Solution4 {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void BubbleSort(int[] array){
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
}
