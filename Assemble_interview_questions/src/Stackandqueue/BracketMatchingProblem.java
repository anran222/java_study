package Stackandqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author:xiang
 * @Date:2020/4/6 21:35
 * 括号匹配问题
 */
public class BracketMatchingProblem {
    public static void main(String[] args) {

        String s="(){}[]";
        System.out.println(isVaildTwo(s));
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='('||c=='{'||c=='['){
                stack.push(c);
                continue;
            }
            if (stack.empty()){
                return false;
            }
            char top=stack.pop();
            if (map.get(top)==c){
                continue;
            }
            return false;
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }

    public static boolean isVaildTwo(String s){
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='('||c=='{'||c=='['){
                stack.push(c);
                continue;
            }
            if (stack.empty()){
                return false;
            }
            char top=stack.pop();
            if (top=='('&&c==')'){
                continue;
            }
            if (top=='{'&&c=='}'){
                continue;
            }
            if (top=='['&&c==']'){
                continue;
            }
            return false;
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }
}
