package day42;
/*
 *@Author:anran
 *@Date:2020/9/28
 *@Version 1.0
 * 堆成二叉树
 */

public class Solution2 {
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
    public static boolean sub(TreeNode A,TreeNode B){
        if (A==null&&B==null){
            return true;
        }
        if (A==null||B==null){
            return false;
        }
        if (A.val!=B.val){
            return false;
        }
        return sub(A.left,B.right)&&sub(A.right,B.left);
    }
}
