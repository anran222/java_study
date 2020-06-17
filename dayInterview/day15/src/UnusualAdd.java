/**
 * @Author:xiang
 * @Date:2020/6/17 22:59
 * 不使用四则运算符进行两个数的相加
 */
public class UnusualAdd {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        System.out.println(addAB(m,n));
    }

    public static int addAB(int A, int B) {
        if (0==B){
            return A;
        }
        int sum=A^B;
        int num=(A&B)<<1;
        return addAB(sum,num);
    }
}
