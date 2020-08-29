package day21;
/*
 *@Author:anran
 *@Date:2020/8/29
 *@Version 1.0
 * 合法括号序列判断
 */

import java.util.Stack;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(heFa("())()()(((d",11));
    }

    public static boolean heFa(String A,int n){
        Stack<Character> stack=new Stack<>();
        char[] chars=A.toCharArray();
        for (int i = 0; i <n ; i++) {
            if (chars[i]=='('){
                stack.push(chars[i]);
            }else if (chars[i]==')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }else {
                    return false;
                }
        }
        if (stack.empty()){
            return true;
        }else {
            return false;
        }
    }
}
