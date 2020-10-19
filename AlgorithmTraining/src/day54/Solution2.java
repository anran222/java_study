package day54;
/*
 *@Author:anran
 *@Date:2020/10/19
 *@Version 1.0
 * 和为s的连续整数序列
 */

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        int target=15;
        System.out.println(findContinuousSequence(target));
        for (int i = 0; i <findContinuousSequence(target).length ; i++) {
            for (int j = 0; j <findContinuousSequence(target)[i].length ; j++) {
                System.out.print(findContinuousSequence(target)[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] findContinuousSequence(int target) {
        List<int[]> result=new ArrayList<>();
        for (int i = 1; i <=target/2 ; i++) {
            int sum=i;
            for (int j = i+1; j <target ; j++) {
                sum+=j;
                if (sum>target){
                    break;
                }else if (sum<target){
                    continue;
                }else {
                    int[] array=new int[j-i+1];
                    int a=0;
                    for (int k = i; k <=j ; k++) {
                        array[a++]=k;
                    }
                    result.add(array);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
