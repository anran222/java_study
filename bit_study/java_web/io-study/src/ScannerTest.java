import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/1 17:05
 * 测试Scanner
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //假设输入为：
        //4
        // 3    1   10  31
        int num=sc.nextInt();//读取到io数据直到满足条件，否则阻塞等待
        for (int i = 0; i < num; i++) {
            int data=sc.nextInt();
            System.out.println(data);
        }
    }
}
