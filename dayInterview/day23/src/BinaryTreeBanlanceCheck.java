import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/27 21:26
 * 二叉树平衡检查
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinaryTreeBanlanceCheck {
        public static boolean isBalance(TreeNode root) {
            if (root==null){
                return true;
        }
            int left=height(root.left);
            int right=height(root.right);
            if (Math.abs(left-right)>1){
                return false;
            }
            return isBalance(root.left)&&isBalance(root.right);
    }
    public static int height(TreeNode root){
            if (root==null){
                return 0;
            }
            return Math.max(height(root.left),height(root.right))+1;
    }
 }
