package day52;
/*
 *@Author:anran
 *@Date:2020/10/13
 *@Version 1.0
 * 二叉树的第K大节点
 */

import java.util.Stack;

public class Solution5 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public int kthLargest(TreeNode root, int k) {
        if (root==null){
            return 0;
        }
        int count=0;
        Stack<Integer> stack=new Stack<>();
        inorder(root,stack);
        while (k>0){
            count=stack.pop();
            k--;
        }
        return count;
    }
    public void inorder(TreeNode root,Stack<Integer> stack){
        if (root==null){
            return;
        }
        inorder(root.left,stack);
        stack.push(root.val);
        inorder(root.right,stack);
    }
}
