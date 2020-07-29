package day10;

/**
 * @Author:xiang
 * @Date:2020/7/29 16:00
 * 反转单词顺序列
 */
public class Solution {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        int i = 0;
        int j = i;
        int len = chars.length;
        while (i < len) {
            while (i < len && !Character.isSpace(chars[i])) {
                i++;
            }
            reverse(chars, j, i - 1);
            while (i < len && Character.isSpace(chars[i])) {
                i++;
            }
            j = i;
        }
        reverse(chars,0,i-1);
        return new String(chars);
    }

        private void reverse ( char[] chars, int start, int end){
        while (start<end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        }
    }
