package java0516;

/**
 * @Author:xiang
 * @Date:2020/5/21 14:57
 * 使用实现Runnable的方法创建线程
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}
