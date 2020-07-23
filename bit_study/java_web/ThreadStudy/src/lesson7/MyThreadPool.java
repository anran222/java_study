package lesson7;

import lesson6.MyBlockingQueue;

/**
 * @Author:xiang
 * @Date:2020/7/17 8:41
 *自己建立一个线程池
 */
public class MyThreadPool {

    private MyBlockingQueue<Runnable> queue;

    public MyThreadPool(int size,int capacity){
        queue=new MyBlockingQueue<>(capacity);
        //创建正式员工
        for (int i = 0; i <size ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //正式员工一直运行
                        while (true){
                            Runnable task=queue.take();
                            task.run();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void execute(Runnable task){
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThreadPool pool=new MyThreadPool(5,100);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        });
    }
}
