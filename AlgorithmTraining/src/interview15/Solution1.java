package interview15;
/*
 *@Author:anran
 *@Date:2020/9/16
 *@Version 1.0
 * 斐波那契三角形
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n==0){
                System.out.println(0);
            }
            else if (n == 1) {
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(1);
                System.out.println("1 1 1");
            } else {
                int m = 2 * n - 1;
                int[][] array = new int[n][m];
                for (int i = 0; i < n; i++) {
                    array[i][0] = 1;
                }
                for (int i = 0; i < 3; i++) {
                    array[1][i] = 1;
                }
                for (int i = 2; i < n; i++) {
                    for (int j = 1; j < m; j++) {
                        if (j < i) {
                            array[i][j] = array[i - 1][j];
                        } else if (j >= (2 * i - 1)) {
                            array[i][j] = 1;
                        } else {
                            array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 2 * (i + 1) - 1; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
