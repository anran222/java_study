package day54;
/*
 *@Author:anran
 *@Date:2020/10/19
 *@Version 1.0
 * 和为s的两个数字
 */

public class Solution1 {
    public static void main(String[] args) {
        int[] nums ={10,26,30,31,47,60};
        int target=40;
        for (int i = 0; i <twoSum(nums,target).length ; i++) {
            System.out.println(twoSum(nums,target)[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array=new int[2];
        int left=0;
        int right=nums.length-1;
        while (left<right){
            if (nums[left]+nums[right]>target){
                right--;
            }else if (nums[left]+nums[right]<target){
                left++;
            }else {
                array[0]=nums[left];
                array[1]=nums[right];
                break;
            }
        }
        return array;
    }
}
