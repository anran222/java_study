package lesson7;

import java.util.concurrent.*;

/**
 * @Author:xiang
 * @Date:2020/7/16 19:58
 * 线程池
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService pool= new ThreadPoolExecutor(//线程池：快递公司
                3,//核心线程数(正式员工)：创建好线程池，正式员工就开始取快递了
                5,//最大线程数（最多数量的员工：正式员工+临时工）
                //临时工雇佣：正式员工忙不过来，就会创建临时工
                //临时工解雇：空闲时间超出设置的时间范围，就解雇
                30,//时间数量
                TimeUnit.SECONDS,//时间单位（时间数量+时间单位表示一定范围的时间）
        new ArrayBlockingQueue<>(1000),//阻塞队列：存放包裹的仓库（存放任务的数据结构）
        new ThreadFactory(){
                    public Thread newThread(Runnable r){
                        return null;
                    }
        },//（了解）线程池创建Thread线程的工厂类，没有提供的话，就使用线程池内部默认的创建线程的方法
                new ThreadPoolExecutor.CallerRunsPolicy()//拒绝策略
        );
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("送快递到北京，A同学");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("送快递到新疆，B同学");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("我正在做事情");
            }
        });
    }
}
