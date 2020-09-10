package interview9;
/*
 *@Author:anran
 *@Date:2020/9/10
 *@Version 1.0
 * 三十六进制转十进制
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            if (str.charAt(0) == '-') {
                System.out.println("-" + result(str));
            } else {
                System.out.println(result(str));
            }
        }
    }

    static int[] array={10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};

    public static long result(String str){
        boolean flag=true;
        for (int i = 0; i <str.length() ; i++) {
            if ((str.charAt(0)=='-')||(str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='0'&&str.charAt(i)<='9')){
                continue;
            }else {
                flag=false;
            }
        }
        if (flag==false){
            return 0;
        }
        char[] chars=str.toCharArray();
        long num=0;
        if (chars[0]=='-'){
            int k=0;
            for (int i = chars.length-1; i >=1 ; i--) {
                num+=sum(chars[i],k);
                k++;
            }
        }else {
            int k=0;
            for (int i = chars.length-1; i >=0 ; i--) {
                num+=sum(chars[i],k);
                k++;
            }
        }
        return num;
    }
    public static long sum(char ch,int k){
        if (k==0){
            return 1;
        }
        int num1=ch;
        if (ch>='0'&&ch<='9'){
            while (k>0){
                num1*=36;
                k--;
            }
        }else {
            int m = ch-'a';
            int num = array[m];
            while (k > 0) {
                num *= 36;
                k--;
            }
            return num;
        }
        return num1;
    }
}
