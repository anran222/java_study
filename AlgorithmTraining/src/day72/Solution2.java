package day72;
/*
 *@Author:anran
 *@Date:2020/12/1
 *@Version 1.0
 * n个数里最小的k个
 */

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String string=sc.nextLine();
            String[] s=string.split(" ");
            int len=s.length;
            int[] array=new int[len];
            for (int i = 0; i <len ; i++) {
                array[i]=Integer.parseInt(s[i]);
            }
            int k=array[len-1];
            PriorityQueue<Integer> queue=new PriorityQueue<>(k, Collections.reverseOrder());
            for (int i = 0; i <len-1 ; i++) {
                if (i<k){
                    queue.offer(array[i]);
                }else {
                    if (array[i]<queue.peek()){
                        queue.poll();
                        queue.offer(array[i]);
                    }
                }
            }
            int[] num=new int[k];
            int i=0;
            while (!queue.isEmpty()){
                num[i++]=queue.poll();
            }
            for (int j = num.length-1; j >=0 ; j--) {
                System.out.print(num[j]+" ");
            }
        }
    }
}
