package day53;
/*
 *@Author:anran
 *@Date:2020/10/18
 *@Version 1.0
 * 平衡二叉树
 */

public class Solution3 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        if (Math.abs(depth(root.left)-depth(root.right))>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int depth(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
