package day46;
/*
 *@Author:anran
 *@Date:2020/10/4
 *@Version 1.0
 * 对称二叉树
 */

public class Solution4 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return sub(root.left,root.right);
    }
    public static boolean sub(TreeNode left,TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return sub(left.left, right.right) && sub(left.right, right.left);
        }
        return false;
    }
}
