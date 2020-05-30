package interview;

/**
 * @Author:xiang
 * @Date:2020/5/30 22:34
 * 统计位数为偶数的数字
 */
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if (cout(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }

    public static int cout(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
