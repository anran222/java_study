package interview;

import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/4/17 23:21
 * 两个链表的相交节点
 */
public class IntersectionNode {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=size(headA);
        int size2=size(headB);
        if (size1>size2){
            int offset=size1-size2;
            for (int i = 0; i <offset ; i++) {
                headA=headA.next;
            }
        }else {
            int offset=size2-size1;
            for (int i = 0; i <offset ; i++) {
                headB=headB.next;
            }
        }
        while (headA!=null&&headB!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
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
