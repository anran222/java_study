package interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:xiang
 * @Date:2020/5/2 22:45
 * Find numbers in sort array
 */
public class FindNumbersInSortArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        System.out.println(search(nums,6));
    }

    public static int search(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int value=0;
        map.put(target,value);
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                value++;
                map.put(target,value);
            }
        }
        return map.get(target);
    }
}