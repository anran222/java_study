package study2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:xiang
 * @Date:2020/2/16 19:57
 */
public class ByteArrayInpurStream1 {
    public static void main(String[] args) {
        byte[] src="welcome to thejava".getBytes();
        InputStream is=null;
        try{
            is=new ByteArrayInputStream(src);
            byte[] flush=new byte[1024];
            int len=-1;
            while ((len=is.read(flush))!=-1){
                String str=new String(flush,0,len);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (null!=is){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
