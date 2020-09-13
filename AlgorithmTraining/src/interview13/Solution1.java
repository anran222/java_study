package interview13;
/*
 *@Author:anran
 *@Date:2020/9/13
 *@Version 1.0
 * 北京天坛
 * 北京天坛的圜丘坛为古代祭天的场所，分上、中、下三层，上层中心有一块圆形石板（称为天心石），
 * 环绕天心石砌m块扇面形石板构成第一环，向外每环依次增加m块。
 * 下一层的第一环比上一层的最后一环多m块，向外每环依次增加m块。
 * 已知每层环数相同。现给出每层的环数n和每一环比上一环增加的块数为m，求总共有多少块扇面形石板？
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            long n=sc.nextInt();
            long m=sc.nextInt();
            long result=m;
            long num=3*n;
            long sum=result;
            while (num>1){
                result+=m;
                sum+=result;
                num--;
            }
            System.out.println(sum);
        }
    }
}
