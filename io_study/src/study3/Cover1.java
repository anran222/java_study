package study3;

import java.io.*;
import java.net.URL;

/**
 * @Author:xiang
 * @Date:2020/2/17 15:00
 * 转换流
 * 以字符流操作字节流
 */
public class Cover1 {
    public static void main(String[] args) {
        BufferedReader reader=null;
        BufferedWriter writer=null;
        try{
            reader=new BufferedReader(new InputStreamReader(System.in));
            writer=new BufferedWriter(new OutputStreamWriter(System.out));
            String msg="";
            while (!msg.equals("exit")){
                msg=reader.readLine();
                writer.write(msg);
                writer.newLine();
                writer.flush();
            }
        }catch (IOException E){
            E.printStackTrace();
        }
    }
}
