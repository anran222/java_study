import java.util.*;

/**
 * @Author:xiang
 * @Date:2020/6/6 15:19
 * 删除公共字符
 * */
public class RemovePublicChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(remove(a,b));
    }

    public static String remove(String A,String B){
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        Stack stack=new Stack();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <a.length ; i++) {
            stack.push(a[i]);
        }
        for (int i = 0; i <b.length ; i++) {
            stack.removeAll(Collections.singleton(b[i]));
        }
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return String.valueOf(sb.reverse());
    }
}
