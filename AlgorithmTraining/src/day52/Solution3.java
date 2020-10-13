package day52;
/*
 *@Author:anran
 *@Date:2020/10/13
 *@Version 1.0
 * 在排序数组中查找数字
 */

public class Solution3 {
    public int search(int[] nums, int target) {
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==target){
                count++;
            }
        }
        return count;
    }
}
