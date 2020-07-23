package day4;

/**
 * @Author:xiang
 * @Date:2020/7/23 15:45
 * 合并链表
 */
public class Solution3 {
    class ListNode{
        int val;
        ListNode next=null;
        public ListNode(int val){
            this.val=val;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode newHead=null;
        ListNode newTail=null;
        while (list1!=null&&list2!=null){
            ListNode p=new ListNode(-1);
            if (list1.val<list2.val){
                p=list1;
                list1=list1.next;
            }else {
                p=list2;
                list2=list2.next;
            }
            if (newHead==null){
                newHead=p;
                newTail=p;
            }else {
                newTail.next=p;
                newTail=newTail.next;
            }
        }
        if (list1==null){
            newTail.next=list2;
        }else {
            newTail.next=list1;
        }
        return newHead;
    }
}
