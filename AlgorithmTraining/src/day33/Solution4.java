package day33;
/*
 *@Author:anran
 *@Date:2020/9/14
 *@Version 1.0
 * topK 求最大的k个数
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution4 {
    public static void main(String[] args) {
        int[] input={4,5,1,6,2,7,3,8};
        int k=4;
        for (Integer l:GetLeastNumbers_Solution(input,k)) {
            System.out.println(l);
        }
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if (input.length<=0||k>input.length||k<=0){
            return list;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for (int i = 0; i <input.length ; i++) {
            if (i<k){
                queue.offer(input[i]);
            }else {
                if (input[i]>queue.peek()){
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }
        for (int i = 0; i <k ; i++) {
            list.add(queue.poll());
        }
        return list;
    }
}
