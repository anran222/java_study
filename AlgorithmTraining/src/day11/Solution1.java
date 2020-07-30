package day11;

/**
 * @Author:xiang
 * @Date:2020/7/30 21:56
 * 斐波那契数列递归与非递归实现
 */
public class Solution1 {
    public int Fibonacci(int n) {
//        if (n==0){
//            return 0;
//        }
//        if (n==1){
//            return 1;
//        }
//        return Fibonacci(n-1)+Fibonacci(n-2);
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int f1=0;
        int f2=1;
        int result=0;
        for (int i = 2; i <=n ; i++) {
            result=f1+f2;
            f1=f2;
            f2=result;
        }
        return result;
    }
}
