package test;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/9 14:48
 * 两数之和
 */
public class Test2 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=10;
        int[] array=twoSum(nums,target);
        System.out.println(Arrays.toString(array));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    array[0]=i;
                    array[1]=j;
                    return array;
                }
            }
        }
        return null;
    }
}
