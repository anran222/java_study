package lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author:xiang
 * @Date:2020/7/18 20:09
 */
public class FileOperatorTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(new File("D:\\java_study\\bit_study\\java_web\\io-study\\res\\info.txt"));
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fis.read(bytes,0,1024))!=-1){
            String str=new String(bytes,0,len);
            System.out.println(str);
        }
    }
}
