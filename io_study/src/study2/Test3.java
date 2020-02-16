package study2;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/2/16 15:24
 * io第一个程序:操作步骤
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 */
public class Test3 {
    public static void main(String[] args) {
//        1、创建源
        File src=new File("abc.txt");
        InputStream is=null;//2、选择流
        try {
            is = new FileInputStream(src);
            //3、操作
            byte[] car=new byte[5];//缓冲容器
            int len=-1;//接收长度
            while ((len=is.read(car))!=-1){
                //字节数组转换为字符串
                String str=new String(car,0,len);
                System.out.println(str);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();;
        }finally {
            try{
                //4、释放资源
                if (null!=is) {
                    is.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

