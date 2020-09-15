package day34;
/*
 *@Author:anran
 *@Date:2020/9/15
 *@Version 1.0
 * 微信红包
 */

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        int n=5;
        int[] array={1,2,3,2,2};
        System.out.println(num(array,n));
    }
    public static int num(int[] array,int n){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> s:map.entrySet()) {
            if (s.getValue()*2>n){
                return s.getKey();
            }
        }
        return 0;
    }
}
