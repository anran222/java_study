package topinterview;

/**
 * @Author:xiang
 * @Date:2020/6/2 23:32
 * 找出不在序列中的那个数
 */
public class FindNum {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int max=nums[0];
        for (int i = 1; i <nums.length; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <=max ; i++) {
            sum1+=i;
        }
        for (int i = 0; i <nums.length ; i++) {
            sum2+=nums[i];
        }
        int num=sum1-sum2;
        return num;
    }
}
