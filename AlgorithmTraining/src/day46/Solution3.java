package day46;
/*
 *@Author:anran
 *@Date:2020/10/4
 *@Version 1.0
 * 递增顺序查找树
 */

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        TreeNode node=new TreeNode(0);
        TreeNode cur=node;
        for (int num:list) {
            cur.right=new TreeNode(num);
            cur=cur.right;
        }
        return node.right;
    }
    
    public void helper(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode A=new TreeNode(2);
        A.right=new TreeNode(3);
    }
}
