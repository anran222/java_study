package day39;
/*
 *@Author:anran
 *@Date:2020/9/22
 *@Version 1.0
 * 删除链表中的节点
 */

import java.util.ArrayList;

public class Solution2 {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            this.val=x;
        }
    }
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode prev=new ListNode(-1);
        ListNode tail=prev;
        for (ListNode cur = head; cur!=null ; cur=cur.next) {
            if (cur.val!=val){
                tail.next=new ListNode(cur.val);
                tail=tail.next;
            }else {
                continue;
            }
        }
        return prev.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(4);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(9);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(print(deleteNode(a,1)));
    }
    public static ArrayList<Integer> print(ListNode head){
        ArrayList<Integer> list=new ArrayList<>();
        for(ListNode cur=head;cur!=null;cur=cur.next){
            list.add(cur.val);
        }
        return list;
    }
}
