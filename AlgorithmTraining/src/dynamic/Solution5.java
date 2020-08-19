package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/19
 *@Version 1.0
 * 连续子数组的最大和
 */

public class Solution5 {
    public int maxSubArray(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int sum=nums[0];
        int max=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            sum=Math.max(sum+nums[i],nums[i]);
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
