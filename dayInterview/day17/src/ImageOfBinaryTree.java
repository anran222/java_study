/**
 * @Author:xiang
 * @Date:2020/6/21 15:40
 * 二叉树的镜像
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class ImageOfBinaryTree {
    public void Mirror(TreeNode root) {
        if (root==null){
            return;
        }
        if (root.left==null&& root.right==null){
            return;
        }
        TreeNode newNode=root.left;
        root.left=root.right;
        root.right=newNode;
        if (root.left!=null){
            Mirror(root.left);
        }
        if (root.right!=null){
            Mirror(root.right);
        }
    }
}
