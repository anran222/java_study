package study2;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/2/16 16:25
 * 文件拷贝
 */
public class CopyFile{
    public static void main(String[] args) {
        copy("t6.pg","p2.jpg");
    }
        public static void copy(String srcPath,String destPath){
        File src=new File(srcPath);
        File dest=new File(destPath);
        InputStream is=null;
        OutputStream os=null;
        try{
            is= new FileInputStream(src);
            os= new FileOutputStream(dest);
            byte[] flush=new byte[1024];
            int len=-1;
            while ((len=is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(null!=os){
                    os.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
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
