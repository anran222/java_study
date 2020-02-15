package study;

import java.io.File;

/**
 * @Author:xiang
 * @Date:2020/2/12 19:51
 */
public class Demo3 {
    public static void main(String[] args) {
        File src=new File("G:/io_study/t6.jpg");
        System.out.println("名称："+src.getName());
        System.out.println("路径:"+src.getPath());
        System.out.println("绝对路径;"+src.getAbsolutePath());
        System.out.println(src.getParent());
    }
}
