package day24;
/*
 *@Author:anran
 *@Date:2020/9/3
 *@Version 1.0
 * 计算糖果
 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
 * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
 */

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int x3=sc.nextInt();
            int x4=sc.nextInt();
            double a=(x1+x3)/2;
            double b=(x2+x4)/2;
            double c=(x4-x2)/2;
            if (a-((x1+x3)/2)!=0){
                System.out.println("No");
                break;
            }
            if (b-((x2+x4)/2)!=0||b!=((x3-x1)/2)){
                System.out.println("No");
                break;
            }
            if (c-((x4-x2)/2)!=0){
                System.out.println("No");
                break;
            }
            System.out.println((int)a+" "+(int)b+" "+(int)c);
        }
    }
}
