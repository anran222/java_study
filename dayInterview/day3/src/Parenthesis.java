import java.util.Stack;

/**
 * @Author:xiang
 * @Date:2020/6/4 21:54
 * 合法序列判断
 */
public class Parenthesis {
    public static void main(String[] args) {
        String A="()(()()";
        System.out.println(chkParenthesis(A,6));
    }

    public static boolean chkParenthesis(String A,int n){
        char[] chars=A.toCharArray();
        Stack <Character> stack=new Stack<>();
        for (int i = 0; i <n ; i++) {
            if (chars[i]=='('){
                stack.push(chars[i]);
            }else if (chars[i]==')'){
                if ((!stack.empty())&&(stack.peek()=='(')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
