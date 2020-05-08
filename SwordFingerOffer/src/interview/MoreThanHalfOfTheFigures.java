package interview;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/5/8 23:20
 *  摩尔投票法求数组中出现次数超过一半的数字
 */
public class MoreThanHalfOfTheFigures {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count=0;
        int val=-1;
        for (int i = 0; i <nums.length-1 ; i++) {
            if (count==0){
                val=nums[i];
                count=1;
            }else if (nums[i]==val){
                count++;
            }else {
                count--;
            }
        }
        return val;
    }
}
