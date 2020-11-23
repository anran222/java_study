package day67;
/*
 *@Author:anran
 *@Date:2020/11/23
 *@Version 1.0
 * 数组中值出现一次的数字
 */

public class Solution3 {
    public int singleNumber(int[] nums) {
        int n=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            n^=nums[i];
        }
        return n;
    }
}
