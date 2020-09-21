package day37;
/*
 *@Author:anran
 *@Date:2020/9/20
 *@Version 1.0
 * 求根到叶子节点数字之和
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

    public static int sumNumbers(TreeNode root) {
        return DFS(root,0);
    }

    public static int DFS(TreeNode root,int sum){
        if (root==null){
            return 0;
        }
        sum*=10 ;
        sum+=root.val;
        if (root.left==null&&root.right==null){
            return sum;
        }
        return DFS(root.left,sum)+DFS(root.right,sum);
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        a.left=b;
        a.right=c;
        System.out.println(sumNumbers(a));
    }
}
