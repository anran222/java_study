package interview;

import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/4/16 22:51
 * 以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 */
public class SmallBeforeBig {
    static class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode partition(ListNode pHead, int x) {
        if (pHead==null){
            return null;
        }
        if (pHead.next==null){
            return pHead;
        }
        ListNode big=new ListNode(-1);
        ListNode bigTail=big;
        ListNode small=new ListNode(-1);
        ListNode smallTail=small;
        for (ListNode cur = pHead; cur!=null ; cur=cur.next) {
            if (cur.val<x){
                smallTail.next=new ListNode(cur.val);
                smallTail=smallTail.next;
            }else {
                bigTail.next=new ListNode(cur.val);
                bigTail=bigTail.next;
            }
        }
        smallTail.next=big.next;
        return small.next;
    }
}
