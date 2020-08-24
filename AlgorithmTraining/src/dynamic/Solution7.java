package dynamic;
/*
 *@Author:anran
 *@Date:2020/8/24
 *@Version 1.0
 * 题目描述
 *  三角矩阵最短路径
 *  给出一个三角形，计算从三角形顶部到底部的最小路径和，每一步都可以移动到下面一行相邻的数字，
    例如，给出的三角形如下：[[2],[3,4],[6,5,7],[4,1,8,3]]
 */

import java.util.ArrayList;

public class Solution7 {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle==null){
            return 0;
        }
        ArrayList<ArrayList<Integer>> min=new ArrayList<>(triangle);
        int row=min.size();
        for (int i = row-2; i>=0 ; i--) {
            for (int j = 0; j <=i ; j++) {
                int minNum=Math.min(min.get(i+1).get(j),min.get(i+1).get(j+1))+min.get(i).get(j);
                min.get(i).set(j,minNum);
            }
        }
        return min.get(0).get(0);
    }
}
