package day12;

import java.util.Arrays;

/**
 * @Author:xiang
 * 插入排序
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] array={9,5,2,7,3,6,8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] array){
        for (int i = 1; i <array.length; i++) {
            int v=array[i];
            int cur=i-1;
            for (; cur >=0 ; cur--) {
                if (array[cur]>v){
                    array[cur+1]=array[cur];
                }else {
                    break;
                }
            }
            array[cur+1]=v;
        }
    }
}
