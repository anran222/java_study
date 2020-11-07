package day62;
/*
 *@Author:anran
 *@Date:2020/11/7
 *@Version 1.0
 * 链表相交
 */

public class Solution1 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=size(headA);
        int len2=size(headB);
        if (len1>len2){
            int num=len1-len2;
            while (num>0){
                headA=headA.next;
                num--;
            }
        }
        if (len2>len1){
            int num=len2-len1;
            while (num>0){
                headB=headB.next;
                num--;
            }
        }
        while (headA!=null&&headB!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int size(ListNode head){
        int size=0;
        for(ListNode cur=head;cur!=null;cur= cur.next){
            size++;
        }
        return size;
    }
}
