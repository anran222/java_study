package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @Author:xiang
 * @Date:2020/4/29 22:45
 *  调整数组顺序使奇数位于偶数前面
 */
public class ParityOrder {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(exchange(nums)));
    }

    public static int[] exchange(int[] nums) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2!=0){
               stack1.push(nums[i]);
            }else {
                stack2.push(nums[i]);
            }
        }
        int[] arr=new int[stack1.size()+stack2.size()];
        int i=0;
        while (!stack1.empty()){
            arr[i]=stack1.pop();
            i++;
        }
        while (!stack2.empty()){
            arr[i]=stack2.pop();
            i++;
        }
        return arr;
    }
}
