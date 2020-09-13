package day32;
/*
 *@Author:anran
 *@Date:2020/9/13
 *@Version 1.0
 * 二叉树的镜像
 */
public class Solution1 {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static void Mirror(TreeNode root) {
        if (root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if (root.left!=null){
            Mirror(root.left);
        }
        if (root.right!=null){
            Mirror(root.right);
        }
    }
}
