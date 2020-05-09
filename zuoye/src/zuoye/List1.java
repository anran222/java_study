package zuoye;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/5/9 14:06
 * 二维网格迁移
 */
public class List1 {
    public  static List<List<Integer>> shiftGrid(int[][] grid, int k) {
    List<List<Integer>> list=new ArrayList<>();
    if (grid.length==0){
        return list;
    }
    int row=grid.length;
    int col=grid[0].length;
    int[] rec=new int[row];
    while (k>0){
        for (int i = 0; i <row ; i++) {
            rec[i] = grid[i][col - 1];
        }
        for (int i = 0; i <row ; i++) {
            for (int j = col - 2; j >= 0; j--) {
                grid[i][j + 1] = grid[i][j];
            }
        }
        for (int i = 0; i <row-1 ; i++) {
            grid[i+1][0]=rec[i];
        }
        grid[0][0]=rec[row-1];
        k--;
    }
        for (int i = 0; i <row ; i++) {
            List<Integer> temp=new ArrayList<>();
            for (int j = 0; j <col ; j++) {
                temp.add(grid[i][j]);
            }
            list.add(temp);
        }
        return list;
    }
}
