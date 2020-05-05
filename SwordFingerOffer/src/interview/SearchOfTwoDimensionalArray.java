package interview;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/5/5 22:08
 * 二维数组的查找
 */
public class SearchOfTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[5][5];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(findNumberIn2DArray(matrix,5));
        System.out.println(findNumberIn2DArray(matrix,20));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0){
            return false;
        }
        int i=matrix.length-1;
        int j=0;
        while (i>=0&&j<matrix[0].length){
            if (matrix[i][j]>target){
                i--;
            }else if(matrix[i][j]<target){
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
}
