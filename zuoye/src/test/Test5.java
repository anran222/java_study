package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/4/9 19:59
 * 二叉树的右视图
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

 class Test5 {
    private List<Integer> ans=new ArrayList<>();
     private int deepest=0;
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        helper(root,0);
        return ans;
    }
    public void helper(TreeNode root,int deep){
        if (root==null){
            return;
        }
        if (deep==deepest){
            ans.add(root.val);
            deepest++;
        }
        helper(root.right,deep+1);
        helper(root.left,deep+1);
    }
}
