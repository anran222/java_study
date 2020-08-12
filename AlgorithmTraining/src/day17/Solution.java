package day17;

/*
 *@Author:anran
 *@Date:2020/8/12
 *@Version 1.0
 */
public class Solution {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //将链表以x为基准，所以小于x的节点排在大于x的节点之前
    public static ListNode partition(ListNode pHead, int x) {
        if (pHead==null){
            return null;
        }
        ListNode smallHead=new ListNode(0);
        ListNode smallTail=smallHead;
        ListNode bigHead=new ListNode(-1);
        ListNode bigTail=bigHead;
        ListNode cur=pHead;
        while (cur!=null){
            if (cur.val<x){
                smallTail.next=new ListNode(cur.val);
                cur=cur.next;
                smallTail=smallTail.next;
            }else {
                bigTail.next=new ListNode(cur.val);
                cur=cur.next;
                bigTail=bigTail.next;
            }
        }
        smallTail.next=bigHead.next;
        return smallHead.next;
    }

    //删除链表中重复节点
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead=new ListNode(-2);
        ListNode newTail=newHead;
        ListNode cur=pHead;
        while (cur!=null){
            if (cur.next!=null&&cur.val==cur.next.val){
                while (cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else {
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }
        }
        return newHead.next;
    }

    //找到两个链表的中间节点
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=size(headA);
        int size2=size(headB);
        if (size1>size2){
            int index=size1-size2;
            for (int i = 0; i <index ; i++) {
                headA=headA.next;
            }
        }
        if (size1<size2){
            int index=size2-size1;
            for (int i = 0; i <index ; i++) {
                headB=headB.next;
            }
        }
        while (headA!=null&&headB!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    public static int size(ListNode head){
        int size=0;
        for (ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
}
