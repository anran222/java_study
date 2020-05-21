package java0516;

/**
 * @Author:xiang
 * @Date:2020/5/21 14:34
 * 测试多线程
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第一滴血");
            }
        },"子线程Thread baby").start();
        System.out.println("main");
        for (int i = 0; i <5 ; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName());
            }).start();
        }
    }
}
