package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Author:xiang
 * @Date:2020/7/26 14:26
 * topK问题
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        if (input==null||k<=0||k>input.length){
            return result;
        }
        PriorityQueue<Integer> list=new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i = 0; i <input.length ; i++) {
            if (i<k){
                list.offer(input[i]);
            }else {
                if (input[i]<list.peek()){
                    list.poll();
                    list.offer(input[i]);
                }
            }
        }
        for (int i = 0; i <k ; i++) {
            result.add(list.poll());
        }
        return result;
    }
}
