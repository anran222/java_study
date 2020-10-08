package day50;
/*
 *@Author:anran
 *@Date:2020/10/8
 *@Version 1.0
 * 数组中数字出现的次数2   hashmap
 */

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums={9,1,7,9,7,9,7};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for (int i = 0; i <nums.length ; i++) {
            if (map.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}
