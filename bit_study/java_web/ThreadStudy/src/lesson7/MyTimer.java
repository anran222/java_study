package lesson7;


import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author:xiang
 * @Date:2020/7/17 8:56
 * 定时器
 * 1、在约定好的时间点上，执行某个任务
 * 2、间隔时间，不停地执行任务
 */
public class MyTimer {

    private BlockingQueue<MyTimerTask> queue=new PriorityBlockingQueue<>();

    public MyTimer(int count){
        for (int i = 0; i <count ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            MyTimerTask task = queue.take();
                            synchronized (queue) {
                                long current = System.currentTimeMillis();
                                if (task.next > current) {
                                    queue.wait(task.next-current);
                                    queue.put(task);
                                } else {
                                    task.task.run();
                                    if (task.period > 0) {
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
            }).start();
        }
    }

    /*
    定时任务：
    task：需要执行的任务
    delay：从当前时间需要延迟多少毫秒，执行任务
    period：间隔时间：如果<=0，就忽略掉，大于0需要间隔指定时间执行任务
    */
    public void schedule(Runnable task,long delay,long period) {
        try {
            queue.put(new MyTimerTask(task,System.currentTimeMillis()+delay,period));
            synchronized (queue){
                queue.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class MyTimerTask implements Comparable<MyTimerTask>{

        //定时任务
        private Runnable task;
        //下次执行时间
        private long next;
        //间隔时间
        private long period;

        public MyTimerTask(Runnable task, long next,long period) {
            this.task = task;
            this.next = next;
            this.period=period;
        }

        @Override
        public int compareTo(MyTimerTask o) {
            return Long.compare(next,o.next);
        }
    }

    public static void main(String[] args) {
        new MyTimer(4).schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("起床了");
            }
        },3000,1000);
    }

//    public void schedule(Runnable task,long delay,long period) {
//        try {
//            Thread.sleep(1000);
//            new Thread(task).start();
//            while (period > 0) {
//                Thread.sleep(period);
//                new Thread(task).start();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args){
//        long current=System.currentTimeMillis();
//        new MyTimer().schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("起床了");
//            }
//        },3000,1000);
//    }
}
