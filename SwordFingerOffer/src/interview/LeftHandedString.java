package interview;

import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/4/25 20:54
 * 左旋字符串
 */
public class LeftHandedString {
    public static void main(String[] args) {
        String str="abcdefg";
        System.out.println(reverseLeftWords(str,2));
    }

    public static String reverseLeftWords(String s, int n) {
        char[] str1=s.toCharArray();
        int size=s.length();
        while (n>0){
            char[] str2=new char[size];
            for (int i = 0; i <str2.length-1 ; i++) {
                str2[i]=str1[i+1];
            }
            str2[size-1]=str1[0];
            str1=str2;
            n--;
        }
        String s1=new String(str1);
        return s1;
    }
}
