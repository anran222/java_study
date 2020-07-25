package day6;

import java.util.ArrayList;

/**
 * @Author:xiang
 * @Date:2020/7/25 15:11
 * 二叉树中和为某一值的路径：回溯法
 */
public class Solution {
    class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }
     }

    public void FindPathHelper(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        target-=root.val;
        if(root.left==null&&root.right==null&&target==0){
            result.add(new ArrayList<Integer>(list));
        }
        FindPathHelper(root.left,target,result,list);
        FindPathHelper(root.right,target,result,list);
        list.remove(list.size()-1);
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return result;
        }
        FindPathHelper(root,target,result,list);
        return  result;
    }
}
