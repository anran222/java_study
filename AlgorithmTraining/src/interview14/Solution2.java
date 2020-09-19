package interview14;
/*
 *@Author:anran
 *@Date:2020/9/14
 *@Version 1.0
 * 二叉树的层序遍历
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if (node==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            int size=queue.size();
            while (size!=0){
                TreeNode index=queue.poll();
                list.add(index.val);
                if (index!=null) {
                    queue.offer(index.left);
                }
                if (index!=null) {
                    queue.offer(index.right);
                }
                size--;
            }
            result.add(list);
        }
        return result;
    }
}
