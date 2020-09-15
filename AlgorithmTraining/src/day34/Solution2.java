package day34;
/*
 *@Author:anran
 *@Date:2020/9/15
 *@Version 1.0
 * 链表分割
 */

public class Solution2 {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public static Node segMent(Node phead,int x){
        if (phead==null){
            return null;
        }
        Node smallHead=new Node(-1);
        Node smallTail=smallHead;
        Node bigHead=new Node(-1);
        Node bigTail=bigHead;
        for (Node cur=phead;  cur!=null ; cur=cur.next) {
            if (cur.val<x){
                smallTail.next=cur;
                smallTail=smallTail.next;
            }else {
                bigTail.next=cur;
                bigTail=bigTail.next;
            }
        }
        smallTail.next=bigHead;
        return smallHead;
    }
}
