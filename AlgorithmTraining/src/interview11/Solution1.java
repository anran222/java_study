package interview11;
/*
 *@Author:anran
 *@Date:2020/9/12
 *@Version 1.0
 * 截出最小数
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            long x=sc.nextInt();
            System.out.println(result(str,x));
        }
    }
    public static Long result(String str,long x){
        char[] chars=str.toCharArray();
        int len=chars.length;
        if (x>=len){
            return new Long(0);
        }
        int[] num=new int[len];
        for (int i = 0; i <len ; i++) {
            num[i]=chars[i]-'0';
        }
        StringBuilder sb=new StringBuilder();
        long count=len-x;
        int index=0;
        int flag=0;
        while (count>0){
            int i=index;
            int min=Integer.MAX_VALUE;
            for (; i <len ;) {
                if (num[i]<min&&(len-i)>count-1) {
                    min = num[i];
                    flag=i;
                }
                i++;
            }
            sb.append(num[flag]);
            index=flag+1;
            count--;
        }
        return Long.valueOf(new String(sb));
    }
}
