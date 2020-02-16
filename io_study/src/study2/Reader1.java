package study2;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/2/16 16:51
 * 字符输入流
 */
public class Reader1 {
    public static void main(String[] args) {
        File src=new File("abc.txt");
        Reader reader=null;
        try{
            reader=new FileReader(src);
            char[] flush=new char[1024];
            int len=-1;
            while((len=reader.read(flush))!=-1){
                String str=new String(flush,0,len);
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (null!=reader){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
