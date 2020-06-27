package java0528;

import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author:xiang
 * @Date:2020/5/28 19:06
 * 自定义定时线程池
 */
public class MyScheduledThreadPool {

    //员工数
    private Thread[] threads;

    //仓库
    private PriorityBlockingQueue<MyTimeTask> queue=new PriorityBlockingQueue<>();
    public MyScheduledThreadPool(int capacity) {
        threads=new Thread[capacity];
        for (int i = 0; i <capacity ; i++) {
            threads[i]=new MyTimer(queue);
            threads[i].start();
        }
    }

    //执行任务
    public void schedule(Runnable runnable,long delay,long period){
        MyTimeTask task=new MyTimeTask(runnable,new Date().getTime()+delay,period);
        synchronized (queue) {
            queue.put(task);
            queue.notifyAll();
        }
    }
    private static class MyTimer extends Thread{
        private PriorityBlockingQueue<MyTimeTask> queue;
        public MyTimer(PriorityBlockingQueue<MyTimeTask> queue) {
            this.queue=queue;
        }

        @Override
        public void run() {
            try {
                while (true){
                    MyTimeTask task=queue.take();
                    synchronized (queue){
                        long current=System.currentTimeMillis();
                        if (current<task.next){
                            queue.wait(task.next-current);
                            queue.put(task);
                        }else {
                        task.run();
                        if (task.period>0) {
                            task.next = task.next + task.period;
                            queue.put(task);
                        }
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //定时任务
    private static class MyTimeTask implements Runnable,Comparable<MyTimeTask>{
        private Runnable runnable;
        private long next;
        private long period;
        public MyTimeTask(Runnable runnable,long next, long period) {
            this.runnable=runnable;
            this.next=next;
            this.period=period;
        }

        @Override
        public void run() {
            runnable.run();
        }

        @Override
        public int compareTo(MyTimeTask o) {
            return Long.compare(next,o.next);
        }
    }

    public static void main(String[] args) {
        MyScheduledThreadPool pool=new MyScheduledThreadPool(4);
        pool.schedule(()->{
            System.out.println("ABC");
        },0,1000);
    }
}
