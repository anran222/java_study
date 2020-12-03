package day73;
/*
 *@Author:anran
 *@Date:2020/12/3
 *@Version 1.0
 * 个位数统计
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            char[] chars=s.toCharArray();
            Map<Character,Integer> map=new TreeMap<>();
            for (int i = 0; i <chars.length ; i++) {
                if (map.containsKey(chars[i])){
                    map.put(chars[i],map.get(chars[i])+1);
                }else {
                    map.put(chars[i],1);
                }
            }
            for (Map.Entry v:map.entrySet()) {
                System.out.print(v.getKey()+":");
                System.out.println(v.getValue());
            }
        }
    }
}
