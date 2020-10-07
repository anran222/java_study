package day49;
/*
 *@Author:anran
 *@Date:2020/10/7
 *@Version 1.0
 * 删除链表中的重复元素2
 */

public class Solution6 {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode prev=new ListNode(-1);
        prev.next=head;
        ListNode a=prev;
        ListNode b=head;
        while (b!=null&&b.next!=null){
            if (a.next.val!=b.next.val){
                a=a.next;
                b=b.next;
            }else {
                while (b!=null&&b.next!=null&&a.next.val==b.next.val) {
                    b=b.next;
                }
                a.next=b.next;
                b=b.next;
            }
        }
        return prev.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        a.next=b;
        ListNode c=new ListNode(3);
        b.next=c;
        ListNode d=new ListNode(3);
        c.next=d;
        ListNode e=new ListNode(4);
        d.next=e;
        ListNode f=new ListNode(4);
        e.next=f;
        ListNode g=new ListNode(5);
        f.next=g;
        System.out.println(deleteDuplicates(a).val);
    }
}
