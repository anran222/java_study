package interview;

/**
 * @Author:xiang
 * @Date:2020/4/17 23:30
 * 判断链表是否有环
 */
public class Ring {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}
