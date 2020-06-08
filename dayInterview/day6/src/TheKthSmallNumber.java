import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/8 21:20
 * n个数里最小的k个
 */
public class TheKthSmallNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] temp = str.split(" ");
            int[] result = new int[temp.length - 1];
            int k = 0;
            for (int i = 0; i <temp.length ; i++) {
                if (i<temp.length-1){
                    result[i]=Integer.parseInt(temp[i]);
                }else {
                    k=Integer.parseInt(temp[i]);
                }
            }
            Arrays.sort(result);
            for (int i = 0; i <k ; i++) {
                if (i<k-1){
                    System.out.println(result[i]+" ");
                }else {
                    System.out.println(result[i]);
                }
            }
        }
    }

}
