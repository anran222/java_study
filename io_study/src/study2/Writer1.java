package study2;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/2/16 17:00
 * 字符输出流
 */
public class Writer1 {
    public static void main(String[] args) {
        File dest=new File("dest.txt");
        Writer writer=null;
        try{
            writer=new FileWriter(dest);
            String msg="在田野上奔跑";
            char[] datas=msg.toCharArray();
            writer.write(datas,0,datas.length);
            writer.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (null!=writer){
                    writer.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
