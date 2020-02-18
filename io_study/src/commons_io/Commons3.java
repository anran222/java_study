package commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @Author:xiang
 * @Date:2020/2/18 20:21
 * 写出内容
 */
public class Commons3 {
    public static void main(String[] args) throws IOException {
        FileUtils.write(new File("ddd.txt"),"欢迎来到java世界","utf-8",true);
    }
}
