import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/18 18:12
 * 句子逆序
 */
public class ReverseOrderBySentences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] s1=str.split(" ");
            int length=s1.length-1;
            StringBuilder sb=new StringBuilder();
            for (int i = length; i >0 ; i--) {
                sb.append(s1[i]+" ");
            }
            sb.append(s1[0]);
            System.out.println(String.valueOf(sb));
        }
    }
}
