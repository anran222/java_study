package java0517;

/**
 * @Author:xiang
 * @Date:2020/7/6 19:04
 * 测试Interrupt
 */
public class InterruptThreadTest {
    public static void main(String[] args) throws InterruptedException {
            Thread t=new Thread(()->{
                try {
                    while (!Thread.interrupted()){
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(1000000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
            Thread.sleep(3000);
            t.interrupt();
        }
}
