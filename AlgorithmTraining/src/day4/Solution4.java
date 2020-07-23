package day4;

/**
 * @Author:xiang
 * @Date:2020/7/23 18:59
 * 判断一棵树是不是另一棵树的子树
 */
public class Solution4 {
    class TreeNode{
        int val;
        TreeNode left=null;
        TreeNode right=null;

        public TreeNode(int val){
            this.val=val;
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            if (root1==null||root2==null){
                return false;
            }
            boolean result=false;
            if (root1.val==root2.val){
                result=isSame(root1,root2);
            }
            if (!result){
                result=HasSubtree(root1.left,root2);
            }
            if (!result){
                result=HasSubtree(root1.right,root2);
            }
            return result;
        }

         boolean isSame(TreeNode root1, TreeNode root2) {
            if (root2==null){
                return true;
            }
            if (root1==null){
                return false;
            }
            if (root1.val!=root2.val){
                return false;
            }
            return isSame(root1.left,root2.left)&&isSame(root1.right,root2.right);
    }
}
