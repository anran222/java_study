package day49;
/*
 *@Author:anran
 *@Date:2020/10/7
 *@Version 1.0
 * 路径总和 DFS
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

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null){
            return false;
        }
        if (root.left==null&&root.right==null){
            return root.val==sum;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
