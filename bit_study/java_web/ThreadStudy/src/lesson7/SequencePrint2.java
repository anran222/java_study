package lesson7;

/**
 * @Author:xiang
 * @Date:2020/7/16 19:36
 */
public class SequencePrint2 {
    private static volatile int INDEX;

    public static void print(String[] array,int count){
        for (int i = 0; i <array.length ; i++) {
            final int k=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j <count ; j++) {
                            synchronized (SequencePrint.class){
                                while (INDEX%array.length!=k){
                                    SequencePrint.class.wait();
                                }
                                INDEX++;
                                System.out.print(array[k]);
                                if (k==array.length-1){
                                    System.out.println();
                                }
                                SequencePrint.class.notifyAll();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        print(new String[]{"A","B","C"},10);
    }
}
