package day47;
/*
 *@Author:anran
 *@Date:2020/10/5
 *@Version 1.0
 * 把数组排成最小的数
 */

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums={3,30,34,5,9};
        String s1="1";
        String s2="2";
        System.out.println(s1+s2);
        System.out.println(minNumber(nums));
    }

    public static String minNumber(int[] nums) {
        String[] str=new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(s1,s2)->(s1+s2).compareTo(s2+s1));
        StringBuilder sb=new StringBuilder();
        for (String s:str) {
            sb.append(s);
        }
        return new String(sb);
    }
}
