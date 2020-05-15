package zuoye.list3;

import java.util.Stack;

/**
 * @Author:xiang
 * @Date:2020/5/15 23:21
 * 逆波兰表达式求值
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens={"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (String s:tokens) {
            if (s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if (s.equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }else if (s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if (s.equals("/")){
                int num=stack.pop();
                stack.push(stack.pop()/num);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
