/**
 * @Author:xiang
 * @Date:2020/6/3 19:14
 * 数组中的逆序队
 */
public class AntiOrder {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,0};
        System.out.println(count(A,8));
    }

    public static int count(int[] A, int n) {
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                if (A[j]>A[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
