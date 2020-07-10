package java0517;

/**
 * @Author:xiang
 * @Date:2020/7/10 8:31
 * 不安全的线程
 * 有一个共享变量，初识为0，启动20个线程，每个线程循环10000，每次循环将共享变量++
 */
public class UnsafeThread {
        private static int SUM;
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            new Thread(()->{
                for (int j = 0; j <10000 ; j++) {
                    SUM++;
                }
            }).start();
        }
        //所有线程执行完毕后，打印SUM得值
        while (Thread.activeCount()>1) {
            Thread.yield();//当前线程由运行态转变为就绪态
        }
            System.out.println(SUM);
    }
}
