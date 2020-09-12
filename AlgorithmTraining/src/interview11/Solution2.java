package interview11;
/*
 *@Author:anran
 *@Date:2020/9/12
 *@Version 1.0
 * 根据中序和后序求先序
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            xianxu(str1, str2);
            System.out.println(new String(sb));
        }
    }

    static StringBuilder sb = new StringBuilder();

    public static void xianxu(String str1, String str2) {
        if (str1.length() == 0 && str2.length() == 0) {
            return;
        }
        int len = str2.length();
        String str3 = str2.substring(str2.length() - 1);
        sb.append(str3);
        int count = str1.indexOf(str3);
        if (count > 0) {
            xianxu(str1.substring(0, count), str2.substring(0, count));
        }
        if (len > 1) {
            xianxu(str1.substring(count + 1, len), str2.substring(count, len - 1));
        }
    }
}
