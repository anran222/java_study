package day25;
/*
 *@Author:anran
 *@Date:2020/9/4
 *@Version 1.0
 * n个数里最小的k个
 */

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");
        int k=Integer.valueOf(str1[str1.length-1]);
        PriorityQueue<Integer> queue=new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i = 0; i <str1.length-1 ; i++) {
            if (i<k){
                queue.offer(Integer.valueOf(str1[i]));
            }else {
                if (Integer.valueOf(str1[i])<queue.peek()){
                    queue.poll();
                    queue.offer(Integer.valueOf(str1[i]));
                }
            }
        }
        int[] array=new int[k];
        int i=0;
        while (!queue.isEmpty()){
            array[i]=queue.poll();
            i++;
        }
        Arrays.sort(array);
        for (int j = 0; j <k ; j++) {
            System.out.print(array[j]+" ");
        }
    }
}
