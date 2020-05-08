package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/5/8 22:49
 *  和为s的连续正数序列
 */
public class ContinuousPositiveSequenceWithSumS {
    public static void main(String[] args) {

    }

    public static int[][] findContinuousSequence(int target) {
        int left=1;
        int right=1;
        int sum=0;
        List<int[]> list=new ArrayList<>();
        while (left<=target/2){
            if (sum<target){
                sum+=right;
                right++;
            } else if (sum>target) {
                sum-=left;
                left++;
            }else {
                int[] arr=new int[right-left];
                for (int k = left; k <right ; k++) {
                    arr[k-left]=k;
                }
                list.add(arr);
                sum-=left;
                left++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
