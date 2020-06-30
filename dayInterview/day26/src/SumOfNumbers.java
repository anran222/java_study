import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/30 23:05
 * 数字之和
 */
public class SumOfNumbers {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                while(sc.hasNext()){
                    int n=sc.nextInt();
                    System.out.print(sum1(n)+" "+sum2(n));
                }
            }

            public static int sum1(int m){
                int sum=0;
                while(m>0){
                    sum+=m%10;
                    m=m/10;
                }
                return sum;
            }

            public static int sum2(int m){
                int num=m*m;
                return sum1(num);
            }
        }
