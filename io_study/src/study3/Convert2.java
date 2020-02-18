package study3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @Author:xiang
 * @Date:2020/2/17 15:12
 * //操作网络流，下载百度源代码
 */
public class Convert2 {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(new URL("http://www.baidu.com").openStream(),"utf-8"));
            String msg;
            while ((msg=reader.readLine())!=null){
                System.out.println(msg);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
