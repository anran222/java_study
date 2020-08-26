package java15_0325;
/*
 *@Author:anran
 *@Date:2020/8/25
 *@Version 1.0
 * 用链表实现队列
 */

public class MyQueueByLinkedList {

    static class Node{
        public int val;
        Node next=null;

        public Node(int val) {
            this.val = val;
        }
    }

    //创建一个链表就得有头结点,此时head不是傀儡节点
    //基于链表实现队列，可以入队列从尾部插入，出队列从头部删除；也可以入队列从头部插入，出队列从尾部删除
    private Node head=null;
    private Node tail=null;

    //入队列(尾部入队列，头部出队列)
    public void offer(int val){
        Node newNode=new Node(val);
        if (head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        //如果当前不是空链表
        tail.next=newNode;
        tail=tail.next;
    }

    //出队列
    public Integer poll(){
        //如果当前队列是空队列，再去poll显然不科学
        if (head==null){
            //如果出队列失败，返回一个错误值
            return -1;
        }
        int ret=head.val;
        head=head.next;
        if (head==null){
            //如果删除之后,队列变成了空的队列
            tail=null;
        }
        return ret;
    }

    //取队首元素
    public Integer peek(){
        if (head==null){
            return null;
        }
        return head.val;
    }

}
