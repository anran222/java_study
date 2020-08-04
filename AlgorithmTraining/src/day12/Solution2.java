package day12;

import java.util.Arrays;

/**
 * @Author:xiang
 * 希尔排序
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shellSort(int[] array){
        int gap=array.length/2;
        while (gap>1){
            insertSortHelper(array,gap);
            gap=gap/2;
        }
        insertSortHelper(array,gap);
    }

    public static void insertSortHelper(int[] array,int gap){
        for (int i = gap; i <array.length ; i++) {
            int v=array[i];
            int cur=i-gap;
            for (; cur>=0 ; cur-=gap) {
                if (array[cur]>v){
                    array[cur+gap]=array[cur];
                }else {
                    break;
                }
            }
            array[cur+gap]=v;
        }
    }
}
