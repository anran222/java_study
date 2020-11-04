package day61;
/*
 *@Author:anran
 *@Date:2020/11/4
 *@Version 1.0
 * 删除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 */

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }

    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set=new HashSet<>();
        ListNode cur=head;
        while (cur!=null&&cur.next!=null){
            set.add(cur.val);
            if (set.contains(cur.next.val)){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}
