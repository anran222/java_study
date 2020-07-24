package day5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @Author:xiang
 * @Date:2020/7/24 12:04
 * 二叉树的层序遍历
 */

public class Solution2 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode p=q.poll();
            result.add(p.val);
            if(p.left!=null){
                q.offer(p.left);
            }
            if(p.right!=null){
                q.offer(p.right);
            }
        }
        return result;
    }
}