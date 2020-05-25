package java0524;

/**
 * @Author:xiang
 * @Date:2020/5/23 16:10
 * 生产者生产面包，消费者消费面包
 * 1、面包师傅有5个，可以一直生产面包，每次生产3个
 * 2、消费者有20个，可以一直消费面包，每次消费1个
 * 3、面包店库存上限100,下限是0
 */
public class SignalTest {

    //库存
    private static int SUM;

    public static void main(String[] args) {
        //5个面包师傅同时启动
        for (int i = 0; i <5 ; i++) {
            new Thread(()->{
                try {
                    while (true){
                        synchronized (SignalTest.class){
                            while (SUM+5>100){
                                SignalTest.class.wait();
                            }
                                SUM += 5;
                                System.out.println(Thread.currentThread().getName() + "生产了面包,库存：" + SUM);
                                SignalTest.class.notify();
                        }
                        Thread.sleep(200);
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"面包师傅"+i).start();
        }
        //20个消费者同时启动
        for (int i = 0; i <20 ; i++) {
            new Thread(()->{
                try {
                    while (true){
                        synchronized (SignalTest.class){
                            while (SUM-3<0){
                                SignalTest.class.wait();
                            }
                                SUM-=3;
                                System.out.println(Thread.currentThread().getName()+"消费者消费了面包，库存："+SUM);
                                SignalTest.class.notify();
                        }
                        Thread.sleep(200);
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"消费者"+i).start();
        }
    }
}
