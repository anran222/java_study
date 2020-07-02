import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/2 23:08
 * 找X
 */
public class FindX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        boolean flag=false;
        for (int i = 0; i <n ; i++) {
            if (x==num[i]){
                flag=true;
                System.out.println(i);
                break;
            }
        }
        if (flag==false){
            System.out.println(-1);
        }
    }
}
