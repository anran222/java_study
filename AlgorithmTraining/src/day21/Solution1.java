package day21;
/*
 *@Author:anran
 *@Date:2020/8/29
 *@Version 1.0
 * 汽水瓶
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换
 *多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3
 *个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以
 * 后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(sum(n));
        }
    }

    public static int sum(int num){
        if (num<3){
            return 0;
        }
        int count = 0;
        while (num>2) {
            int m = num / 3;
            int n = num % 3;
            count += m;
            num = m + n;
        }
        if (num==2){
            count+=1;
        }
        return count;
    }
}
