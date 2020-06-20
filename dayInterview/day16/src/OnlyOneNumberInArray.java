import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/20 20:27
 * 在数组中只出现一次的数字
 */
public class OnlyOneNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.remove(arr[i]);
            }else {
                map.put(arr[i],1);
            }
        }
        int[] m=new int[map.size()];
        int i=0;
        for (Integer k:map.keySet()) {
            m[i]=k;
            i++;
        }
        Arrays.sort(m);
        for (int j = 0; j <m.length ; j++) {
            System.out.print(m[j]+" ");
        }
    }
}
