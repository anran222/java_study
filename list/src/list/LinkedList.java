package list;

import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/2/28 21:38
 * 链表操作的实现1
 */
public class LinkedList {
    //创建链表
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val=val;
        }
    }

    //删除链表中所有值等于val的元素
    public ListNode removeElement(ListNode head,int val){
        if (head==null){
            return null;
        }
        ListNode prev=head;
        ListNode cur=head.next;
        while (cur!=null){
            if (cur.val==val){
                prev.next=cur.next;
                cur=prev.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if (head.val==val){
            head=head.next;
        }
        return head;
    }

    //反转一个单链表
    public ListNode reverseList(ListNode head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode cur=head;
        ListNode prev=null;
        while (cur!=null){
            ListNode next=cur.next;
            if (next==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return newHead;
    }

    //给定一个带头结点head的非空单链表，返回链表的中间节点。如果有两个节点，则返回第二个中间节点
    public ListNode middleNode(ListNode head){
            int steps=size(head)/2;
            ListNode cur=head;
        for (int i = 0; i <steps ; i++) {
            cur=cur.next;
        }
        return cur;
    }

    //输入一个链表，输出该链表中倒数第k个节点
    public ListNode FindKthTotail(ListNode head,int k){
        if (head==null){
            return null;
        }
        int size=size(head);
        if (k<=0||k>size){
            return null;
        }
        int steps=size-k;
        ListNode cur=head;
        for (int i = 0; i <steps ; i++) {
            cur=cur.next;
        }
        return cur;
    }

    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while (cur1!=null&&cur2!=null){
            if (cur1.val<cur2.val){
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else {
                newTail=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        if (cur1==null){
            newTail.next=cur2;
        }else {
            newTail.next=cur1;
        }
        return newTail.next;
    }

    //以给定值为基准将链表分割成两部分，所有小于x的节点排在大于或等于x的节点之前
    public ListNode partition(ListNode phead,int x){
        if (phead==null){
            return null;
        }
        if (phead.next==null){
            return phead;
        }
        ListNode bigHead=new ListNode(-1);
        ListNode bigTail=bigHead;
        ListNode smallHead=new ListNode(-1);
        ListNode smallTail=smallHead;
        for(ListNode cur=phead;cur!=null;cur=cur.next){
            if (cur.val<x){
                smallTail.next=new ListNode(cur.val);
                smallTail=smallTail.next;
            }else {
                bigTail.next=new ListNode(cur.val);
                bigTail=bigTail.next;
                }
            }
        smallTail.next=bigHead.next;
        return smallHead.next;
    }

    //求链表长度
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
