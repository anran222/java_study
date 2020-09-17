package day35;
/*
 *@Author:anran
 *@Date:2020/9/16
 *@Version 1.0
 * 链式A+B
 */

public class Solution3 {

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }

    public static ListNode plusAB(ListNode a, ListNode b) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (ListNode a1 = a;  a1!=null ; a1=a1.next) {
            sb1.append(a1.val);
        }
        for (ListNode b1=b; b1!=null ; b1=b1.next) {
            sb2.append(b1.val);
        }
        int num1=Integer.parseInt(new String(sb1.reverse()));
        int num2=Integer.parseInt(new String(sb2.reverse()));
        int result=num1+num2;
        ListNode listNode=new ListNode(-1);
        ListNode listTail=listNode;
        while (result>0){
            listTail.next=new ListNode(result%10);
            listTail=listTail.next;
            result /=10;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(2);
        ListNode f=new ListNode(1);
        a.next=b;
        b.next=c;
        d.next=e;
        e.next=f;
        plusAB(a,d);
    }
}
