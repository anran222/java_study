package day61;
/*
 *@Author:anran
 *@Date:2020/11/4
 *@Version 1.0
 * 返回倒数第k个节点
 */

public class Solution3 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }

    public int kthToLast(ListNode head, int k) {
        int size=size(head);
        int num=size-k;
        ListNode cur=head;
        while (num>0){
            cur=cur.next;
            num--;
        }
        return cur.val;
    }

    public int size(ListNode head){
        int size=0;
        for (ListNode cur = head; cur !=null ; cur=cur.next) {
            size++;
        }
        return size;
    }
}
