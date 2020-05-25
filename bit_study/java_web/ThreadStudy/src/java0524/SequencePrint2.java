package java0524;

/**
 * @Author:xiang
 * @Date:2020/5/25 17:12
 * 三个线程
 * A第一个线程只能打印A，第二个线程只能打印B，第三个线程只能打印C
 * 要求打印结果ABC
 */

public class SequencePrint2 {
    static class PrintA extends Thread{
        private Thread t=null;
        public PrintA(){
        }
        public PrintA(Thread t){
            this.t=t;
        }
        @Override
        public void run() {
            try {
                if (t != null) {
                    t.join();
                }
                System.out.print("A");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class PrintB extends Thread{
        private Thread t=null;
        public PrintB(){
        }
        public PrintB(Thread t){
            this.t=t;
        }
        @Override
        public void run() {
            try {
                if (t != null) {
                    t.join();
                    System.out.print("B");
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class PrintC extends Thread{
        private Thread t=null;
        public PrintC(){
        }
        public PrintC(Thread t){
            this.t=t;
        }
        @Override
        public void run() {
            try {
                if (t != null) {
                    t.join();
                    System.out.print("C");
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new PrintA(null));
        Thread t2=new Thread(new PrintB(t1));
        Thread t3=new Thread(new PrintC(t2));
        t1.start();
        t2.start();
        t3.start();
    }
}
