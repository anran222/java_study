package day52;
/*
 *@Author:anran
 *@Date:2020/10/13
 *@Version 1.0
 * 两个链表的第一个相交节点
 */

public class Solution2 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1=size(headA);
        int s2=size(headB);
        ListNode t1=headA;
        ListNode t2=headB;
        if (s1>s2){
            int len=s1-s2;
            while (len>0){
                t1=t1.next;
                len--;
            }
        }else {
            int len=s2-s1;
            while (len>0){
                t2=t2.next;
                len--;
            }
        }
        while (t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }

    public int size(ListNode head){
        int size=0;
        for (ListNode cur = head; cur!=null ; cur=cur.next) {
            size++;
        }
        return size;
    }
}
