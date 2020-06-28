import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/28 23:28
 * 小易的升级之路
 */
public class XiaoyiUpgradingRoad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int[] num=new int[n];
            for (int i = 0; i <n ; i++) {
                num[i]=sc.nextInt();
            }
            for (int i = 0; i <num.length ; i++) {
                if (a>=num[i]){
                    a+=num[i];
                }else {
                    a+=gongYue(num[i],a);
                }
            }
            System.out.println(a);
        }
    }
    public static int gongYue(int a,int b){
        while (a%b>0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return b;
    }
}
