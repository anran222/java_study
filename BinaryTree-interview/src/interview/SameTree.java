package interview;

/**
 * @Author:xiang
 * @Date:2020/4/21 23:01
 * 判断两棵树是否相同
 */
public class SameTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null){
            return true;
        }
        if ((p!=null&&q==null)||(p==null&&q!=null)){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
