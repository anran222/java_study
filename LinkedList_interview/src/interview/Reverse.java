package interview;

/**
 * @Author:xiang
 * @Date:2020/4/8 20:23
 * 反转一个单链表
 */

public class Reverse {

    static class ListNode{
        int val;
       ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return head;
        }
        if (head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode newNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=newNode;
        }
        return prev;
    }
}
