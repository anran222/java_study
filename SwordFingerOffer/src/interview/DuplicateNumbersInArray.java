package interview;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/5/8 23:06
 * 数组中重复的数字
 */
public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        int[] nums={3, 1, 2, 3};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]){
                res=nums[i];
                break;
            }
        }
        return res;
    }
}
