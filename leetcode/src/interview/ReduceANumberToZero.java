package interview;

/**
 * @Author:xiang
 * @Date:2020/5/26 22:33
 * 将数字变为0的操作步数
 */
public class ReduceANumberToZero {
    public static void main(String[] args) {
        int num=8;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps (int num) {
        int count=0;
        while (num!=0){
            if (num%2==0){
                num=num/2;
                count++;
            }else {
                num=num-1;
                count++;
            }
        }
        return count;
    }
}
