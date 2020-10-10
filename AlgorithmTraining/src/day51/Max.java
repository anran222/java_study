package day51;
/*
 *@Author:anran
 *@Date:2020/10/10
 *@Version 1.0
 * 连续数组的最大和
 */

public class Max{
    public static void main(String[ ]args){
        int[] array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sum(array));
    }
    public static int sum(int[] nums){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            count=Math.max(count+nums[i],nums[i]);
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}