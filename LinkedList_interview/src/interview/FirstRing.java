package interview;

/**
 * @Author:xiang
 * @Date:2020/4/18 22:02
 * 给定一个链表，返回链表开始入环的第一个节点
 */
public class FirstRing {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                break;
            }
        }
        ListNode cur1=head;
        ListNode cur2=fast;
        while (cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
}
