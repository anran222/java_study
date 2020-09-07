package day27;
/*
 *@Author:anran
 *@Date:2020/9/7
 *@Version 1.0
 * 电话号码的字母组合
 */

import java.util.LinkedList;
import java.util.List;

public class Solution2 {

    String[] array={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public void DFS(String digits,List<String> result,StringBuilder sb,int depth){
        if (depth==digits.length()){
            if (sb.length()!=0){
                result.add(sb.toString());
            }
            return;
        }
        int cur=digits.charAt(depth)-'0';
        String str=array[cur];
        for (int i = 0; i <str.length() ; i++) {
            DFS(digits,result,sb.append(str.charAt(i)),depth+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result=new LinkedList<>();
        if (digits.length()==0){
            return result;
        }
        StringBuilder sb=new StringBuilder("");
        DFS(digits,result,sb,0);
        return result;
    }
}
