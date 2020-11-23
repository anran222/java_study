package day67;
/*
 *@Author:anran
 *@Date:2020/11/23
 *@Version 1.0
 * 回文链表
 */

public class Solution4 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public boolean isPalindrome(ListNode head) {
        int[] array=new int[size(head)];
        int k=0;
        for (ListNode cur = head; cur!=null ; cur=cur.next) {
            array[k++]=cur.val;
        }
        int i=0;
        int j=array.length-1;
        while (i<j){
            if (array[i]!=array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int size(ListNode head){
        int size=0;
        ListNode cur=head;
        while (cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
}
