package day73;
/*
 *@Author:anran
 *@Date:2020/12/3
 *@Version 1.0
 * 构建乘积数组
 */

public class Solution4 {
    public int[] multiply(int[] A) {
        if (A==null){
            return null;
        }
        int len=A.length;
        int[] b=new int[len];
        b[0]=1;
        for (int i = 1; i <len ; i++) {
            b[i]=b[i-1]*A[i-1];
        }
        int temp=1;
        for (int i = len-2; i >=0 ; i--) {
            temp*=A[i+1];
            b[i]*=temp;
        }
        return b;
    }
}
