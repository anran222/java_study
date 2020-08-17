package day19;
/*
 *@Author:anran
 *@Date:2020/8/17
 *@Version 1.0
 * 字符串分割
 */

import java.util.Set;

public class Solution {
    public boolean workBreak(String s, Set<String>dict){
        boolean[] canBraek=new boolean[s.length()+1];
        canBraek[0]=true;
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (canBraek[j]&&dict.contains(s.substring(j,i))){
                    canBraek[i]=true;
                    break;
                }
            }
        }
        return canBraek[s.length()];
    }
}
