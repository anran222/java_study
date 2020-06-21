import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/21 22:43
 * DNA序列
 */
public class DNASequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int m=sc.nextInt();
        char[] chars=str.toCharArray();
        int max=0;
        int result=0;
        for (int i = 0; i <chars.length-m ; i++) {
            int count=0;
            for (int j = i; j <i+m ; j++) {
                if ('C'==chars[j]||'G'==chars[j]){
                    count++;
                }
            }
            if (count>max){
                max=count;
                result=i;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = result; i <result+m ; i++) {
            sb.append(chars[i]);
        }
        System.out.println(String.valueOf(sb));
    }
}
