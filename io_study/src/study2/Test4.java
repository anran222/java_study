package study2;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/2/16 16:00
 * 文件字节输出流
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 */
public class Test4 {
    public static void main(String[] args) {
        //1、创建源
        File src=new File("dec.txt");
        OutputStream os=null;
        try{
            os=new FileOutputStream(src);
            //3、操作
            String msg="io is easy";
            byte[] datas=msg.getBytes();
            os.write(datas,0,datas.length);
            os.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (null == os) {
                    os.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
