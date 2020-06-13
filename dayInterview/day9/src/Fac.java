import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/13 18:47
 * 斐波那切数的变换
 */
public class Fac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0;
        int f2=1;
        int f3=f1+f2;
        while (true){
            if (f2==n){
                System.out.println(0);
            }else if(f2>n){
                if (Math.abs(f2-n)>Math.abs(f1-n)){
                    System.out.println(Math.abs(f1-n));
                }else {
                    System.out.println(Math.abs(f2-n));
                }
                break;
            }
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }
    }
}
