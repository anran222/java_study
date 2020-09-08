package interview8;
/*
 *@Author:anran
 *@Date:2020/9/8
 *@Version 1.0
 * 密码生成器
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(result(str));
        }
    }
    public static int result(String str){
        if (str.length()<8||str.length()>120){
            return 1;
        }
        int count=0;
        int len=str.length();
        char[] chars=str.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for (int i = 0; i <len ; i++) {
            if (chars[i]<'0'||(chars[i]>'9'&&chars[i]<'A')||(chars[i]>'Z'&&chars[i]<'a')||chars[i]>'z'){
                    count4++;
                    break;
            }
        }
        for (int i = 0; i <len ; i++) {
            if (chars[i]>='0'&&chars[i]<='9'){
                count1++;
                break;
            }
        }
        for (int i = 0; i <len ; i++) {
            if (chars[i]>='a'&&chars[i]<='z'){
                count2++;
                break;
            }
        }
        for (int i = 0; i <len ; i++) {
            if (chars[i]>='A'&&chars[i]<='Z'){
                count3++;
                break;
            }
        }
        int num=count1+count2+count3+count4;
        if (num==4){
            return 0;
        }
        return 2;
    }
}
