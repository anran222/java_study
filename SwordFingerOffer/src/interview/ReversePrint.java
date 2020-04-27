package interview;

import java.util.Stack;

/**
 * @Author:xiang
 * @Date:2020/4/27 11:52
 * 从尾到头打印链表
 */
public class ReversePrint {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode cur=head;
        while (cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        int size=stack.size();
        int[] arr=new int[size];
        int i=0;
        while (!stack.empty()){
            arr[i]=stack.pop().val;
            i++;
        }
        return arr;
    }
}
