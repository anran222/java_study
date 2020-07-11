package java0521;

/**
 * @Author:xiang
 * @Date:2020/7/10 21:30
 * 单例模式：在某些场景下，需要获取同一个对象
 */
public class Singleton {

    //饿汉式：在类加载的时候，就创建对象
    public static Singleton SINGLETON=new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return SINGLETON;
    }

    //懒汉式：不保证线程安全
    public static Singleton SING_LETON2;

    //省略了构造方法：存在效率低的问题
    public static Singleton getInstance2(){
        if (SING_LETON2==null) {
            SING_LETON2 = new Singleton();
        }
            return SING_LETON2;
    }
}
