package test;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/9 14:22
 * 数字数组最后一位加一
 */
public class Test1 {
    public static void main(String[] args) {
        int[] array={1,2,3};
        int[] arr=plusOne(array);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
