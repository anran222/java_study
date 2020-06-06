import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/6 14:51
 * 买苹果
 */
public class BuyApple {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
        System.out.println(num(n));
    }
    public static int num(int n) {
        int num1 = n / 8;
        int num2 = n / 6;
        if (n%8==0){
            return n/8;
        }else if (n%6==0){
            return n/6;
        }else if ((n % 8 == 0) && (n % 6 == 0)) {
            return n / 8;
        } else {
            for (int i = 0; i < num1; i++) {
                int sum = 0;
                int sum1 = i * 8;
                for (int j = 0; j < num2; j++) {
                    int sum2 = j * 6;
                    if (sum1 + sum2 == n) {
                        sum = i + j;
                        return sum;
                    }
                }
            }
        }
        return -1;
    }
}
