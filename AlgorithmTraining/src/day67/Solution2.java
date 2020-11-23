package day67;
/*
 *@Author:anran
 *@Date:2020/11/23
 *@Version 1.0
 * 数组中的逆序对
 */

public class Solution2 {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,0};
        int n=8;
        System.out.println(count(A,n));
    }
    public static int count(int[] A, int n) {
        int count=0;
        for (int i = 0; i <A.length-1 ; i++) {
            for (int j = n-1; j >i ; j--) {
                if (A[j]<A[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
