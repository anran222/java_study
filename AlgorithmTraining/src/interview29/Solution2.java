package interview29;
/*
 *@Author:anran
 *@Date:2020/10/22
 *@Version 1.0
 */

import java.util.Scanner;

public class Solution2 {
    static String printArray(int[][] array) {
        int m=array.length;
        int n=array[0].length;
        StringBuilder sb=new StringBuilder();
        sb.append(array[0][0]).append(",");
        int count=0;
        for (int k = 1; k <n ; k++) {
            int flag=k;
            int j=0;
            sb.append(array[j][k]).append(",");
            while (j<m-1&&k>0){
                j++;
                k--;
                sb.append(array[j][k]).append(",");
            }
            k=flag;
            count=k;
        }
        for (int i = 1; i <m ; i++) {
            int flag=i;
            int j=count;
            sb.append(array[i][j]).append(",");
            while (i<m-1&&j>0){
                i++;
                j--;
                sb.append(array[i][j]).append(",");
            }
            i=flag;
        }
        String s=new String(sb);
        int size=s.length()-1;
        return s.substring(0,size);
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _array_rows = 0;
        int _array_cols = 0;
        _array_rows = Integer.parseInt(in.nextLine().trim());
        _array_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _array = new int[_array_rows][_array_cols];
        for(int _array_i=0; _array_i<_array_rows; _array_i++) {
            for(int _array_j=0; _array_j<_array_cols; _array_j++) {
                _array[_array_i][_array_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = printArray(_array);
        System.out.println(res);
    }
}
