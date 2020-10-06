package day48;
/*
 *@Author:anran
 *@Date:2020/10/6
 *@Version 1.0
 * 二叉树的最近公共祖先
 */

public class Solution5 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q){
            return root;
        }
        TreeNode leftNode=lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode=lowestCommonAncestor(root.right,p,q);
        if (root.left==null){
            return rightNode;
        }
        if (root.right==null){
            return leftNode;
        }
        return root;
    }
}
