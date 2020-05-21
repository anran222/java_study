package java0516;

/**
 * @Author:xiang
 * @Date:2020/5/21 14:54
 * 使用继承Thread的方法创建线程
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
