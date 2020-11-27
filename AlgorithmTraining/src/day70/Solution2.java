package day70;
/*
 *@Author:anran
 *@Date:2020/11/27
 *@Version 1.0
 * 数组中出现次数大于数组长度一半的数
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] s=str.split(" ");
            Map<String,Integer> map=new HashMap<>();
            for (int i = 0; i <s.length ; i++) {
                if (map.containsKey(s[i])){
                    map.put(s[i],map.get(s[i])+1);
                }else {
                    map.put(s[i],1);
                }
            }
            int size=s.length/2;
            for (int i = 0; i <s.length ; i++) {
                if (map.get(s[i])>=size){
                    System.out.println(s[i]);
                    break;
                }
            }
        }
    }
}
