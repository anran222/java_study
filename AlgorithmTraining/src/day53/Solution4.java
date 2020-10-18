package day53;
/*
 *@Author:anran
 *@Date:2020/10/18
 *@Version 1.0
 * 数组中数字出现的次数
 */

import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    public int[] singleNumbers(int[] nums) {
        int[] array=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int k=0;
        for (int i = 0; i <nums.length ; i++) {
            if (map.get(nums[i])==1){
                array[k++]=nums[i];
            }
        }
        return array;
    }
}
