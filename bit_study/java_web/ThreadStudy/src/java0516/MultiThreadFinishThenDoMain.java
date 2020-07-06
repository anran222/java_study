package java0516;

/**
 * @Author:xiang
 * @Date:2020/7/6 16:34
 * 同时随机运行多个线程,等所有执行完毕，再执行main
 */
public class MultiThreadFinishThenDoMain {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[20];
        for (int i = 0; i <20 ; i++) {
            final int j=i;
            Thread t=new Thread(()->{
                System.out.println(j);
            });
            t.start();
            threads[i]=t;
        }
        for (int i = 0; i <20 ; i++) {
            threads[i].join();
        }
        System.out.println("main");
    }
}
