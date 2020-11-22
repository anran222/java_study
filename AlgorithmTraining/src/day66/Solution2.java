package day66;
/*
 *@Author:anran
 *@Date:2020/11/22
 *@Version 1.0
 * 寻找第k大
 */

import java.util.PriorityQueue;

public class Solution2 {
    public static void main(String[] args) {
        int[] a={1,3,5,2,2};
        int n=5;
        int k=3;
        System.out.println(findKth(a,n,k));
    }

    public static int findKth(int[] a, int n, int K) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for (int i = 0; i <n ; i++) {
            if (i<K){
                queue.offer(a[i]);
            }else {
                if (a[i]>queue.peek()){
                    queue.poll();
                    queue.offer(a[i]);
                }
            }
        }
        int num=queue.poll();
        return num;
    }
}
