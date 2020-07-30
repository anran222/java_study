package day11;

import java.util.Set;

/**
 * @Author:xiang
 * @Date:2020/7/30 21:53
 * 字符串分割：动态规划
 */
public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] canBreak=new boolean[s.length()+1];
        canBreak[0]=true;
        for (int i = 0; i <=s.length() ; i++) {
            for (int j = i; j >=0 ; j--) {
                if (canBreak[j]&&dict.contains(s.substring(j,i))){
                    canBreak[i]=true;
                }
            }
        }
        return canBreak[s.length()];
    }
}
