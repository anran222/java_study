package interview;

/**
 * @Author:xiang
 * @Date:2020/5/7 22:23
 * 动态规划求丑数
 */
public class UglyNumber2 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        if (n<0){
            return 0;
        }
        int[] arr=new int[n];
        arr[0]=1;
        int p2=0;
        int p3=0;
        int p5=0;
        for (int i = 1; i <n ; i++) {
            int max=arr[i-1];
            while (max>=arr[p2]*2){
                p2++;
            }
            while (max>=arr[p3]*3){
                p3++;
            }
            while (max>=arr[p5]*5){
                p5++;
            }
            arr[i]=Math.min(Math.min(arr[p2]*2,arr[p3]*3),arr[p5]*5);
        }
        return arr[n-1];
    }
}
