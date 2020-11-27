package day70;
/*
 *@Author:anran
 *@Date:2020/11/27
 *@Version 1.0
 * 移动0
 */

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int[] array={0,1,0,3,12};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while (j<nums.length){
            if (nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
            j++;
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
