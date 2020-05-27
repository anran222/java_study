package interview;

/**
 * @Author:xiang
 * @Date:2020/5/27 14:58
 * 整数的各位积和之差
 */
public class DifferenceOfProductSum {
    public static void main(String[] args) {
        int n=234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int num=0;
        num=product(n)-sum(n);
        return num;
    }

    public static int product(int num){
        int sum=1;
        while (num>0){
            sum=(num%10)*sum;
            num=num/10;
        }
        return sum;
    }

    public static int sum(int num){
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}
