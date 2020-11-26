package day69;
/*
 *@Author:anran
 *@Date:2020/11/26
 *@Version 1.0
 * 用两个栈实现队列
 */

import java.util.LinkedList;
import java.util.Stack;

public class Solution2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    LinkedList<Integer> queue=new LinkedList<>();

    public void push(int node) {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()){
            queue.add(stack2.pop());
        }
    }

    public int pop() {
        while (stack1.size()>1){
            stack2.push(stack1.pop());
        }
        int num=stack1.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return num;
    }
    }
