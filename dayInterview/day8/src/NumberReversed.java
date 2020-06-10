import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/10 23:01
 * 数字颠倒
 */
public class NumberReversed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(reverse(num));
    }

    public static String reverse(int number){
        String str=String.valueOf(number);
        char[] chars=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = chars.length-1; i >=0 ; i--) {
            sb.append(chars[i]);
        }
        return String.valueOf(sb);
    }
}
