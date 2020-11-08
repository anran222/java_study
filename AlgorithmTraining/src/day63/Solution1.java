package day63;
/*
 *@Author:anran
 *@Date:2020/11/8
 *@Version 1.0
 * 无重复字符串的全排列
 */

import java.util.Arrays;
import java.util.LinkedList;

public class Solution1 {
    public static void main(String[] args) {
        String s="12345";
        System.out.println(Arrays.toString(permutation(s)));
    }

    public static String[] permutation(String S) {
        char[] chars=S.toCharArray();
        boolean[] bl=new boolean[S.length()];
        StringBuilder sb=new StringBuilder();
        LinkedList<String> list=new LinkedList<>();
        dfs(chars,bl,sb,list);
        return list.toArray(new String[0]);
    }

    public static void dfs(char[] chars,boolean[] bl,StringBuilder sb,LinkedList list){
        if (sb.length()==chars.length){
            list.add(sb.toString());
            return ;
        }
        for (int i = 0; i <chars.length ; i++) {
            if (bl[i]==true){
                continue;
            }
            sb.append(chars[i]);
            bl[i]=true;
            dfs(chars,bl,sb,list);
            sb.deleteCharAt(sb.length()-1);
            bl[i]=false;
        }
    }
}
