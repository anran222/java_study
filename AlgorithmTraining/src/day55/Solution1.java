package day55;
/*
 *@Author:anran
 *@Date:2020/10/20
 *@Version 1.0
 * 滑动窗口的最大值
 */

public class Solution1 {
    public static void main(String[] args) {
        int[] nums={9,11};
        int k=2;
        int[] array=maxSlidingWindow(nums,k);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k==0||k==1){
            return nums;
        }
        int len=nums.length;
        int[] array=new int[len-k+1];
        int c=0;
        for (int i = 0; i <nums.length-k+1 ; i++) {
            int max=nums[i];
            for (int j = i; j <i+k ; j++) {
                if (nums[j]>max){
                    max=nums[j];
                }
            }
            array[c++]=max;
        }
        return array;
    }
}
