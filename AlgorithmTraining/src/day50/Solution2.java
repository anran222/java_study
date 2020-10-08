package day50;
/*
 *@Author:anran
 *@Date:2020/10/8
 *@Version 1.0
 * 数组中数字出现的次数2   排序
 */

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums={9,1,7,9,7,9,7};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <nums.length-1 ; i++) {
            if (nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        if (nums[0]!=nums[1]){
            return nums[0];
        }
        return nums[nums.length-1];
    }
}
