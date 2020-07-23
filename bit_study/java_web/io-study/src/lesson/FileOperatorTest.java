package lesson;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/7/18 19:28
 * 测试io流
 */
public class FileOperatorTest {
    public static void main(String[] args) throws IOException {
        //字节流转换为字符流，需要使用字节字符转换流
        //InputStreamReader:输入的字节字符转换流，或OutputStreamWriter：输出的字节字符转换流
        FileInputStream fis=new FileInputStream(new File("D:\\java_study\\bit_study\\java_web\\io-study\\res\\info.txt"));
        BufferedReader br=new BufferedReader(new InputStreamReader(fis,"UTF-8"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
