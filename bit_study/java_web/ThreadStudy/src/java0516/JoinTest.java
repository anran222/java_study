package java0516;

/**
 * @Author:xiang
 * @Date:2020/7/6 16:24
 * 测试join（）
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            try {
                Thread.sleep(3000);
                System.out.println("Thread baby");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        t.join(1000);//可以调整传入参数
        System.out.println("main");
    }
}
