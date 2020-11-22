package day66;
/*
 *@Author:anran
 *@Date:2020/11/22
 *@Version 1.0
 * 两数相加
 */

public class Solution4 {
      class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode head = new ListNode(-1);
          ListNode tail = head;
          ListNode cur1 = l1;
          ListNode cur2 = l2;
          boolean flag = false;
          while (cur1 != null && cur2 != null) {
              int num = cur1.val + cur2.val;
              if (flag == true) {
                  num += 1;
              }
              if (num < 10) {
                  tail.next = new ListNode(num);
                  flag=false;
              } else {
                  tail.next = new ListNode(num % 10);
                  flag = true;
              }
              cur1 = cur1.next;
              cur2 = cur2.next;
              tail = tail.next;
          }
          while (cur1 != null) {
              if (flag == true) {
                  if (cur1.val + 1 < 10) {
                      tail.next = new ListNode(cur1.val + 1);
                      cur1 = cur1.next;
                      tail = tail.next;
                      flag=false;
                  } else {
                      flag = true;
                      tail.next = new ListNode((cur1.val+1)%10);
                      cur1 = cur1.next;
                      tail = tail.next;
                  }
              } else {
                  flag=false;
                  tail.next = cur1;
                  cur1 = cur1.next;
                  tail = tail.next;
              }
          }
          while (cur2 != null) {
              if (flag == true) {
                  if (cur2.val + 1 < 10) {
                      tail.next = new ListNode(cur2.val + 1);
                      cur2 = cur2.next;
                      tail = tail.next;
                      flag=false;
                  } else {
                      flag = true;
                      tail.next = new ListNode((cur2.val+1)%10);
                      cur2 = cur2.next;
                      tail = tail.next;
                  }
              } else {
                  flag = false;
                  tail.next = cur2;
                  cur2 = cur2.next;
                  tail = tail.next;
              }
          }
          if (flag==true){
              tail.next=new ListNode(1);
          }
          return head.next;
      }
}
