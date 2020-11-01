package day59;
/*
 *@Author:anran
 *@Date:2020/11/1
 *@Version 1.0
 * 按摩师以及打家劫舍问题
 */

public class Solution1 {
    public static void main(String[] args) {
        int[] nums={2,1,4,5,3,1,1,3};
        System.out.println(massage(nums));
    }

    public static int massage(int[] nums) {
        int len=nums.length;
        if (len==0){
            return 0;
        }
        if (len==1){
            return nums[0];
        }
        int[] dp=new int[len];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        for (int i = 2; i <len ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[len-1];
    }
}
