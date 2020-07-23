package day4;


/**
 * @Author:xiang
 * @Date:2020/7/23 15:33
 * 反转链表:方法一
 */
class ListNode{
    int val;
    ListNode next=null;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution1 {
    public ListNode ReverseList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode left=head;
        ListNode mid=head.next;
        ListNode right=mid.next;
        while (right!=null){
            mid.next=left;
            left=mid;
            mid=right;
            right=right.next;
        }
        mid.next=left;
        head.next=null;
        head=mid;
        return head;
    }
}
