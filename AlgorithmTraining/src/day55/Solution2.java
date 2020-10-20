package day55;
/*
 *@Author:anran
 *@Date:2020/10/20
 *@Version 1.0
 * 扑克牌中的顺子
 */

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums={0,0,1,2,5};
        System.out.println(isStraight(nums));
    }
    public static boolean isStraight(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int min=14;
        int max=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==0){
                continue;
            }
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            if (set.contains(nums[i])){
                return false;
            }
            set.add(nums[i]);
        }
        return max-min<5;
    }
}
