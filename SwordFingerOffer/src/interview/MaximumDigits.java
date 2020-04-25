package interview;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/25 22:42
 * 打印从1到最大的n位数
 */
public class MaximumDigits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(1)));
    }

    public static int[] printNumbers(int n) {
        int num=1;
        while (n>0){
            num*=10;
            n--;
        }
        int[] arr=new int[num-1];
        for (int i = 1; i <num ; i++) {
            arr[i-1]=i;
        }
        return arr;
    }
}
