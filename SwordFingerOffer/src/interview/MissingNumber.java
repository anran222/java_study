package interview;

/**
 * @Author:xiang
 * @Date:2020/5/4 23:09
 * 0～n-1中缺失的数字
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
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
