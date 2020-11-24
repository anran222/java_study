package day68;
/*
 *@Author:anran
 *@Date:2020/11/24
 *@Version 1.0
 * 合法括号序列判断
 */

import java.util.Scanner;
import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String A=sc.next();
            int n=sc.nextInt();
            System.out.println(chkParenthesis(A,n));
        }
    }
    public static boolean chkParenthesis(String A, int n) {
        for (int i = 0; i <A.length() ; i++) {
            if (A.charAt(i)!='('&&A.charAt(i)!=')'){
                return false;
            }
        }
        char[] chars=A.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='('){
                stack.push(chars[i]);
            }else {
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
