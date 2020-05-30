package interview;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/5/30 22:47
 * 有多少小于当前数字的数字
 */
public class LessThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sum=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            int k=0;
            for (int j = 0; j <nums.length ; j++) {
                if (nums[j]<nums[i]){
                    k++;
                    sum[i]=k;
                }
            }
        }
        return sum;
    }
}
