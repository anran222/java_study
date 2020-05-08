package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/5/8 22:03
 * 二叉搜索树的第k大节点
 */
public class ThekthNodeOfBinarySearchTree {
    public static void main(String[] args) {

    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static int kthLargest(TreeNode root, int k) {
        List<Integer> list=inorder(root,new ArrayList<>());
        return list.get(list.size()-k);
    }

    public static List<Integer> inorder(TreeNode root,List<Integer> list){
        if (root==null){
            return list;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        return list;
    }
}
