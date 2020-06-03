import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/3 18:54
 * 汽水瓶
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            if (num==0){
                break;
            }
            System.out.println(sum(num));
        }
    }

    public static int sum(int n){
        int count=0;
        while (n>=3){
            int i=n/3;
            count+=i;
            int j=n%3;
            n=i+j;
        }
        if (n==2){
            count++;
        }
        return count;
    }
}
