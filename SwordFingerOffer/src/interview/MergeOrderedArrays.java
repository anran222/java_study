package interview;

/**
 * @Author:xiang
 * @Date:2020/4/27 15:11
 * 合并两个排序的链表
 */
public class MergeOrderedArrays {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode newNode=new ListNode(-1);
        ListNode newTail=newNode;
        ListNode node1=l1;
        ListNode node2=l2;
        while (node1!=null&&node2!=null){
            if (node1.val<node2.val){
                newTail.next=node1;
                newTail=newTail.next;
                node1=node1.next;
            }else {
                newTail.next=node2;
                newTail=newTail.next;
                node2=node2.next;
            }
        }
        if (node1==null){
            newTail.next=node2;
        }
        if (node2==null){
            newTail.next=node1;
        }
        return newNode.next;
    }
}
