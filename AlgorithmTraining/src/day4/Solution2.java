package day4;

/**
 * @Author:xiang
 * @Date:2020/7/23 15:40
 * 反转链表：方法二
 */
public class Solution2 {
    class ListNode{
        int val;
        ListNode next=null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode newHead=null;
        while (head!=null){
            ListNode p=head;
            head=head.next;
            p.next=newHead;
            newHead=p;
        }
        head=newHead;
        return head;
    }
}
