package dynamic;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:xiang
 * 字符串分割
 */
public class Solution1 {
    public static void main(String[] args) {
        String s="leetcode";
        Set<String> dict=new HashSet<>();
        dict.add("leet");
        dict.add("code");
        System.out.println(workBreak(s,dict));
    }

    public static boolean workBreak(String s, Set<String> dict){
            boolean[] canBreak=new boolean[s.length()+1];
            canBreak[0]=true;
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(canBreak[j]&&dict.contains(s.substring(j,i))){
                    canBreak[i]=true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }
}
