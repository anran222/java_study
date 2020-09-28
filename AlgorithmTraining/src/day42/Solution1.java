package day42;
/*
 *@Author:anran
 *@Date:2020/9/28
 *@Version 1.0
 * 树的子结构
 */

public class Solution1 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null||B==null){
            return false;
        }
        if(sub(A, B)){
            return true;
        } else {
            return isSubStructure(A.left,B)||isSubStructure(A.right,B);
        }
    }

    public static boolean sub(TreeNode A,TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val == B.val) {
            return sub(A.left, B.left) && sub(A.right, B.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode B=new TreeNode(3);
        a.left=b;
        a.right=c;
        b.left=d;
        System.out.println(isSubStructure(a,B));
    }
}
