package commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @Author:xiang
 * @Date:2020/2/18 20:28
 * 拷贝
 */
public class Commons4 {
    public static void main(String[] args) {
        try{
            //复制文件
            FileUtils.copyFile(new File("p2.jpg"),new File("p4.jpg"));
            //复制文件到目录
            FileUtils.copyFileToDirectory(new File("p2.jpg"),new File("lib"));
            //拷贝URL内容
            String surl="http://www.baidu.com";
            FileUtils.copyURLToFile(new URL(surl),new File("abc.txt"));
            String str=IOUtils.toString(new URL("http://www.baidu.com"),"utf-8");
            System.out.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
