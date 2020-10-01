package day43;
/*
 *@Author:anran
 *@Date:2020/10/1
 *@Version 1.0
 */

public class SingleTon2 {
    private static SingleTon2 instance=new SingleTon2();

    private SingleTon2(){};

    public static SingleTon2 getInstance(){
        return instance;
    }
}
