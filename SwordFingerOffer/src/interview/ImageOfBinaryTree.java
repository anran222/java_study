package interview;

/**
 * @Author:xiang
 * @Date:2020/5/7 23:32
 * 二叉树的镜像
 */
public class ImageOfBinaryTree {
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

    public static TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
