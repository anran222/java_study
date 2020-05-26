package java0526;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author:xiang
 * @Date:2020/5/26 21:04
 * 自定义线程池
 */
public class MyThreadPool {

    private BlockingQueue<Runnable> queue;

    public MyThreadPool(int corePoolSize,int capacity){
        queue =new ArrayBlockingQueue<>(capacity);
        for (int i = 0; i <corePoolSize ; i++) {
            new MyTgread(queue).start();
        }
    }

    public void execute(Runnable task){
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class MyTgread extends Thread{
        private BlockingQueue<Runnable> queue;
        public MyTgread(BlockingQueue<Runnable> queue) {
            this.queue=queue;
        }

        @Override
        public void run() {
            try {
                while (true){
                    Runnable task=queue.take();
                    task.run();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
