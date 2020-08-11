package interview2;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(count(n,s));
    }

    public static int count(int n,String s) {
        char[] chars = s.toCharArray();
        if (huiwen(s)) {
            return 0;
        }
        int flag = 0;
        if (n % 2 != 0) {
            flag = n / 2;
            int i = 0;
            int j = chars.length - 1;
            int count = 0;
            while (i < j) {
                if (chars[i] != chars[j]) {
                    count++;
                    i++;
                    j--;
                }
            }
            return count;
        } else {
            flag = n / 2;
            int i = 0;
            int j = chars.length - 1;
            int count = 0;
            if (chars[flag - 1] != chars[flag]) {
                count++;
            }
            while (i <=(flag-1)&&j>=flag) {
                if (chars[i] != chars[j]) {
                    count++;
                    i++;
                    j--;
                }
            }
            count++;
            return count;
        }
    }

    public static boolean huiwen(String s){
        char[] chars=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = chars.length-1; i >=0 ; i--) {
            sb.append(chars[i]);
        }
        String str=new String(sb);
        if (str.equals(s)){
            return true;
        }
        return false;
    }
}
