package day50;
/*
 *@Author:anran
 *@Date:2020/10/8
 *@Version 1.0
 * 反转链表
 */

public class Solution4 {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //双指针反转链表
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode prev=new ListNode(-1);
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        prev.next=null;
        return prev.next;
    }
}

//    //用栈实现链表的反转
//    public ListNode reverseList(ListNode head) {
//        if (head==null||head.next==null){
//            return head;
//        }
//        Stack<Integer> stack=new Stack<>();
//        for(ListNode cur=head; cur!=null; cur=cur.next){
//            stack.push(cur.val);
//        }
//        ListNode phead=new ListNode(-1);
//        ListNode prev=phead;
//        while (!stack.isEmpty()){
//            prev.next=new ListNode(stack.pop());
//            prev=prev.next;
//        }
//        prev.next=null;
//        return phead.next;
//    }
//}
