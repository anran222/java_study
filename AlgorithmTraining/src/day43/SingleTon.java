package day43;
/*
 *@Author:anran
 *@Date:2020/10/1
 *@Version 1.0
 * 单例模式：双重校验锁
 */

public class SingleTon {
    private static volatile SingleTon instance;

    private SingleTon(){};

    public static SingleTon getInstance(){
        if (instance==null){
            synchronized (SingleTon.class){
                if (instance==null){
                    instance=new SingleTon();
                }
            }
        }
        return instance;
    }
}
