package DepthFirstSearch;
/*
 *@Author:anran
 *@Date:2020/9/15
 *@Version 1.0
 * 检查平衡性
 */

public class Solution1 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        int leftDepth=Depth(root.left);
        int rightDepth=Depth(root.right);
        if (Math.abs(leftDepth-rightDepth)>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public static int Depth(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.max(Depth(root.left),Depth((root.right)))+1;
    }
}
