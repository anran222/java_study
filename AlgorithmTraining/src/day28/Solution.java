package day28;
/*
 *@author:anran
 *@Date:2020/9/8
 *@Version 1.0
 * 个位数统计
 * 给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，请编写程序统计每种不同的个位数字出现的次数。
 * 例如：给定N = 100311，则有2个0，3个1，和1个3。
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            char[] chars=str.toCharArray();
            int i=0;
            int[] array=new int[chars.length];
            for (int j = 0; j <chars.length ; j++) {
                array[i]=chars[j]-'0';
                i++;
            }
            num(array);
        }
    }
    public static void num(int[] array){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            if (map.containsKey(array[i])){
                int count=map.get(array[i]);
                count++;
                map.put(array[i],count);
            }else {
                map.put(array[i],1);
            }
        }
        Map<Integer,Integer> treeMap=new TreeMap<>(map);
        for (Map.Entry<Integer,Integer> entry:treeMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
