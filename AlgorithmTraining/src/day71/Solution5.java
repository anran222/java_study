package day71;
/*
 *@Author:anran
 *@Date:2020/11/29
 *@Version 1.0
 * 反转二叉树
 */

public class Solution5 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return root;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
