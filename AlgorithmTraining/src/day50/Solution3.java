package day50;
/*
 *@Author:anran
 *@Date:2020/10/8
 *@Version 1.0
 * 滑动窗口的最大值
 */

public class Solution3 {
    public static void main(String[] args) {
        int[] nums={7,2,4};
        int k=2;
        for (int i = 0; i <maxSlidingWindow(nums,k).length ; i++) {
            System.out.println(maxSlidingWindow(nums,k)[i]);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k==0||k==1){
            return nums;
        }
        int max=0;
        int count=0;
        int[] array=new int[nums.length-k+1];
        if (k>nums.length){
            return null;
        }
        for (int i = 0; i <nums.length-k+1 ; i++) {
            int max2=0;
            for (int j = i; j <i+k ; j++) {
                if (nums[j]>max2){
                    max2=nums[j];
                }
            }
            if (max2>=max){
                max=max2;
                array[count++]=max;
            }
            max=0;
        }
        return array;
    }
}
