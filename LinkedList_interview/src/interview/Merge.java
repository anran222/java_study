package interview;

/**
 * @Author:xiang
 * @Date:2020/4/16 22:28
 *合并两个链表返回一个有序链表
 */
public class Merge {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while (cur1!=null&&cur2!=null){
            if (cur1.val<cur2.val){
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else {
                newTail=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        if (cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newTail.next;
    }
}
