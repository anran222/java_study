package interview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/7/22 22:29
 * 字符串的排列
 */
public class ArrangementOfStrings {

     List<String> res=new LinkedList<>();

    static char[] c;

    public String[] permutation(String s){
        c=s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

     void dfs(int x){
        if (x==c.length-1){
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set=new HashSet<>();
        for (int i = x; i <c.length ; i++) {
            if (set.contains(c[i])){
                continue;
            }
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    void swap(int i, int x) {
        char temp=c[i];
        c[i]=c[x];
        c[x]=temp;
    }
}
