package commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @Author:xiang
 * @Date:2020/2/18 19:57
 * 文件和目录的大小
 */
public class Commons1 {
    public static void main(String[] args) {
        //文件的大小
        long len= FileUtils.sizeOf(new File("p2.jpg"));
        //目录大小
        long len2=FileUtils.sizeOf(new File("src"));
        System.out.println(len);
        System.out.println(len2);
    }
}
