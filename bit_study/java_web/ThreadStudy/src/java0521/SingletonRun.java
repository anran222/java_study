package java0521;

/**
 * @Author:xiang
 * @Date:2020/7/11 9:58
 * 单例模式：双重校验锁1
 */
public class SingletonRun {
    public static SingletonRun SINGLE_TON;

    /*
    /第一批次：并发的执行getInstance多个线程进入if代码块，按序执行，第一个进入的初始化对象，后序进入的，没有进入if代码，直接退出
     *第二批次：后续批次，并发的执行getInstance，不会进入if代码，直接返回已经实例化的对象，效率非常高
     */
    public static SingletonRun getInstance(){
        if (SINGLE_TON==null){
            synchronized (Singleton.class){
                if (SINGLE_TON==null){
                    SINGLE_TON=new SingletonRun();
                }
            }
        }
        return SINGLE_TON;
    }
}
