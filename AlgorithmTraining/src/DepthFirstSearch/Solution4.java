package DepthFirstSearch;
/*
 *@Author:anran
 *@Date:2020/9/15
 *@Version 1.0
 * 将有序数组转换成二叉搜索树
 */

public class Solution4 {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return DFS(nums,0,nums.length-1);
    }
    public static TreeNode DFS(int[] nums,int left,int right){
        if (left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=DFS(nums,left,mid-1);
        root.right=DFS(nums,mid+1,right);
        return root;
    }
}
