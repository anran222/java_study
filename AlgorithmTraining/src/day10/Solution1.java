package day10;

/**
 * @Author:xiang
 * @Date:2020/7/29 16:12
 * 左旋字符串
 */
public class Solution1 {
    public String LeftRotateString(String str,int n) {
            if (str.length()==0||n<0){
                return  str;
            }
            n%=str.length();
            char[] chars=str.toCharArray();
            while (n>0){
                n--;
                LeftRotateStringHelper(chars);
            }
            return new String(chars);
        }

        private void LeftRotateStringHelper(char[] chars) {
            char c=chars[0];
            int i=0;
            for (; i <chars.length-1 ; i++) {
                chars[i]=chars[i+1];
            }
            chars[i]=c;
    }
}
