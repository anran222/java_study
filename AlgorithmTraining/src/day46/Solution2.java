package day46;
/*
 *@Author:anran
 *@Date:2020/10/4
 *@Version 1.0
 * 数组中出现次数超过一半的数字
 */

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        int[] array={1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        Map<Integer,Integer> map=new HashMap<>();
        int len=nums.length/2;
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                count++;
                map.put(nums[i],count);
                if (count>len){
                    return nums[i];
                }
            }else {
                map.put(nums[i],1);
            }
        }
        return 0;
    }
}
