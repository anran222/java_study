import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/15 23:03
 * 尼科彻斯定理
 */
public class NicochesTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num=sc.nextInt();
            System.out.println(GetSequeOddNum(num));
        }
    }

    public static String GetSequeOddNum(int m){
        int sum=m*(m-1)+1;
        StringBuilder sb=new StringBuilder();
        sb.append(sum);
        for (int i = 0; i <m-1 ; i++) {
            sum+=2;
            sb.append("+").append(sum);
        }
        return String.valueOf(sb);
    }
}
