package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 *@Author:anran
 *@Date:2020/9/6
 *@Version 1.0
 * N叉树的层序遍历
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class Solution5 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            while (size!=0){
                Node node=queue.poll();
                list.add(node.val);
                for (Node cur:node.children) {
                    queue.offer(cur);
                }
                size--;
            }
            if (!list.isEmpty()) {
                result.add(list);
            }
        }
        return result;
    }
}
