package lesson;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/7/18 20:24
 * 复制文件到另一个文件
 */
public class FileCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("D:\\java_study\\bit_study\\java_web\\io-study\\res\\info.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("D:\\java_study\\bit_study\\java_web\\io-study\\res\\infoCopy.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[]  bytes=new byte[1024*8];
        int len;
        while ((len=fis.read(bytes))!=-1){
            bos.write(bytes);
            bos.flush();
        }
    }
}
