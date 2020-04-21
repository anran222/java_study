package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/4/21 22:35
 * 二叉树的先序遍历
 */
public class PreorderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if (root==null){
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
}
