package day48;
/*
 *@Author:anran
 *@Date:2020/10/6
 *@Version 1.0
 * 两个链表的第一个公共节点
 */

public class Solution1 {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null){
            return null;
        }
        int a1=size(headA);
        int b1=size(headB);
        ListNode t1=headA;
        ListNode t2=headB;
        if (a1>b1){
            int size=a1-b1;
            for (int i = 0; i <size ; i++) {
                t1=t1.next;
            }
        }else {
            int size=b1-a1;
            for (int i = 0; i <size ; i++) {
                t2=t2.next;
            }
        }
        while (t1!=null&&t2!=null){
            if (t1==t2){
                return t1;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return null;
    }

    public static int size(ListNode head){
        int size=0;
        for (ListNode cur = head; cur!=null ; cur=cur.next) {
            size++;
        }
        return size;
    }
}
