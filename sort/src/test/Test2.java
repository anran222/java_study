package test;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/10 21:14
 * 希尔排序
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,9,1,4};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] array){
        int gap=array.length/2;
        while (gap>1){
            insertSort(array,gap);
            gap=gap/2;
        }
        insertSort(array,1);
    }

    public static void insertSort(int[] array,int gap){
        for (int bound = gap; bound <array.length; bound++) {
            int v=array[bound];
            int cur=bound-gap;
            for (;cur>=0;cur-=gap) {
                if (array[cur]>v){
                    array[cur+gap]=array[cur];
                }else{
                    break;
                }
            }
            array[cur+gap]=v;
        }
    }
}
