package day30;
/*
 *@Author:anran
 *@Date:2020/9/9
 *@Version 1.0
 * 尼科彻斯定理
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(str(n));
        }
    }
    public static String str(int n){
        int m=n*n*n;
        StringBuilder sb=new StringBuilder();
        int num=n*(n-1)+1;
        if (num==m){
            sb.append(num);
            return new String(sb);
        }
        int index=0;
        Queue<Integer> queue=new LinkedList<>();
        int sum=num;
        queue.offer(num);
        while (sum!=m){
            index=num+2;
            queue.offer(index);
            num=index;
            sum+=index;
        }
       while (queue.size()>1){
           sb.append(queue.poll()).append("+");
       }
       sb.append(queue.poll());
        return new String(sb);
    }
}
