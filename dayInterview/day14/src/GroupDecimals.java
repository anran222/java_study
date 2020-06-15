import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/15 22:43
 * 组个最小数
 */
public class GroupDecimals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]!=0){
                System.out.print(i);
                arr[i]--;
                break;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            while (arr[i]>0){
                System.out.print(i);
                arr[i]--;
            }
        }
    }
}
