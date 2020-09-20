package interview17;
/*
 *@Author:anran
 *@Date:2020/9/20
 *@Version 1.0
 * 小美找朋友
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            result(str1,m,str2,n);
        }
    }
    public static void result(String str1,int m,String str2,int n) {
        char[] p = str1.toCharArray();
        char[] s = str2.toCharArray();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=-1;
        }
        int j=0;
        int k=0;
        int index=0;
        for (int i = 0; i <n ; i++) {
            j=index;
            while (j<m){
                if (p[j]==s[i]){
                    array[k]=j+1;
                    k++;
                    index=j+1;
                    break;
                }else{
                    j++;
                }
            }
        }
        boolean flag=false;
        for (int i = 0; i < n; i++) {
            if (array[i] == -1) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("No");
        } else {
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += array[i];
            }
            System.out.println("Yes");
            System.out.println(count);
        }
    }
}
