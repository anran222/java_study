package day47;
/*
 *@Author:anran
 *@Date:2020/10/5
 *@Version 1.0
 * 第一个只出现一次的字符
 */

import java.util.HashMap;
import java.util.Map;

public class Solution5 {
    public static void main(String[] args) {
        String s="abaccdeff";
        System.out.println(firstUniqChar(s));
    }

    public static char firstUniqChar(String s) {
        char[] chars=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <chars.length ; i++) {
            if (map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }else {
                map.put(chars[i],1);
            }
        }
        for (int i = 0; i <chars.length ; i++) {
            if (map.get(chars[i])==1){
                return chars[i];
            }
        }
        return ' ';
    }
}
