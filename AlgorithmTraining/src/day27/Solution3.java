package day27;
/*
 *@Author:anran
 *@Date:2020/9/7
 *@Version 1.0
 * 组合总数
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 */

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        if (candidates.length==0){
            return result;
        }
        List<Integer> list=new ArrayList<>();
        int num=0;
        DFS(candidates,result,list,num,0,target);
        return result;
     }
     public void DFS(int[] candidates,List<List<Integer>> result,List<Integer> list,int num,int prev,int target){
        if (num>=target){
            if (num==target){
                List<Integer> copy=new ArrayList<>();
                for (int cur:list) {
                    copy.add(cur);
                }
                result.add(copy);
            }
            return;
        }
         for (int i = prev; i <candidates.length ; i++) {
             list.add(candidates[i]);
             DFS(candidates,result,list,num+candidates[i],i,target);
             list.remove(list.size()-1);
         }
     }
}
