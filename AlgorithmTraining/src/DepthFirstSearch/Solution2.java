package DepthFirstSearch;
/*
 *@Author:anran
 *@Date:2020/9/15
 *@Version 1.0
 * 叶子相似的树
 */

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        DFS(root1,list1);
        DFS(root2,list2);
        return list1.equals(list2);
    }
    public static void DFS(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        if (root!=null){
            if (root.left==null&&root.right==null){
                list.add(root.val);
            }
            DFS(root.left,list);
            DFS(root.right,list);
        }
    }
}
