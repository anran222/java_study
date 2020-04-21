package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/4/21 22:47
 * 二叉树的后序遍历
 */
public class PostorderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if (root==null){
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
