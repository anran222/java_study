package day53;
/*
 *@Author:anran
 *@Date:2020/10/18
 *@Version 1.0
 * 二叉树的第k大节点
 */

import java.util.Stack;

public class Solution1 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public int kthLargest(TreeNode root, int k) {
        Stack<Integer> stack=new Stack<>();
        inorder(root,stack);
        int num=0;
        while (k>0){
            num=stack.pop();
            k--;
        }
        return num;
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
