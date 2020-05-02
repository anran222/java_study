package interview;

/**
 * @Author:xiang
 * @Date:2020/5/2 21:38
 * 不用加减乘除做加法
 */
public class BitwiseAddition {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        System.out.println(add(a,b));
    }

    public static int add(int a, int b) {
        while (b!=0){
            int temp=a^b;
            b=(a&b)<<1;
            a=temp;
        }
        return a;
    }
}
