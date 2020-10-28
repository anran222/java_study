package day58;
/*
 *@Author:anran
 *@Date:2020/10/28
 *@Version 1.0
 * 主要元素
 * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 * 第一种方法
 */

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums={1,2,5,9,5,9,5,5,5};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int len=nums.length/2;
        for (int i = 0; i <nums.length ; i++) {
            if (map.get(nums[i])>=len){
                return nums[i];
            }
        }
        return -1;
    }
}
