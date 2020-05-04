package interview;

/**
 * @Author:xiang
 * @Date:2020/5/4 23:21
 * 青蛙跳台阶
 */
public class FrogJumps {
    public static void main(String[] args) {
        System.out.println(numWays(7));
    }

    public static int numWays(int n) {
        if (n==0){
            return 1;
        }
        if (n<=2){
            return n;
        }
        int res=0;
        int num1=1;
        int num2=2;
        for (int i = 3; i <=n ; i++) {
            res=(num1+num2)%1000000007;
            num1=num2;
            num2=res;
        }
        return res;
    }
}

