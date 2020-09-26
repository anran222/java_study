package day41;
/*
 *@Author:anran
 *@Date:2020/9/26
 *@Version 1.0
 * 连续子数组的最大和
 */

public class Solution1 {
    public static void main(String[] args) {
        int[] num={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length==0){
            return 0;
        }
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
