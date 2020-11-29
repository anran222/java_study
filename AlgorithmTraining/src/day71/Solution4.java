package day71;
/*
 *@Author:anran
 *@Date:2020/11/29
 *@Version 1.0
 *数组中出现次数超过一半的数
 */

public class Solution4 {
    public static void main(String[] args) {
        int[] array={2,2,1,1,1,2,2,1,1};
        System.out.println(majorityElement(array));
    }
    public static int majorityElement(int[] nums) {
        int num=nums[0];
        int count=1;
        for (int i = 1; i <nums.length ; i++) {
            if (num!=nums[i]){
                count--;
                if (count<0){
                    num=nums[i];
                    count=1;
                }
            }else {
                count++;
            }
        }
        return num;
    }
}
