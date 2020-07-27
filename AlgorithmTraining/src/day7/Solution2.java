package day7;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:xiang
 * @Date:2020/7/27 19:13
 * 数组中出现次数超过一半的数字
 */
public class Solution2 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map=new HashMap<>();
        int num=array.length/2;
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int count=map.get(array[i]);
                count++;
                map.put(array[i],count);
            }else{
                map.put(array[i],1);
            }
            if(map.get(array[i])>num){
                return array[i];
            }
        }
        return 0;
    }
}
