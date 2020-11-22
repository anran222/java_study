package day64;
/*
 *@Author:anran
 *@Date:2020/11/12
 *@Version 1.0
 */

public class Solution1 {
    public static void main(String[] args) {
        int[] array={2,3,2};
        System.out.println(uniqueAward(array));
    }

    public static int uniqueAward (int[] nums) {
        int number=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            number^=nums[i];
        }
        return number;
    }
}
