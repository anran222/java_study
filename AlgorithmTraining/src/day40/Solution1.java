package day40;
/*
 *@Author:anran
 *@Date:2020/9/24
 *@Version 1.0
 * 顺时针打印矩阵
 */

public class Solution1 {
    public static void main(String[] args) {

    }

    public  int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0){
            return new int[0];
        }
        int left=0;
        int right=matrix.length-1;
        int up=0;
        int down=matrix[0].length-1;
        int[] res=new int[(right+1)*(down+1)];
        int x=0;
        while (true){
            for (int i = left; i <=right ; i++) {
                res[x++]=matrix[up][i];
            }
                if (++up>down){
                    break;
                }
            for (int i = up; i <=down ; i++) {
                res[x++]=matrix[i][right];
            }
                if (--right<left){
                    break;
                }
            for (int i = right; i >=left ; i--) {
                res[x++]=matrix[down][i];
            }
                if (--down<up){
                    break;
                }
            for (int i = down; i >=up ; i--) {
                res[x++]=matrix[i][left];
            }
                if (++left>right){
                    break;
                }
        }
        return res;
    }
}
