package test;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/10 20:42
 * 插入排序
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,9,1,4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] array){
        for (int bound = 1; bound <array.length; bound++) {
            int v=array[bound];
            int cur=bound-1;
            for (;cur>=0;cur--) {
                if (array[cur]>v){
                    array[cur+1]=array[cur];
                }else{
                    break;
                }
            }
            array[cur+1]=v;
        }
    }
}
