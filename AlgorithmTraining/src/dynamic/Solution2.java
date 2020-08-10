package dynamic;

import java.util.ArrayList;

/**
 * @Author:xiang
 * 三角矩阵
 */
public class Solution2 {
    public static void main(String[] args) {

    }

    public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle.isEmpty()){
            return 0;
        }
        int row=triangle.size();
        for (int i = row-2; i >=0 ; i--) {
            for (int j = 0; j<=i ; j++) {
                int cur=Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1))+triangle.get(i).get(j);
                triangle.get(i).set(j,cur);
            }
        }
        return triangle.get(0).get(0);
    }
}
