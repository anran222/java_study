package interview;

/**
 * @Author:xiang
 * @Date:2020/5/24 22:51
 * 删除中间节点
 */
public class DeleteMiddleNode {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void deleteNode(ListNode node) {
        ListNode prev=new ListNode(0);
        prev.next=node;
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
