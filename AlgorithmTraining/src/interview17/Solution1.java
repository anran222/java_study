package interview17;
/*
 *@Author:anran
 *@Date:2020/9/20
 *@Version 1.0
 * 六位数
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count=0;
            for (int i = m; i <=n ; i++) {
                if (panduan(i)==true){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean panduan(int n){
        String str=String.valueOf(n);
        char[] chars=str.toCharArray();
        int[] array=new int[chars.length];
        for (int i = 0; i <array.length ; i++) {
            array[i]=chars[i]-'0';
        }
        if ((array[0]!=array[1]&&(array[0]!=array[2]))&&(array[0]!=array[3])&&(array[0]!=array[4])&&array[0]!=array[5]
        &&(array[1]!=array[2])&&(array[1]!=array[3])&&(array[1]!=array[4])&&(array[1]!=array[5])
        &&(array[2]!=array[3])&&(array[2]!=array[4]&&(array[2]!=array[5]))
        &&(array[3]!=array[4])&&(array[3]!=array[5])
        &&(array[4]!=array[5])&&(((array[0]*10+array[1])+(array[2]*10+array[3]))==(array[4]*10+array[5]))){
            return true;
        }else {
            return false;
        }
    }
}
