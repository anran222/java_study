package interview;

/**
 * @Author:xiang
 * @Date:2020/4/27 15:41
 * 二进制中1的个数
 */
public class NumberOfBinary1 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }

    public static int hammingWeight(int n) {
        String result=Integer.toBinaryString(n);
        char[] arr=result.toCharArray();
        int ret=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]=='1'){
                ret++;
            }
        }
        return ret;
    }
}
