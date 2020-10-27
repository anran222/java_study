package day57;
/*
 *@Author:anran
 *@Date:2020/10/27
 *@Version 1.0
 * 珠玑妙算
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String solution=sc.next();
            String guess=sc.next();
            System.out.println(Arrays.toString(masterMind(solution,guess)));
        }
    }
    public static int[] masterMind(String solution, String guess) {
        char[] chars=solution.toCharArray();
        char[] chars1=guess.toCharArray();
        int count1=0;
        int count2=0;
        int[] array=new int[2];
        boolean[] b1=new boolean[chars.length];
        boolean[] b2=new boolean[chars1.length];
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]==chars1[i]){
                count1++;
                b1[i]=true;
                b2[i]=true;
            }
        }
        for (int i = 0; i <chars.length ; i++) {
            for (int j = 0; j <chars1.length ; j++) {
                if (chars[i]==chars1[j]&&b1[i]==false&&b2[j]==false){
                    count2++;
                    b1[i]=true;
                    b2[j]=true;
                }
            }
        }
        array[0]=count1;
        array[1]=count2;
        return array;
    }
}
