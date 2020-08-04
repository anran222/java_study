package day12;

import java.util.Arrays;

/**
 * @Author:xiang
 * 选择排序
 */
public class Solution3 {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
