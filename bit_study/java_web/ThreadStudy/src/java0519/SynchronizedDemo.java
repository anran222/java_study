package java0519;

/**
 * @Author:xiang
 * @Date:2020/7/10 14:17
 * synchronized关键字的用法
 */
public class SynchronizedDemo {

    //语法1：静态同步方法
    public static synchronized void test1(){

    }

    //语法2：实例同步方法
    public synchronized void test2(){

    }

    public static void main(String[] args) {
        Object o=new Object();
        /*
           1、对象锁：每个对象都有对象头，包含锁
           2、synchronized是获取对象锁的操作
                （1）申请对象锁
                （2）申请成功：
                        a)持有对象锁，进入代码块
                        b)执行代码
                        c)退出代码块归还对象锁
                                    ---->jvm将竞争对象锁失败的线程唤醒
                                    ---->重新唤醒
                                    ---->循环a）和b）
                （3）申请失败：线程进入一个同步队列阻塞
                        jvm管理synchronized竞争失败线程：
                             ---->由运行态转变为阻塞态的方式
                             ---->将线程放到一个同步队列的数据结构中
                             ----->对象锁再次可用的时候，将所有竞争这个对象锁失败的线程唤醒（阻塞态转变为被唤醒状态）
            3、对象：普通的java对象，类对象（jvm把类当做对象来管理）
            4、注意事项：
                    （1）多个线程只有对同一个对象申请对象锁时，才会有同步互斥的作用
                    -----同步互斥：同步代码块，在一个时间点，只有一个线程运行
                    （2）多个线程竞争不同对象的对象锁，不会有同步互斥
            5、静态同步方法、实例同步方法都可以转换为同步代码块的写法
         */
        //语法3：同步代码块
        synchronized (o){

        }
    }
}
