package DepthFirstSearch;
/*
 *@Author:anran
 *@Date:2020/9/15
 *@Version 1.0
 * 二叉树的所有路径
 */

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if (root==null){
            return list;
        }
        String str="";
        DFS(root,str,list);
        return list;
    }
    public static void DFS(TreeNode root,String str,List<String> list){
        if (root!=null){
            StringBuilder sb=new StringBuilder(str);
            if (root.left==null&&root.right==null){
                sb.append(root.val);
                list.add(sb.toString());
            }else {
                sb.append(root.val).append("->");
                DFS(root.left,sb.toString(),list);
                DFS(root.right,sb.toString(),list);
            }
        }
    }
}
