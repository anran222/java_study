package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/24
 *@Version 1.0
 *回文串分割
 * 给出一个字符串s，分割s使得分割出的每一个子串都是回文串
    计算将字符串s分割成回文分割结果的最小切割数
    例如:给定字符串s="aab",
    返回1，因为回文分割结果["aa","b"]是切割一次生成的。
 */

public class Solution12 {

    public boolean isPal(String s,int start,int end){
        while (start<end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }

    public int minCut (String s) {
        int len=s.length();
        if (len==0){
            return 0;
        }
        int[] min=new int[len+1];
        for (int i = 0; i <=len ; i++) {
            min[i]=i-1;
        }
        for (int i = 1; i <=len ; i++) {
            for (int j = 0; j <i ; j++) {
                if (isPal(s,j,i-1)){
                    min[i]=Math.min(min[i],min[j]+1);
                }
            }
        }
        return min[len];
    }
}
