package Stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author:xiang
 * @Date:2020/4/6 22:30
 * 用队列实现栈
 */
class QueueImplementStack {
    private Queue<Integer> A=new LinkedList<>();
    private Queue<Integer> B=new LinkedList<>();
    /** Push element x onto stack. */
    public void push(int x) {
        A.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public Integer pop() {
        if (empty()){
            return null;
        }
        while (A.size()>1){
            Integer front=A.poll();
            B.offer(front);
        }
        Integer ret=A.poll();
        swapAB();
        return ret;
    }

    private void swapAB(){
        Queue<Integer> temp=A;
        A=B;
        B=temp;
    }
    /** Get the top element. */
    public Integer top() {
        if (empty()){
            return null;
        }
        while (A.size()>1){
            Integer front=A.poll();
            B.offer(front);
        }
        Integer ret=A.poll();
        B.offer(ret);
        swapAB();
        return ret;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (A.isEmpty() && B.isEmpty()) {
            return true;
        }
        return false;
    }
}
