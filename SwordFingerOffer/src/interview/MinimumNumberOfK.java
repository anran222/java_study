package interview;

import java.util.Arrays;
import java.util.Queue;

/**
 * @Author:xiang
 * @Date:2020/4/29 23:11
 * 最小的k个数
 */
public class MinimumNumberOfK {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        System.out.println(Arrays.toString(getLeastNumbers(arr,2)));
    }

    public static int[] getLeastNumbers(int[] arr,int k) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int[] newArr=new int[k];
        for (int i = 0; i <k ; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
}
