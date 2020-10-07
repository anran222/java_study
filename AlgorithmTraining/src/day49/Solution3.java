package day49;
/*
 *@Author:anran
 *@Date:2020/10/7
 *@Version 1.0
 * 路径总和 BFS
 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
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
        Queue<TreeNode> queue1=new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();
        queue1.offer(root);
        queue2.offer(root.val);
        while (!queue1.isEmpty()){
            int size=queue1.size();
            for (int i = 0; i <size ; i++) {
                TreeNode node=queue1.poll();
                int cur=queue2.poll();
                if (node!=null) {
                    if (node.left == null && node.right == null && cur == sum) {
                        return true;
                    }
                    if (node.left != null) {
                        queue1.offer(node.left);
                        queue2.offer(cur + node.left.val);
                    }
                    if (node.right != null) {
                        queue1.offer(node.right);
                        queue2.offer(cur + node.right.val);
                    }
                }
            }
        }
        return false;
    }
}
