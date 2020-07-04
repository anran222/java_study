import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/4 22:50
 * 数字和为sum的方法数
 */
public class SumForSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int[] arr=new int[n];
            long[] dp=new long[sum+1];
            dp[0]=1;
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
                for (int j = sum; j >=0 ; j--) {
                    if (j>=arr[i]){
                        dp[j]+=dp[j-arr[i]];
                    }
                }
            }
            System.out.println(dp[sum]);
        }
    }
}
