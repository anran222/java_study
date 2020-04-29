package interview;

/**
 * @Author:xiang
 * @Date:2020/4/29 23:06
 * 圆圈中最后剩下的数字
 */
public class JosephRingProblem {
    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));
    }

    public static int lastRemaining(int n, int m) {
        int ans=0;
        for (int i = 2; i <=n ; i++) {
            ans=(ans+m)%i;
        }
        return ans;
    }
}
