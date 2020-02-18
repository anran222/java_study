package commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/2/18 20:12
 * 读取内容
 */
public class Commons2 {
    public static void main(String[] args) throws IOException {
        //读取文件
        String msg= FileUtils.readFileToString(new File("abc.txt"),"utf-8");
        System.out.println(msg);
        System.out.println("------------");
        byte[] datas=FileUtils.readFileToByteArray(new File("abc.txt"));
        System.out.println(datas.length);
        System.out.println("-------------" );
        List<String> msgs=FileUtils.readLines(new File("abc.txt"),"utf-8");
        for (String string:msgs){
            System.out.println(string);
        }
        System.out.println("-----------");
        LineIterator it=FileUtils.lineIterator(new File("abc.txt"),"utf-8");
        while (it.hasNext()){
            System.out.println(it.nextLine());
        }
    }
}
