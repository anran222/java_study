package day9;

import javax.swing.tree.TreeNode;

/**
 * @Author:xiang
 * @Date:2020/7/28 12:30
 * 二叉树的深度
 */
public class Solution1 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}
