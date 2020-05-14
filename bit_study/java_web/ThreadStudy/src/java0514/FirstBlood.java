package java0514;

/**
 * @Author:xiang
 * @Date:2020/5/14 19:54
 * 测试多线程
 */
public class FirstBlood {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(99999999999l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"第一滴血").start();
        Thread.sleep(99999999999l);
    }
}
