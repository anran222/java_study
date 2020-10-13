package day52;
/*
 *@Author:anran
 *@Date:2020/10/13
 *@Version 1.0
 * 二叉搜索树的最近公共祖先
 */

public class Solution1 {
     class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if (p.val>root.val&&q.val>root.val){
             return lowestCommonAncestor(root.right,p,q);
         }else if (p.val<root.val&&q.val<root.val){
             return lowestCommonAncestor(root.left,p,q);
         }
         return root;
    }
}
