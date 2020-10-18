package day53;
/*
 *@Author:anran
 *@Date:2020/10/18
 *@Version 1.0
 * 最大子序和
 */

public class Solution5 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            sum=Math.max(sum+nums[i],nums[i]);
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
