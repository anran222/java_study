package interview2;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] array=new int[n][m];
        for (int i = 0; i <n ; i++) {
            array[i][0]=1;
        }
        for (int i = 0; i <m ; i++) {
            array[0][i]=1;
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <m ; j++) {
                int count=array[i-1][j]+array[i][j-1];
                array[i][j]=count;
            }
        }
        System.out.println(array[n/2][m/2]);
    }
}

