import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/10 23:14
 * 末尾0的个数
 */
public class SumZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        while (number>0){
            sum+=number/5;
            number=number/5;
        }
        System.out.println(sum);
    }
}
