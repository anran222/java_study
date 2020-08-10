package dynamic;

/**
 * @Author:xiang
 * 路径总数
 */
public class Solution3 {
    public static void main(String[] args) {
        int m=3;
        int n=7;

    }

    public static int uniquePaths (int m, int n) {
        int[][] pathNum=new int[m][n];
        for (int i = 0; i <m ; i++) {
            pathNum[i][0]=1;
        }
        for (int i = 0; i <n ; i++) {
            pathNum[0][i]=1;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                pathNum[i][j]=pathNum[i-1][j]+pathNum[i][j-1];
            }
        }
        return pathNum[m-1][n-1];
    }
}
