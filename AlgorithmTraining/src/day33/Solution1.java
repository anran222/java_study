package day33;
/*
 *@Author:anran
 *@Date:2020/9/14
 *@Version 1.0
 * 子串判断
 */

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        String[] p={"a","b","c","d"};
        int n=4;
        String s="abc";
        System.out.println(Arrays.toString(chkSubStr(p,n,s)));
    }
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] flag=new boolean[n];
        for (int i = 0; i <n ; i++) {
            if (s.contains(p[i])){
                flag[i]=true;
            }else {
                flag[i]=false;
            }
        }
        return flag;
    }
}
