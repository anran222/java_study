package day36;
/*
 *@Author:anran
 *@Date:2020/9/17
 *@Version 1.0
 * 二叉树平衡检查
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
    public static boolean isBalance(TreeNode root) {
        if (root==null){
            return true;
        }
        int dep1=depth(root.left);
        int dep2=depth(root.right);
        if (Math.abs(dep1-dep2)>1){
            return false;
        }
        return isBalance(root.left)&isBalance(root.right);
    }
    public static int depth(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
