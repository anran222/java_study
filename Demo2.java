package study;

import java.io.File;

/**
 * @Author:xiang
 * @Date:2020/2/12 19:28
 * 构建File对象
 * 相对路径与绝对路径
 * 1、存在盘符：绝对路径
 * 2、不存在盘符：相对路径,当前目录
 */
public class Demo2 {
    public static void main(String[] args) {
        String path="G:/io_study/t6.jpg";
        //绝对路径
        File src=new File(path);
        //相对路径
       src=new File("t6.jpg");
    }
}
