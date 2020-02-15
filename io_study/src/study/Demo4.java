package study;

import java.io.File;

/**
 * @Author:xiang
 * @Date:2020/2/12 19:58
 */
public class Demo4 {
    public static void main(String[] args) {
        File src=new File("G:/io_study/t6.jpg");
        //判断是否存在
        System.out.println(src.exists());
        //判断是否是文件
        System.out.println(src.isFile());
        //判断是否是文件夹
        System.out.println(src.isDirectory());
    }
}
