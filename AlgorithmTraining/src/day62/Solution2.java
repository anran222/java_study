package day62;
/*
 *@Author:anran
 *@Date:2020/11/7
 *@Version 1.0
 * 插入
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int i=sc.nextInt();
            int j=sc.nextInt();
            System.out.println(insertBits(N,M,i,j));
        }
    }

    public static int insertBits(int N, int M, int i, int j) {
        StringBuilder sb=new StringBuilder();
        while (N>0){
            sb.append(N%2);
            N=N/2;
        }
        String s1=new String(sb);
        StringBuilder sb1=new StringBuilder();
        while (M>0){
            sb1.append(M%2);
            M=M/2;
        }
        String s2=new String(sb1);
        StringBuilder sb2=new StringBuilder();
        int k1=0;
        while (k1<i){
            sb2.append(s1.charAt(k1));
            k1++;
        }
            sb2.append(s2);
        int k2=i+s2.length();
        while (k2<s1.length()){
            sb2.append(s1.charAt(k2));
            k2++;
        }
        String s=new String(sb2.reverse());
        int num=Integer.parseInt(s,2);
        return num;
    }
}
