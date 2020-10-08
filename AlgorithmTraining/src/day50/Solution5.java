package day50;
/*
 *@Author:anran
 *@Date:2020/10/8
 *@Version 1.0
 * N叉树的最大深度
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

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
