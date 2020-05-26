package java0526;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author:xiang
 * @Date:2020/5/26 18:58
 * 线程和线程池
 */
public class ThreadVsThreadPool {
    public static void main(String[] args) {
        //不创建线程发送快递
        System.out.println("送快递去上海");
        System.out.println("送快递去北京");
        System.out.println("处理自己的事务");

        //使用线程送快递
        new Thread(()->{
            System.out.println("送快递到上海");
        }).start();
        new Thread(()->{
            System.out.println("送快递到北京");
        }).start();
        new Thread(()->{
            System.out.println("处理自己的事务");
        }).start();

        //3、使用线程池送快递
        /*
         * 创建线程池对象，开了一家快递公司，专门处理送快递的业务
         */
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                4,    //核心线程数：快递公司的正式员工--线程数
                10,  //最大线程数：总员工（正式工加临时工）--线程
                //临时工加空闲时间：正式员工数量不够处理任务时，招聘临时工，临时工超过最大的空闲时间，就解雇
                60,  //空闲时间数
                TimeUnit.SECONDS,  //时间单位
                new ArrayBlockingQueue<>(1000),  //阻塞队列：快递公司的仓库，保存快递包裹----存放线程的容器
                new ThreadFactory() {//匿名内部类
                    @Override
                    public Thread newThread(Runnable r) {    // 线程工厂类：快递公司招聘标准--创建线程的方式
                        return new Thread(r);
                    }
                },
                new ThreadPoolExecutor.AbortPolicy() //抛异常的方式                  new ThreadPoolExecutor.AbortPolicy() //抛异常的方式

                /*
                 new ThreadPoolExecutor.CallerRunsPolicy()  //谁把包裹交给我的，让他自己取送   直接在 execute方法的调用线程中运行被拒绝的任务，除非执行程序已关闭，在这种情况下，任务将被丢弃。
                new ThreadPoolExecutor.DiscardOldestPolicy()   //把仓库中最旧的包裹丢弃   丢弃最旧的未处理请求，然后重试 execute ，除非执行程序关闭，在这种情况下，任务将被丢弃。
                new ThreadPoolExecutor.DiscardPolicy()    //把仓库中最新的包裹丢弃   以静默方式丢弃被拒绝的任务。
                 */
        );
        pool.execute(()->{   //创建了一个送快递的任务，把快递包裹交给快递公司
            System.out.println("送快递到上海");
        });
        pool.execute(()->{
            System.out.println("送快递到北京");
        });
        pool.execute(()->{
            System.out.println("处理自己的事务");
        });
    }
}
