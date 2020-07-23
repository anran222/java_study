package lesson6;

/**
 * @Author:xiang
 * @Date:2020/7/16 15:35
 * 实现阻塞式队列
 * 1、满足线程安全的生产、消费功能
 * 2、生产、消费达到上限/下限时，需要阻塞等待
 */
public class MyBlockingQueue<E> {

    private Object[] items;

    private int takeIndex;//弹出元素的索引
    private int putIndex;//添加元素的索引
    private int size;//有效容量

    public MyBlockingQueue(int capacity){
        items=new Object[capacity];
    }

    public synchronized void put(E e) throws InterruptedException {
        while (size==items.length){//达到上限，需要等待
            wait();
        }
        putIndex=(putIndex+1)%items.length;//存放元素的索引++
        items[putIndex]=e;//存放元素
        size++;
        notifyAll();
    }

    public synchronized E take() throws InterruptedException {
        while (size==0){//达到下限，需要等待
            wait();
        }
        takeIndex=(takeIndex+1)%items.length;
        size--;
        notifyAll();
        return (E) items[takeIndex];
    }

    private static int SUM;

    private static class Producer implements Runnable{
        @Override
        public void run() {
            SUM+=3;
        }
    }

    private static class Consumer implements Runnable{
        @Override
        public void run() {
            SUM--;
            System.out.println("消费了，库存为："+SUM);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<Integer> queue=new MyBlockingQueue<>(100);
        for (int i = 0; i <5 ; i++) {
            final int k=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j <100 ; j++) {
                            queue.put(k*100+j);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        while (true){
            int num=queue.take();
            System.out.println(num);
        }



//        MyBlockingQueue<Runnable> queue=new MyBlockingQueue(100);
//        for (int i = 0; i <5 ; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        while (true){
//                            queue.put(new Producer());
//                            Thread.sleep(1000);
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        }
//        for (int i = 0; i <5 ; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        while (true){
//                            queue.put(new Consumer());
//                            Thread.sleep(1000);
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        }
//        //main线程取出生产、消费的任务
//        while (true){
//            Runnable r=queue.take();
//            r.run();
//        }
    }
}
