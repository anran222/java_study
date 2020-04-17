package interview;

/**
 * @Author:xiang
 * @Date:2020/4/17 22:09
 * 删除有序链表中的重复节点
 */
public class DeleteDuplication {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead){
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur=pHead;
        while (cur!=null){
            if (cur.next!=null&&cur.val==cur.next.val){
                while (cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else {
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }
        }
        return newTail.next;
    }
}
