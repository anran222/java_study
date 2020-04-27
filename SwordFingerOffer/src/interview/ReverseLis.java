package interview;

/**
 * @Author:xiang
 * @Date:2020/4/27 12:06
 * 反转链表
 */
public class ReverseLis {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
        }
        return prev;
    }
}
