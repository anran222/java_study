package day53;
/*
 *@Author:anran
 *@Date:2020/10/18
 *@Version 1.0
 * 二叉树的深度
 */

public class Solution2 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
