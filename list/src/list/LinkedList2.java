package list;

/**
 * @Author:xiang
 * @Date:2020/2/28 21:38
 * 链表操作的实现2
 */
public class LinkedList2 {
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

    //删除链表中重复的节点，返回链表头指针
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
            }else{
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }
        }
        return newTail.next;
    }

    //链表的回文结构
    public boolean chkPalindrome(ListNode A){
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
            if (next==null){
                B=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        while (B!=null){
                if (A.val==B.val){
                    return false;
                }
                A=A.next;
                B=B.next;
        }
        return true;
    }

    //输入两个链表，找出他们的第一个公共节点
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        int size1=size(headA);
        int size2=size(headB);
        if (size1>size2){
            int offset=size1-size2;
            for (int i = 0; i <offset ; i++) {
                headA=headA.next;
            }
        }else {
            int offset=size2-size1;
            for (int i = 0; i <offset ; i++) {
                headB=headB.next;
            }
        }
        while (headA!=null&&headB!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    //给定一个链表，判断链表是否有环
    public boolean hasCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    //给定一个链表返回链表开始入环的第一个节点，如果链表无环，则返回null
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                break;
            }
        }
        if (fast==null||fast.next==null){
            return null;
        }
        ListNode cur1=head;
        ListNode cur2=fast;
        while (cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
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
