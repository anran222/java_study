package day52;
/*
 *@Author:anran
 *@Date:2020/10/13
 *@Version 1.0
 * 0～n-1中缺失的数字
 */

public class Solution4 {
    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==mid){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }
}
