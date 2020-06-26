import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/26 15:11
 *统计每个月兔子的总数
 */
public class TheNumberOfRabbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int month=sc.nextInt();
            System.out.println(getTotalCount(month));
        }
    }

    public static int getTotalCount(int monthCount){
        if (monthCount==0){
            return 0;
        }
        if (monthCount==1){
            return 1;
        }else if (monthCount==2){
            return 1;
        } else {
            return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
        }
    }
}
