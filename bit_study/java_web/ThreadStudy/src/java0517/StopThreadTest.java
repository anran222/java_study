package java0517;

/**
 * @Author:xiang
 * @Date:2020/7/6 18:47
 * 测试中断线程
 */
public class StopThreadTest {

    private volatile static boolean IS_STOP;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            try {
            while (!IS_STOP){
                System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }).start();
        Thread.sleep(3000);
        IS_STOP=true;

    }
}
