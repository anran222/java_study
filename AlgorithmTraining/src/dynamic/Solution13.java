package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/24
 *@Version 1.0
 * 编辑距离
 * 给定两个单词word1和word2，请计算将word1转换为word2至少需要多少步操作。
   你可以对一个单词执行以下3种操作：
    a）在单词中插入一个字符
    b）删除单词中的一个字符
    c）替换单词中的一个字符
 */

public class Solution13 {
    public int minDistance (String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        if (len1==0){
            return len2;
        }
        if (len2==0){
            return len1;
        }
        int[][] array=new int[len1+1][len2+1];
        for (int i = 0; i <=len1 ; i++) {
            array[i][0]=i;
        }
        for (int i = 0; i <=len2 ; i++) {
            array[0][i]=i;
        }
        for (int i = 1; i <=len1 ; i++) {
            for (int j = 1; j <=len2 ; j++) {
                array[i][j]=Math.min(array[i-1][j],array[i][j-1])+1;
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    array[i][j]=Math.min(array[i][j],array[i-1][j-1]);
                }else {
                    array[i][j]=Math.min(array[i][j],array[i-1][j-1]+1);
                }
            }
        }
        return array[len1][len2];
    }
}
