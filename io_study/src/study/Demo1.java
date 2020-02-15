package study;

import java.io.File;

/**
 * @Author:xiang
 * @Date:2020/2/12 19:28
 * 构建File对象
 */
public class Demo1 {
    public static void main(String[] args) {
        String path="G:/io_study/t6.jpg";
        File src=new File(path);
        System.out.println(src.length());

    }
}
