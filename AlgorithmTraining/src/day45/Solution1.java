package day45;
/*
 *@Author:anran
 *@Date:2020/10/3
 *@Version 1.0
 * 二叉树中和为某一值的路径
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    static List<Integer> list=new LinkedList<>();
    static List<List<Integer>> result=new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null){
            return result;
        }
        DFS(root,sum);
        return result;
    }

    public static void DFS(TreeNode root,int sum){
        if (root==null){
            return;
        }
        list.add(root.val);
        sum-=root.val;
        if (sum==0&&root.left==null&&root.right==null){
            result.add(list);
        }
        DFS(root.left,sum);
        DFS(root.right,sum);
        list.remove(list.size()-1);
    }
}
