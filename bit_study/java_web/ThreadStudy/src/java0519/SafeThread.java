package java0519;

/**
 * @Author:xiang
 * @Date:2020/7/10 14:03
 * 安全的线程
 */
public class SafeThread {
    private static int SUM;

    public static synchronized void increment(int n){
        SUM++;
    }
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            new Thread(()->{
                for (int j = 0; j <10000 ; j++) {
                    increment(j);
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
