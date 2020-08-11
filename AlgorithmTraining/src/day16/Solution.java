package day16;

public class Solution {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //删除链表中值等于val的所有节点
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode prev=head;
        ListNode cur=head.next;
        while (cur!=null){
                if (cur.val==val){
                    prev.next=cur.next;
                    cur=prev.next;
                }else {
                    prev=cur;
                    cur=cur.next;
                }
            }
        if (head.val==val){
            head=head.next;
        }
        return head;
    }

    //反转一个单链表
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode prev=null;
        ListNode cur=head;
        while (cur != null) {
            ListNode next=cur.next;
            if (next==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return newHead;
    }

    //求链表的中间节点
    public static ListNode middleNode(ListNode head) {
        int size=size(head)/2;
        ListNode cur=head;
        for (int j = 0; j <size ; j++) {
            cur=cur.next;
        }
        return cur;
    }
    public static int size(ListNode head){
        int size=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }

    //返回链表的倒数第k个节点
    public static ListNode FindKthToTail(ListNode head,int k) {
            int size=size(head);
        if (k<=0||k>size){
            return null;
        }
            ListNode cur=head;
            for (int i = 0; i <size-k ; i++) {
                cur=cur.next;
            }
            return cur;
    }

    //将两个有序链表合并成一个有序链表
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode newHead=new ListNode(0);
        ListNode newTail=newHead;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while (cur1!=null&&cur2!=null){
            if (cur1.val<=cur2.val){
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else {
                newTail.next=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        if (cur1==null){
            newTail.next=cur2;
        }
        if (cur2==null){
            newTail.next=cur1;
        }
        return newHead.next;
    }
}
