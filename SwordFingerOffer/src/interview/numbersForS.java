package interview;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/4/29 22:28
 * 和为S的两个数字
 */
public class numbersForS {
    public static void main(String[] args) {
        int[] nums={10,26,30,31,47,60};
        System.out.println(Arrays.toString(twoSum(nums,40)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int size=nums.length-1;
        int left=0;
        int right=size;
        while (left<nums.length){
            if (nums[left]+nums[right]<target){
                left++;
            }else if (nums[left]+nums[right]>target){
                right--;
            }else {
                arr[0]=nums[left];
                arr[1]=nums[right];
                break;
            }
        }
        return arr;
    }
}
