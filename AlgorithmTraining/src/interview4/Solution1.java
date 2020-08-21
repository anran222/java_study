package interview4;
/*
 *@Author:anran
 *@Date:2020/8/21
 *@Version 1.0
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            result(s);
    }

    public static void result(String s){
        char[] chars=s.toCharArray();
        char flag=chars[4];
        int i=chars[0]-48;
        int m=chars[2]-48;
        int j=chars[6]-48;
        int n=chars[8]-48;
        String str=null;
        if (flag=='+'){
            jia(i,m,j,n);
        } else if (flag=='-'){
            jian(i,m,j,n);
        } else if (flag=='*'){
           chen(i,m,j,n);
        }else if (flag=='/'){
            chu(i,m,j,n);
        }
    }

    public static void jia(int i,int m,int j,int n){
        int sum=m*n;
        i=i*n;
        j=j*m;
        int result=i+j;
        int min=Math.min(result,sum);
        for (int k = 2; k <=min ; k++) {
            while ((result%k==0)&&(sum%k==0)){
                result=result/k;
                sum=sum/k;
            }
        }
        System.out.print(result+"/"+sum);
    }

    public static void jian(int i,int m,int j,int n){
        int sum=m*n;
        i=i*n;
        j=j*m;
        int result=0;
        if (i<j) {
            result = j - i;
            int min = Math.min(result, sum);
            for (int k = 1; k <= min; k++) {
                if ((result % k == 0) && (sum % k == 0)) {
                    result = result / k;
                    sum = sum / k;
                }
            }
            System.out.print("-"+result+"/"+sum);
        }else {
            result=i-j;
            int min=Math.min(result,sum);
            for (int k = 1; k <=min ; k++) {
                if ((result%k==0)&&(sum%k==0)){
                    result=result/k;
                    sum=sum/k;
                }
            }
            System.out.print(result+"/"+sum);
        }
    }
    public static void chen(int i,int m,int j,int n){
        int sum=m*n;
        int result=i*j;
        int min=Math.min(result,sum);
        for (int k = 1; k <=min ; k++) {
            if ((result%k==0)&&(sum%k==0)){
                result=result/k;
                sum=sum/k;
            }
        }
        System.out.print(result+"/"+sum);
    }
    public static void chu(int i,int m,int j,int n){
        int sum=n*j;
        int result=m*i;
        if (result%sum==0){
            int num=result/sum;
            System.out.println(num);
        }else {
            System.out.println(result+"/"+sum);
        }
    }
}
