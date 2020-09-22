package day38;
/*
 *@Author:anran
 *@Date:2020/9/21
 *@Version 1.0
 * 根据前序和中序重建二叉树
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
    public static void main(String[] args) {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        buildTree(preorder,inorder);
    }
    public static TreeNode buildTree(int[] preorder,int[] inorder){
        int lenP=preorder.length;
        int lenI=inorder.length;
        return helper(preorder,inorder,0,lenP-1,0,lenI-1);
    }
    public static TreeNode helper(int[] preorder,int[] inorder,int preL,int preR,int inL,int inR){
        if (preL>preR){
            return null;
        }
        int index=preorder[preL];
        int num=0;
        for (int i = 0; i <inorder.length ; i++) {
            if (inorder[i]==index){
                num=i;
                break;
            }
        }
        TreeNode root=new TreeNode(index);
        root.left=helper(preorder,inorder,preL+1,preL+(num-inL),inL,num-1);
        root.right=helper(preorder,inorder,preL+(num-inL)+1,preR,num+1,inR);
        return root;
    }
}
