package day59;
/*
 *@Author:anran
 *@Date:2020/11/1
 *@Version 1.0
 * 判断字符是否唯一
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String astr=sc.next();
            System.out.println(isUnique(astr));
        }
    }

    public static boolean isUnique(String astr) {
        List<Character> list=new ArrayList<>();
        for (int i = 0; i <astr.length() ; i++) {
            if (list.contains(astr.charAt(i))){
                return false;
            }else {
                list.add(astr.charAt(i));
            }
        }
        return true;
    }
}
