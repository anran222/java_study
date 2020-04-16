package interview;

/**
 * @Author:xiang
 * @Date:2020/4/16 22:06
 * 返回链表的中间节点
 */
public class MIddle {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head.next==null){
            return head;
        }
        ListNode cur=head;
        int steps=size(head)/2;
        for (int i = 0; i <steps ; i++) {
            cur=cur.next;
        }
        return cur;
    }

    public static int size(ListNode head){
        int size=0;
        ListNode cur=head;
        while (cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
}
