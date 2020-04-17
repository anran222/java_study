package interview;

import java.util.WeakHashMap;

/**
 * @Author:xiang
 * @Date:2020/4/17 22:37
 * 链表的回文结构
 */
public class Palindrome {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public boolean chkPalindrome(ListNode A) {
        int size=size(A);
        int steps=size/2;
        ListNode B=A;
        for (int i = 0; i <steps ; i++) {
            B=B.next;
        }
        ListNode prev=null;
        ListNode cur=B;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        while (prev!=null){
            if (A.val!=prev.val){
                return false;
            }
            A=A.next;
            prev=prev.next;
        }
        return true;
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
