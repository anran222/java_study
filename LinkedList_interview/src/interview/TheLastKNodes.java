package interview;

/**
 * @Author:xiang
 * @Date:2020/4/16 22:16
 * 链表中的倒数第k个节点
 */
public class TheLastKNodes {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null){
            return null;
        }
        int size=size(head);
        if (k<0||k>size){
            return null;
        }
        ListNode cur=head;
        int steps=size-1;
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
