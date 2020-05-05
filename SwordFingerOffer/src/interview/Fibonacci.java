package interview;

/**
 * @Author:xiang
 * @Date:2020/5/5 22:50
 * 斐波那契数列
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int num1=0;
        int num2=1;
        int res=0;
        for (int i = 2; i <=n ; i++) {
            res=(num1+num2)%1000000007;
            num1=num2;
            num2=res;
        }
        return res;
    }
}
