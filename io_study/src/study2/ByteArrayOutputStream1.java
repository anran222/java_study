package study2;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author:xiang
 * @Date:2020/2/16 20:05
 * 字节数组输出流
 */
public class ByteArrayOutputStream1 {
    public static void main(String[] args) {
        byte[] dest=null;
        ByteArrayOutputStream baos=null;
        try{
            baos=new ByteArrayOutputStream();
            String msg="welcome tothe java";
            byte[] datas=msg.getBytes();
            baos.write(datas,0,datas.length);
            baos.flush();
            dest=baos.toByteArray();
            System.out.println(dest.length);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (null!=baos){
                    baos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
