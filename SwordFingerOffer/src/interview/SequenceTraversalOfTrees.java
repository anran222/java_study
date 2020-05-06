package interview;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author:xiang
 * @Date:2020/5/6 23:04
 * 树的层序遍历
 */
public class SequenceTraversalOfTrees {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static int[] levelOrder(TreeNode root) {
        if (root==null){
            return new int[0];
        }
        Queue<TreeNode> queue=new LinkedList<>(){
            {
                add(root);
            }
        };
        ArrayList<Integer> al=new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            al.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
            int[] res=new int[al.size()];
            for (int i = 0; i <al.size() ; i++) {
                res[i]=al.get(i);
            }
        return res;
    }
}
