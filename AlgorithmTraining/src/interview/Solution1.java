package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author:xiang
 * 字符串中最长的数字子串
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String s=max(str);
            System.out.println(s);
        }
    }

    public static String max(String str){
        if (str.length()==0){
            return null;
        }
        char[] chars=str.toCharArray();
        int i=0;
        int j=0;
        int len=chars.length;
        int count=0;
        while (j<len){
            int length=0;
            while (j<len&&chars[j]>='0'&&chars[j]<='9'){
                j++;
                length++;
            }
            if (length>count){
                count=length;
                i=j;
            }
            while (j<len&&(chars[j]<'0'||chars[j]>='9')){
                j++;
            }
        }
        String s=str.substring(i-count,i);
        return s;
    }
}
