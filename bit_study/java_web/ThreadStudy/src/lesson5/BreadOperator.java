package lesson5;

/**
 * @Author:xiang
 * @Date:2020/7/16 9:42
 */
public class BreadOperator {

    //库存面包数量：上限100，下限0
    public static volatile int SUM;

    public static void main(String[] args) {
        //启动五个生产者线程，生产面包
        for (int i = 0; i <5 ; i++) {
            new Thread(new Producer(),"面包师傅"+i).start();
        }
        //启动消费者线程，消费面包
        for (int i = 0; i <20 ; i++) {
            new Thread(new Consumer(),"消费者"+i).start();
        }
    }
    //默认生产者：面包师傅生产面包，一次生产3个面包,每个面包师傅生产20次
    private static class Producer implements Runnable{
        @Override
        public void run() {
            try {
                for (int i = 0; i <20 ; i++) {
                    synchronized (BreadOperator.class){
                        while (SUM+3>100){//生产完库存大于100是不行的，所以库存在97以上就不能进行了
                            //释放对象锁，需要让其他线程进入同步代码块，当前线程进入一个阻塞状态
                            BreadOperator.class.wait();
                        }
                        SUM+=3;//生产面包
                        Thread.sleep(1000);
                        BreadOperator.class.notifyAll();
                        System.out.println(Thread.currentThread().getName()+",生产了，库存为："+SUM);
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //默认消费者：消费面包，一次消费一个面包，消费者一直消费
    private static class Consumer implements Runnable{
        @Override
        public void run() {
            try {
                while (true){
                    synchronized (BreadOperator.class){
                        while (SUM==0){//库存为0，不能继续消费
                            BreadOperator.class.wait();
                        }
                        SUM--;
                        Thread.sleep(1000);
                        BreadOperator.class.notifyAll();
                        System.out.println(Thread.currentThread().getName()+",消费了，库存为："+SUM);
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
