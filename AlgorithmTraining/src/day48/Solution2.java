package day48;
/*
 *@Author:anran
 *@Date:2020/10/6
 *@Version 1.0
 * 数组中的逆序对
 */

public class Solution2 {
    public static void main(String[] args) {
        int[] nums={7,5,6,4};
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {
        int count=0;
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = nums.length-1; j >i ; j--) {
                if (nums[j]<nums[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
