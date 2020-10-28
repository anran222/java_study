package day58;
/*
 *@Author:anran
 *@Date:2020/10/28
 *@Version 1.0
 * 消失的数字
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 */

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        List<Integer> list=new LinkedList<>();
        int len=nums.length;
        for (int i = 0; i <nums.length ; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i <len ; i++) {
            if (!list.contains(i)){
                return i;
            }
        }
        return nums.length;
    }
}
