package day43;
/*
 *@Author:anran
 *@Date:2020/10/1
 *@Version 1.0
 * 单例模式：懒汉式
 */

public class SingleTon1 {
    private static SingleTon1 instance;

    private SingleTon1(){};

    public static SingleTon1 getInstance(){
        if (instance==null){
            instance=new SingleTon1();
        }
        return instance;
    }
}
