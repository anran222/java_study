package test;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/10 21:18
 * 选择排序
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,9,1,4};
        selsctSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selsctSort(int[] array){
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
