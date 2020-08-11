package interview2;

import com.sun.jdi.Value;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[n];
        for (int i = 0; i <n ; i++) {
            ary[i]=sc.nextInt();
        }
        int i=0;
        int j=ary.length-1;
        int flag=0;
        int max= 0;
        int min= 100000000;
        while (i<j){
            int count=0;
            int num=0;
            for (int k = i; k <j ; k++) {
                count=count+ary[k];
                num=(j-i);
            }
            if (count>max){
                if (num<min){
                    min=num;
                }
                max=count;
                j++;
                flag=i;
            }
            if (count<max){
                i++;
            }
        }
        System.out.println(min);
    }
}
