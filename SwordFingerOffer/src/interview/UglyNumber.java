package interview;

/**
 * @Author:xiang
 * @Date:2020/5/7 22:23
 * 暴力法求丑数
 */
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        int count=0;
        int i=1;
        while (count<n){
            if (isUglyNumber(i)) {
                count++;
            }
            i++;
        }
        return i-1;
    }

    public static boolean isUglyNumber(int n){
        while (n%2==0){
            n=n/2;
        }
        while (n%3==0){
            n=n/3;
        }
        while (n%5==0){
            n=n/5;
        }
        if (n==1){
            return true;
        }
        return false;
    }
}
