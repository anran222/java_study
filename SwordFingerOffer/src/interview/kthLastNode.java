package interview;

/**
 * @Author:xiang
 * @Date:2020/4/26 10:43
 * 链表中倒数第k个节点
 */
public class kthLastNode {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null){
            return null;
        }
        int size=size(head);
        if (k<0||k>size){
            return null;
        }
        ListNode cur=head;
        for (int i=0; i <size-k ; i++) {
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
