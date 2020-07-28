package day9;

import java.util.ArrayList;

/**
 * @Author:xiang
 * @Date:2020/7/28 12:32
 * 和为s的连续整数序列：滑动窗口
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int low=1;
        int right=2;
        while(low<right){
            int total=(low+right)*(right-low+1)/2;
            if(total==sum){
                ArrayList<Integer>  list=new ArrayList<>();
                for(int i=low;i<=right;i++){
                    list.add(i);
                }
                result.add(list);
                low++;
            }else if(total<sum){
                right++;
            }else{
                low++;
            }
        }
        return result;
    }
}
