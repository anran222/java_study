package day57;
/*
 *@Author:anran
 *@Date:2020/10/27
 *@Version 1.0
 * 连续序列
 */

public class Solution4 {
    public static void main(String[] args) {
        int[] array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
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
